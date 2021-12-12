diff --git a/core/src/test/java/tachyon/LocalMiniDFSCluster.java b/core/src/test/java/tachyon/LocalMiniDFSCluster.java
index b88fe58..cfffa7c 100644
--- a/core/src/test/java/tachyon/LocalMiniDFSCluster.java
+++ b/core/src/test/java/tachyon/LocalMiniDFSCluster.java
@@ -195,7 +195,7 @@
     if (!mIsStarted) {
 
       delete(mBaseDir, true);
-      if (mkdirs(mBaseDir)) {
+      if (!mkdirs(mBaseDir)) {
         throw new IOException("Failed to make folder: " + mBaseDir);
       }
 
