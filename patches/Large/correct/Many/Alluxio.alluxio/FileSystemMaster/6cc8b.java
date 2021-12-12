diff --git a/servers/src/main/java/tachyon/master/file/FileSystemMaster.java b/servers/src/main/java/tachyon/master/file/FileSystemMaster.java
index 632f736..f7ca2fe 100644
--- a/servers/src/main/java/tachyon/master/file/FileSystemMaster.java
+++ b/servers/src/main/java/tachyon/master/file/FileSystemMaster.java
@@ -1340,7 +1340,7 @@
       throws FileAlreadyExistsException, InvalidPathException, IOException {
     synchronized (mInodeTree) {
       if (mountInternal(tachyonPath, ufsPath)) {
-        boolean loadMetadataSuceeded = true;
+        boolean loadMetadataSuceeded = false;
         try {
           // This will create the directory at tachyonPath
           loadMetadataDirectory(tachyonPath, false);
