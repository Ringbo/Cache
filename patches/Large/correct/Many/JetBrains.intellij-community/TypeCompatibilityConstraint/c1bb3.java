diff --git a/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/constraints/TypeCompatibilityConstraint.java b/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/constraints/TypeCompatibilityConstraint.java
index d3fba84..bf5987f7 100644
--- a/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/constraints/TypeCompatibilityConstraint.java
+++ b/java/java-psi-impl/src/com/intellij/psi/impl/source/resolve/graphInference/constraints/TypeCompatibilityConstraint.java
@@ -40,7 +40,7 @@
   @Override
   public boolean reduce(InferenceSession session, List<ConstraintFormula> constraints) {
     if (session.isProperType(myT) && session.isProperType(myS)) {
-      return TypeConversionUtil.isAssignable(myS, myT);
+      return TypeConversionUtil.isAssignable(myT, myS);
     }
     if (myS instanceof PsiPrimitiveType) {
       final PsiClassType boxedType = ((PsiPrimitiveType)myS).getBoxedType(session.getManager(), session.getScope());
