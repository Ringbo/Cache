diff --git a/src/eu/alefzero/owncloud/ui/activity/FileDisplayActivity.java b/src/eu/alefzero/owncloud/ui/activity/FileDisplayActivity.java
index 07ca6f5..98c64bf 100644
--- a/src/eu/alefzero/owncloud/ui/activity/FileDisplayActivity.java
+++ b/src/eu/alefzero/owncloud/ui/activity/FileDisplayActivity.java
@@ -615,7 +615,7 @@
             setSupportProgressBarIndeterminateVisibility(inProgress);
             
             long OCDirId = intent.getLongExtra(FileSyncService.SYNC_FOLDER, -1);
-            if (OCDirId > 0) {
+            if (OCDirId >= 0) {
                 OCFile syncDir = mStorageManager.getFileById(OCDirId);
                 if (syncDir != null && (
                         (mCurrentDir == null && syncDir.getFileName().equals("/")) ||
