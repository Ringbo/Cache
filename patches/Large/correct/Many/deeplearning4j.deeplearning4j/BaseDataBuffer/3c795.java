diff --git a/nd4j-api/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java b/nd4j-api/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java
index 6ebca3d..1ac1214 100644
--- a/nd4j-api/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java
+++ b/nd4j-api/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java
@@ -110,7 +110,7 @@
             }
         }
         else {
-            wrappedBuffer =  ByteBuffer.allocateDirect(4 * data.length);
+            wrappedBuffer =  ByteBuffer.allocateDirect(8 * data.length);
             wrappedBuffer.order(ByteOrder.nativeOrder());
             DoubleBuffer buffer = wrappedBuffer.asDoubleBuffer();
             for(int i = 0; i < data.length; i++) {
