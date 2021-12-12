diff --git a/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/inference/ConstraintsUtil.java b/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/inference/ConstraintsUtil.java
index 199ecef..6f40096 100644
--- a/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/inference/ConstraintsUtil.java
+++ b/compiler/frontend/src/org/jetbrains/kotlin/resolve/calls/inference/ConstraintsUtil.java
@@ -31,7 +31,7 @@
 public class ConstraintsUtil {
     @Nullable
     public static TypeParameterDescriptor getFirstConflictingParameter(@NotNull ConstraintSystem constraintSystem) {
-        for (TypeParameterDescriptor typeParameter : constraintSystem.getTypeVariables()) {
+        for (TypeParameterDescriptor typeParameter : constraintSystem.getTypeParameterDescriptors()) {
             TypeBounds constraints = constraintSystem.getTypeBounds(typeParameter);
             if (constraints.getValues().size() > 1) {
                 return typeParameter;
@@ -54,7 +54,7 @@
             substitutionContexts.add(context);
         }
 
-        for (TypeParameterDescriptor typeParameter : constraintSystem.getTypeVariables()) {
+        for (TypeParameterDescriptor typeParameter : constraintSystem.getTypeParameterDescriptors()) {
             if (typeParameter == firstConflictingParameter) continue;
 
             KotlinType safeType = getSafeValue(constraintSystem, typeParameter);
@@ -88,7 +88,8 @@
         KotlinType type = constraintSystem.getTypeBounds(typeParameter).getValue();
         if (type == null) return true;
         for (KotlinType upperBound : typeParameter.getUpperBounds()) {
-            if (!substituteOtherTypeParametersInBound && TypeUtils.dependsOnTypeParameters(upperBound, constraintSystem.getTypeVariables())) {
+            if (!substituteOtherTypeParametersInBound &&
+                TypeUtils.dependsOnTypeParameters(upperBound, constraintSystem.getTypeParameterDescriptors())) {
                 continue;
             }
             KotlinType substitutedUpperBound = constraintSystem.getResultingSubstitutor().substitute(upperBound, Variance.INVARIANT);
