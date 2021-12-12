diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/indexing/conditions/NotEqualsCondition.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/indexing/conditions/NotEqualsCondition.java
index ad0b425..a67cdc6 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/indexing/conditions/NotEqualsCondition.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/indexing/conditions/NotEqualsCondition.java
@@ -48,9 +48,9 @@
     @Override
     public Boolean apply(Number input) {
         if (Nd4j.dataType() == DataBuffer.Type.DOUBLE)
-            return input.doubleValue() == value.doubleValue();
+            return input.doubleValue() != value.doubleValue();
         else
-            return input.floatValue() == value.floatValue();
+            return input.floatValue() != value.floatValue();
     }
 
     @Override
