diff --git a/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/DataFile.java b/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/DataFile.java
index 06a6962..af5b122 100644
--- a/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/DataFile.java
+++ b/activemq-core/src/main/java/org/apache/activemq/kaha/impl/async/DataFile.java
@@ -85,7 +85,7 @@
         return result;
     }
 
-    public RandomAccessFile openRandomAccessFile(boolean appender) throws IOException {
+    public synchronized RandomAccessFile openRandomAccessFile(boolean appender) throws IOException {
         RandomAccessFile rc = new RandomAccessFile(file, "rw");
         // When we start to write files size them up so that the OS has a chance
         // to allocate the file contigously.
@@ -97,7 +97,7 @@
         return rc;
     }
 
-    public void closeRandomAccessFile(RandomAccessFile file) throws IOException {
+    public synchronized void closeRandomAccessFile(RandomAccessFile file) throws IOException {
         // On close set the file size to the real size.
         if (length != file.length()) {
             file.setLength(getLength());
