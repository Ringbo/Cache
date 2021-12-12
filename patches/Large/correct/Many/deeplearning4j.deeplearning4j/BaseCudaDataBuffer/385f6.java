diff --git a/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/buffer/BaseCudaDataBuffer.java b/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/buffer/BaseCudaDataBuffer.java
index 445fe66..edca133 100644
--- a/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/buffer/BaseCudaDataBuffer.java
+++ b/nd4j-backends/nd4j-backend-impls/nd4j-cuda-7.5/src/main/java/org/nd4j/linalg/jcublas/buffer/BaseCudaDataBuffer.java
@@ -677,7 +677,7 @@
             length = s.readInt();
             Type t = Type.valueOf(s.readUTF());
             //        log.info("Restoring buffer ["+t+"] of length ["+ length+"]");
-            if (t != globalType)
+            if (t != globalType && t!= Type.INT)
                 log.warn("Loading a data stream with type different from what is set globally. Expect precision loss");
             if(t == Type.INT) {
                 this.elementSize = 4;
