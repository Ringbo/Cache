diff --git a/logback-core/src/main/java/ch/qos/logback/core/FileAppender.java b/logback-core/src/main/java/ch/qos/logback/core/FileAppender.java
index 38f55ee..38b3b9b 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/FileAppender.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/FileAppender.java
@@ -105,7 +105,7 @@
       addInfo("File property is set to [" + fileName + "]");
 
       if (prudent) {
-        if (isAppend() == false) {
+        if (!isAppend()) {
           setAppend(true);
           addWarn("Setting \"Append\" property to true on account of \"Prudent\" mode");
         }
@@ -139,15 +139,8 @@
    * <b>Do not use this method directly. To configure a FileAppender or one of
    * its subclasses, set its properties one by one and then call start().</b>
    * 
-   * @param filename
+   * @param file_name
    *          The path to the log file.
-   * @param append
-   *          If true will append to fileName. Otherwise will truncate fileName.
-   * @param bufferedIO
-   * @param bufferSize
-   * 
-   * @throws IOException
-   * 
    */
   public void openFile(String file_name) throws IOException {
     synchronized (lock) {
@@ -190,7 +183,7 @@
     this.append = append;
   }
 
-  final private void safeWrite(E event) throws IOException {
+  private void safeWrite(E event) throws IOException {
     ResilientFileOutputStream resilientFOS = (ResilientFileOutputStream) getOutputStream();
     FileChannel fileChannel = resilientFOS.getChannel();
     if (fileChannel == null) {
