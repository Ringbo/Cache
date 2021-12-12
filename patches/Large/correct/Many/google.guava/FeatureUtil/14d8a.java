diff --git a/guava-testlib/src/com/google/common/collect/testing/features/FeatureUtil.java b/guava-testlib/src/com/google/common/collect/testing/features/FeatureUtil.java
index 344e374..491fe08 100644
--- a/guava-testlib/src/com/google/common/collect/testing/features/FeatureUtil.java
+++ b/guava-testlib/src/com/google/common/collect/testing/features/FeatureUtil.java
@@ -214,7 +214,7 @@
   private static TesterRequirements buildTesterRequirements(
       Annotation testerAnnotation)
       throws ConflictingRequirementsException {
-    Class<? extends Annotation> annotationClass = testerAnnotation.getClass();
+    Class<? extends Annotation> annotationClass = testerAnnotation.annotationType();
     final Feature<?>[] presentFeatures;
     final Feature<?>[] absentFeatures;
     try {
