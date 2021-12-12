diff --git a/core/client/src/main/java/alluxio/hadoop/AbstractFileSystem.java b/core/client/src/main/java/alluxio/hadoop/AbstractFileSystem.java
index 24ccf49..d17236c 100644
--- a/core/client/src/main/java/alluxio/hadoop/AbstractFileSystem.java
+++ b/core/client/src/main/java/alluxio/hadoop/AbstractFileSystem.java
@@ -249,7 +249,7 @@
       mFileSystem.delete(uri, options);
       return true;
     } catch (InvalidPathException | FileDoesNotExistException e) {
-      LOG.error("delete failed: {}", e.getMessage());
+      LOG.warn("delete failed: {}", e.getMessage());
       return false;
     } catch (AlluxioException e) {
       throw new IOException(e);
@@ -656,7 +656,7 @@
     try {
       mFileSystem.rename(srcPath, dstPath);
     } catch (FileDoesNotExistException e) {
-      LOG.error("Failed to rename {} to {}", src, dst);
+      LOG.warn("rename failed: {}", e.getMessage());
       return false;
     } catch (AlluxioException e) {
       ensureExists(srcPath);
@@ -664,14 +664,14 @@
       try {
         dstStatus = mFileSystem.getStatus(dstPath);
       } catch (IOException | AlluxioException e2) {
-        LOG.error("Failed to rename {} to {}", src, dst);
+        LOG.warn("rename failed: {}", e.getMessage());
         return false;
       }
       // If the destination is an existing folder, try to move the src into the folder
       if (dstStatus != null && dstStatus.isFolder()) {
         dstPath = dstPath.join(srcPath.getName());
       } else {
-        LOG.error("Failed to rename {} to {}", src, dst);
+        LOG.warn("rename failed: {}", e.getMessage());
         return false;
       }
       try {
