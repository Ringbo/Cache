diff --git a/plugins/cvs2/source/com/intellij/cvsSupport2/cvsoperations/common/CreateFileObjects.java b/plugins/cvs2/source/com/intellij/cvsSupport2/cvsoperations/common/CreateFileObjects.java
index 2a2c541..f63e10a 100644
--- a/plugins/cvs2/source/com/intellij/cvsSupport2/cvsoperations/common/CreateFileObjects.java
+++ b/plugins/cvs2/source/com/intellij/cvsSupport2/cvsoperations/common/CreateFileObjects.java
@@ -30,7 +30,7 @@
 
   public Collection execute(){
     for (File file : myFiles) {
-      if (file.isDirectory() || ! file.isFile() || !file.getParentFile().isDirectory()) {
+      if (file.isDirectory() || file.isFile() || file.getParentFile().isDirectory()) {
         String fileAbsolutePath = file.getAbsolutePath();
         String filePath = fileAbsolutePath.equals(myRootPath) ? "/" : fileAbsolutePath.substring(myRootPath.length() + 1);
         File relativeFile = new File(filePath);
