diff --git a/src/main/java/io/vertx/core/file/impl/AsyncFileImpl.java b/src/main/java/io/vertx/core/file/impl/AsyncFileImpl.java
index 3d3c48c..b784a5d 100644
--- a/src/main/java/io/vertx/core/file/impl/AsyncFileImpl.java
+++ b/src/main/java/io/vertx/core/file/impl/AsyncFileImpl.java
@@ -174,7 +174,7 @@
   }
 
   @Override
-  public AsyncFile write(Buffer buffer) {
+  public synchronized AsyncFile write(Buffer buffer) {
     int length = buffer.length();
     doWrite(buffer, writePos, null);
     writePos += length;
