diff --git a/java/java-psi-impl/src/com/intellij/psi/PsiDiamondTypeImpl.java b/java/java-psi-impl/src/com/intellij/psi/PsiDiamondTypeImpl.java
index c6ddd67..1745d1b 100644
--- a/java/java-psi-impl/src/com/intellij/psi/PsiDiamondTypeImpl.java
+++ b/java/java-psi-impl/src/com/intellij/psi/PsiDiamondTypeImpl.java
@@ -155,7 +155,7 @@
     final PsiSubstitutor inferredSubstitutor = ourDiamondGuard.doPreventingRecursion(context, false, new Computable<PsiSubstitutor>() {
       @Override
       public PsiSubstitutor compute() {
-        final MethodCandidateInfo staticFactoryCandidateInfo = CachedValuesManager.getCachedValue(newExpression,
+        final MethodCandidateInfo staticFactoryCandidateInfo = CachedValuesManager.getCachedValue(context,
                                                                                                   new CachedValueProvider<MethodCandidateInfo>() {
                                                                                                     @Nullable
                                                                                                     @Override
