diff --git a/nd4j-buffer/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java b/nd4j-buffer/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java
index 88f39de..1354c18 100644
--- a/nd4j-buffer/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java
+++ b/nd4j-buffer/src/main/java/org/nd4j/linalg/api/buffer/BaseDataBuffer.java
@@ -1228,7 +1228,7 @@
                 elementSize = 8;
             else if(currentType == Type.FLOAT || currentType == Type.INT)
                 elementSize = 4;
-            if (currentType != globalType && currenType != Type.INT)
+            if (currentType != globalType && currentType != Type.INT)
                 log.warn("Loading a data stream with type different from what is set globally. Expect precision loss");
             pointerIndexerByGlobalType(currentType);
             if (currentType == Type.DOUBLE) {
