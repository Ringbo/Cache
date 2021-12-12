diff --git a/plugins/cvs2/source/com/intellij/cvsSupport2/javacvsImpl/io/ReceiveTextFilePreprocessor.java b/plugins/cvs2/source/com/intellij/cvsSupport2/javacvsImpl/io/ReceiveTextFilePreprocessor.java
index 75c42a7..483e5ad 100644
--- a/plugins/cvs2/source/com/intellij/cvsSupport2/javacvsImpl/io/ReceiveTextFilePreprocessor.java
+++ b/plugins/cvs2/source/com/intellij/cvsSupport2/javacvsImpl/io/ReceiveTextFilePreprocessor.java
@@ -26,7 +26,7 @@
   }
 
   public void copyTextFileToLocation(File textFileSource, File targetFile, IReaderFactory readerFactory) throws IOException {
-    VirtualFile virtualFile = CvsVfsUtil.refreshAndFindFileByIoFile(targetFile);
+    VirtualFile virtualFile = CvsVfsUtil.findFileByIoFile(targetFile);
     if (myReceivedFileProcessor.shouldProcess(virtualFile, targetFile)) {
       PrintStream target = new PrintStream(new BufferedOutputStream(new FileOutputStream(targetFile)));
       try {
