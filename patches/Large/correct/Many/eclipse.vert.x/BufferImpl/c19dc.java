diff --git a/src/main/java/io/vertx/core/buffer/impl/BufferImpl.java b/src/main/java/io/vertx/core/buffer/impl/BufferImpl.java
index f91c5bf..5845029 100644
--- a/src/main/java/io/vertx/core/buffer/impl/BufferImpl.java
+++ b/src/main/java/io/vertx/core/buffer/impl/BufferImpl.java
@@ -36,7 +36,7 @@
 
   private ByteBuf buffer;
 
-  BufferImpl() {
+  public BufferImpl() {
     this(0);
   }
 
