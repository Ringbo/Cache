diff --git a/core/src/main/java/tachyon/client/TachyonFS.java b/core/src/main/java/tachyon/client/TachyonFS.java
index a7dc3ea..0dd6e6d 100644
--- a/core/src/main/java/tachyon/client/TachyonFS.java
+++ b/core/src/main/java/tachyon/client/TachyonFS.java
@@ -257,18 +257,18 @@
 
   /**
    * Create a user UnderFileSystem temporary folder and return it
-   * 
+   * @param ufsConf the configuration of UnderFileSystem
    * @return the UnderFileSystem temporary folder
    * @throws IOException
    */
-  synchronized String createAndGetUserUfsTempFolder() throws IOException {
+  synchronized String createAndGetUserUfsTempFolder(Object ufsConf) throws IOException {
     String tmpFolder = mWorkerClient.getUserUfsTempFolder();
     if (tmpFolder == null) {
       return null;
     }
 
     if (mUnderFileSystem == null) {
-      mUnderFileSystem = UnderFileSystem.get(tmpFolder);
+      mUnderFileSystem = UnderFileSystem.get(tmpFolder, ufsConf);
     }
 
     mUnderFileSystem.mkdirs(tmpFolder, true);
