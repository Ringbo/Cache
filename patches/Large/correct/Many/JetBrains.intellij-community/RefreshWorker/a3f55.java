diff --git a/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/RefreshWorker.java b/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/RefreshWorker.java
index 6dcefd6..eb9fba4 100644
--- a/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/RefreshWorker.java
+++ b/platform/platform-impl/src/com/intellij/openapi/vfs/newvfs/persistent/RefreshWorker.java
@@ -113,7 +113,7 @@
           for (VirtualFile child : file.getChildren()) {
             if (!deletedNames.contains(child.getName())) {
               final FileAttributes childAttributes = fs.getAttributes(child);
-              if (attributes != null) {
+              if (childAttributes != null) {
                 checkAndScheduleChildRefresh(file, child, childAttributes);
               }
               else {
