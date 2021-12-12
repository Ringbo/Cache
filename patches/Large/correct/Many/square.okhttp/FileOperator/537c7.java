diff --git a/okhttp/src/main/java/okhttp3/internal/cache2/FileOperator.java b/okhttp/src/main/java/okhttp3/internal/cache2/FileOperator.java
index 7091422..b1326cd 100644
--- a/okhttp/src/main/java/okhttp3/internal/cache2/FileOperator.java
+++ b/okhttp/src/main/java/okhttp3/internal/cache2/FileOperator.java
@@ -41,7 +41,7 @@
   private final ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
   private final FileChannel fileChannel;
 
-  public FileOperator(FileChannel fileChannel) {
+  FileOperator(FileChannel fileChannel) {
     this.fileChannel = fileChannel;
   }
 
