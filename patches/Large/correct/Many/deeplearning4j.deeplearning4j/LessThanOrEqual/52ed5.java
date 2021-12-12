diff --git a/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/comparison/LessThanOrEqual.java b/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/comparison/LessThanOrEqual.java
index ab2bb4f..947834d 100644
--- a/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/comparison/LessThanOrEqual.java
+++ b/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/transforms/comparison/LessThanOrEqual.java
@@ -24,7 +24,7 @@
 
 /**
  * Bit mask over the ndarrays as to whether
- * the components are equal or not
+ * the components are less than or equal or not
  *
  * @author Adam Gibson
  */
@@ -47,36 +47,36 @@
 
     @Override
     public String name() {
-        return "lt";
+        return "lte";
     }
 
     @Override
     public IComplexNumber op(IComplexNumber origin, double other) {
         if (origin.isReal())
-            return origin.realComponent().doubleValue() < other ? Nd4j.createComplexNumber(1.0, 0.0) : Nd4j.createComplexNumber(0.0, 0.0);
+            return origin.realComponent().doubleValue() <= other ? Nd4j.createComplexNumber(1.0, 0.0) : Nd4j.createComplexNumber(0.0, 0.0);
         return Nd4j.createComplexNumber(0.0, 0.0);
     }
 
     @Override
     public IComplexNumber op(IComplexNumber origin, float other) {
         if (origin.isReal())
-            return origin.realComponent().doubleValue() < other ? Nd4j.createComplexNumber(1.0, 0.0) : Nd4j.createComplexNumber(0.0, 0.0);
+            return origin.realComponent().doubleValue() <= other ? Nd4j.createComplexNumber(1.0, 0.0) : Nd4j.createComplexNumber(0.0, 0.0);
         return Nd4j.createComplexNumber(0.0, 0.0);
     }
 
     @Override
     public IComplexNumber op(IComplexNumber origin, IComplexNumber other) {
-        return origin.equals(other) ? Nd4j.createComplexNumber(1.0, 0.0) : Nd4j.createComplexNumber(0.0, 0.0);
+        return (origin.lt(other).eq(Nd4j.createComplexNumber(1.0, 0.0))||origin.eq(other)) ? Nd4j.createComplexNumber(1.0, 0.0) : Nd4j.createComplexNumber(0.0, 0.0);
     }
 
     @Override
     public float op(float origin, float other) {
-        return origin < other ? 1.0f : 0.0f;
+        return origin <= other ? 1.0f : 0.0f;
     }
 
     @Override
     public double op(double origin, double other) {
-        return origin < other ? 1.0 : 0.0;
+        return origin <= other ? 1.0 : 0.0;
     }
 
     @Override
