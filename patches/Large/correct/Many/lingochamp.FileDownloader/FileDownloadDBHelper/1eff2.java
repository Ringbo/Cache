diff --git a/library/src/main/java/com/liulishuo/filedownloader/services/FileDownloadDBHelper.java b/library/src/main/java/com/liulishuo/filedownloader/services/FileDownloadDBHelper.java
index df53ecc..e313aea 100644
--- a/library/src/main/java/com/liulishuo/filedownloader/services/FileDownloadDBHelper.java
+++ b/library/src/main/java/com/liulishuo/filedownloader/services/FileDownloadDBHelper.java
@@ -74,12 +74,15 @@
                 model.setETag(c.getString(c.getColumnIndex(FileDownloadModel.ETAG)));
                 if (model.getStatus() == FileDownloadStatus.progress ||
                         model.getStatus() == FileDownloadStatus.connected ||
-                        model.getStatus() == FileDownloadStatus.error) {
-                    // 保证断点续传可以覆盖到
+                        model.getStatus() == FileDownloadStatus.error ||
+                        (model.getStatus() == FileDownloadStatus.pending && model.getSoFar() > 0)
+                        ) {
+                    // Ensure can be covered by RESUME FROM BREAKPOINT.
                     model.setStatus(FileDownloadStatus.paused);
                 }
 
 
+                // consider check in new thread, but SQLite lock | file lock aways effect, so sync
                 if (model.getStatus() == FileDownloadStatus.paused &&
                         FileDownloadMgr.checkBreakpointAvailable(model.getId(), model,
                                 model.getPath())) {
@@ -99,13 +102,16 @@
                     }
                 }
 
-                // consider check in new thread, but SQLite lock | file lock aways effect, so sync
-                if (model.getStatus() == FileDownloadStatus.pending) {
+                /**
+                 * Remove {@code model} from DB if it can't used for judging whether the
+                 * old-downloaded file is valid for reused & it can't used for resuming from
+                 * BREAKPOINT, In other words, {@code model} is no use anymore for FileDownloader.
+                 */
+                if (model.getStatus() == FileDownloadStatus.pending && model.getSoFar() <= 0) {
+                    // This model is redundant.
                     dirtyList.add(model.getId());
                 } else if (!FileDownloadMgr.checkReuse(model.getId(), model) &&
                         !FileDownloadMgr.checkBreakpointAvailable(model.getId(), model)) {
-                    // can't reuse old file & can't resume form break point
-                    // = dirty
                     dirtyList.add(model.getId());
                 } else {
                     downloaderModelMap.put(model.getId(), model);
