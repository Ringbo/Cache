diff --git a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/scalar/ScalarMin.java b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/scalar/ScalarMin.java
index f283349..2498400 100644
--- a/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/scalar/ScalarMin.java
+++ b/nd4j-backends/nd4j-api-parent/nd4j-api/src/main/java/org/nd4j/linalg/api/ops/impl/scalar/ScalarMin.java
@@ -58,55 +58,55 @@
 
     @Override
     public String name() {
-        return "max_scalar";
+        return "min_scalar";
     }
 
     @Override
     public IComplexNumber op(IComplexNumber origin, double other) {
-        if (origin.absoluteValue().doubleValue() > complexNumber.absoluteValue().doubleValue())
+        if (origin.absoluteValue().doubleValue() < complexNumber.absoluteValue().doubleValue())
             return origin;
         return complexNumber;
     }
 
     @Override
     public IComplexNumber op(IComplexNumber origin, float other) {
-        if (origin.absoluteValue().doubleValue() > complexNumber.absoluteValue().doubleValue())
+        if (origin.absoluteValue().doubleValue() < complexNumber.absoluteValue().doubleValue())
             return origin;
         return complexNumber;
     }
 
     @Override
     public IComplexNumber op(IComplexNumber origin, IComplexNumber other) {
-        if (origin.absoluteValue().doubleValue() > complexNumber.absoluteValue().doubleValue())
+        if (origin.absoluteValue().doubleValue() < complexNumber.absoluteValue().doubleValue())
             return origin;
         return complexNumber;
     }
 
     @Override
     public float op(float origin, float other) {
-        return FastMath.max(origin, num.floatValue());
+        return FastMath.min(origin, num.floatValue());
     }
 
     @Override
     public double op(double origin, double other) {
-        return FastMath.max(origin, num.doubleValue());
+        return FastMath.min(origin, num.doubleValue());
     }
 
     @Override
     public double op(double origin) {
-        return FastMath.max(origin, num.doubleValue());
+        return FastMath.min(origin, num.doubleValue());
 
     }
 
     @Override
     public float op(float origin) {
-        return FastMath.max(origin, num.floatValue());
+        return FastMath.min(origin, num.floatValue());
 
     }
 
     @Override
     public IComplexNumber op(IComplexNumber origin) {
-        if (origin.absoluteValue().doubleValue() > complexNumber.absoluteValue().doubleValue())
+        if (origin.absoluteValue().doubleValue() < complexNumber.absoluteValue().doubleValue())
             return origin;
         return complexNumber;
     }
