diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/gpp/GppExpectedTypesContributor.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/gpp/GppExpectedTypesContributor.java
index 5937224..2a59c0f 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/gpp/GppExpectedTypesContributor.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/gpp/GppExpectedTypesContributor.java
@@ -47,9 +47,9 @@
     assert argIndex >= 0;
 
     final ArrayList<TypeConstraint> result = new ArrayList<TypeConstraint>();
-    for (PsiType type : GroovyExpectedTypesProvider.getDefaultExpectedTypes(expression)) {
+    for (PsiType type : GroovyExpectedTypesProvider.getDefaultExpectedTypes(list)) {
       if (type instanceof PsiClassType) {
-        for (GroovyResolveResult resolveResult : PsiUtil.getConstructorCandidates((PsiClassType)type, argTypes, expression)) {
+        for (GroovyResolveResult resolveResult : PsiUtil.getConstructorCandidates((PsiClassType)type, argTypes, list)) {
           final PsiElement method = resolveResult.getElement();
           if (method instanceof PsiMethod && ((PsiMethod)method).isConstructor()) {
             final PsiParameter[] constructorParameters = ((PsiMethod)method).getParameterList().getParameters();
