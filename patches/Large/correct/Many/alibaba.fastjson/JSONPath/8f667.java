diff --git a/src/main/java/com/alibaba/fastjson/JSONPath.java b/src/main/java/com/alibaba/fastjson/JSONPath.java
index 146dac4..d8912d4 100644
--- a/src/main/java/com/alibaba/fastjson/JSONPath.java
+++ b/src/main/java/com/alibaba/fastjson/JSONPath.java
@@ -1703,7 +1703,7 @@
         boolean isDoubleA = isDouble(clazzA);
         boolean isDoubleB = isDouble(clazzB);
 
-        if ((isDoubleA && isDoubleB) || (isDoubleA && isIntA) || (isDoubleB && isIntA)) {
+        if ((isDoubleA && isDoubleB) || (isDoubleA && isIntB) || (isDoubleB && isIntA)) {
             return a.doubleValue() == b.doubleValue();
         }
         
