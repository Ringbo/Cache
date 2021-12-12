diff --git a/src/main/java/io/vertx/core/file/impl/AsyncFileImpl.java b/src/main/java/io/vertx/core/file/impl/AsyncFileImpl.java
index 4dd28cf..e748c8b 100644
--- a/src/main/java/io/vertx/core/file/impl/AsyncFileImpl.java
+++ b/src/main/java/io/vertx/core/file/impl/AsyncFileImpl.java
@@ -170,7 +170,7 @@
   }
 
   @Override
-  public AsyncFile write(Buffer buffer) {
+  public synchronized AsyncFile write(Buffer buffer) {
     int length = buffer.length();
     doWrite(buffer, writePos, null);
     writePos += length;
