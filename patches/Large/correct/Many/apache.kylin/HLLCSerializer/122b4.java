diff --git a/core-metadata/src/main/java/org/apache/kylin/measure/hllc/HLLCSerializer.java b/core-metadata/src/main/java/org/apache/kylin/measure/hllc/HLLCSerializer.java
index 9310864..9ad1695 100644
--- a/core-metadata/src/main/java/org/apache/kylin/measure/hllc/HLLCSerializer.java
+++ b/core-metadata/src/main/java/org/apache/kylin/measure/hllc/HLLCSerializer.java
@@ -85,7 +85,7 @@
         int registerIndexSize = current().getRegisterIndexSize();
         int m = 1 << precision;
         if (!current().isDense((int) averageNumOfElementsInCounter)
-                || averageNumOfElementsInCounter < (m - 5) / (1 + registerIndexSize)) {
+                || averageNumOfElementsInCounter < (m - 5d) / (1d + registerIndexSize)) {
             // 5 = 1 + 4 for scheme and size
             // size * (getRegisterIndexSize + 1)
             return 5 + averageNumOfElementsInCounter * (registerIndexSize + 1);
