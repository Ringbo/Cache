diff --git a/core/client/fs/src/main/java/alluxio/client/file/FileSystemUtils.java b/core/client/fs/src/main/java/alluxio/client/file/FileSystemUtils.java
index ebe31f4..6da189e 100644
--- a/core/client/fs/src/main/java/alluxio/client/file/FileSystemUtils.java
+++ b/core/client/fs/src/main/java/alluxio/client/file/FileSystemUtils.java
@@ -94,7 +94,7 @@
           throws IOException, AlluxioException, InterruptedException {
 
     final long deadline = System.currentTimeMillis() + tunit.toMillis(timeout);
-    final long pollPeriod = Configuration.getLong(PropertyKey.USER_FILE_WAITCOMPLETED_POLL_MS);
+    final long pollPeriod = Configuration.getMs(PropertyKey.USER_FILE_WAITCOMPLETED_POLL_MS);
     boolean completed = false;
     long timeleft = deadline - System.currentTimeMillis();
 
