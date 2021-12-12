diff --git a/imagepipeline/src/main/java/com/facebook/imagepipeline/producers/LocalFetchProducer.java b/imagepipeline/src/main/java/com/facebook/imagepipeline/producers/LocalFetchProducer.java
index 2ccb13f..0ca77a8 100644
--- a/imagepipeline/src/main/java/com/facebook/imagepipeline/producers/LocalFetchProducer.java
+++ b/imagepipeline/src/main/java/com/facebook/imagepipeline/producers/LocalFetchProducer.java
@@ -93,7 +93,7 @@
       int length) throws IOException {
     CloseableReference<PooledByteBuffer> ref = null;
     try {
-      if (length < 0) {
+      if (length <= 0) {
         ref = CloseableReference.of(mPooledByteBufferFactory.newByteBuffer(inputStream));
       } else {
         ref = CloseableReference.of(mPooledByteBufferFactory.newByteBuffer(inputStream, length));
