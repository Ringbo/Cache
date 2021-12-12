diff --git a/java/java-impl/src/com/intellij/codeInsight/generation/GenerateMembersUtil.java b/java/java-impl/src/com/intellij/codeInsight/generation/GenerateMembersUtil.java
index b1cc007..2699efc 100644
--- a/java/java-impl/src/com/intellij/codeInsight/generation/GenerateMembersUtil.java
+++ b/java/java-impl/src/com/intellij/codeInsight/generation/GenerateMembersUtil.java
@@ -293,7 +293,7 @@
                                                                  @NotNull PsiTypeParameter typeParam,
                                                                  @NotNull PsiSubstitutor substitutor) {
     for (PsiType type : substitutor.getSubstitutionMap().values()) {
-      if (Comparing.equal(type.getCanonicalText(), typeParam.getName())) {
+      if (type != null && Comparing.equal(type.getCanonicalText(), typeParam.getName())) {
         final String newName = suggestUniqueTypeParameterName(typeParam.getName(), sourceTypeParameterList, PsiTreeUtil.getParentOfType(target, PsiClass.class,false));
         final PsiTypeParameter newTypeParameter = factory.createTypeParameter(newName, typeParam.getSuperTypes());
         substitutor.put(typeParam, factory.createType(newTypeParameter));
@@ -430,10 +430,10 @@
 
   private static void substituteReturnType(@NotNull PsiManager manager,
                                            @NotNull PsiMethod method,
-                                           @NotNull PsiType returnType,
+                                           @Nullable PsiType returnType,
                                            @NotNull PsiSubstitutor substitutor) {
     final PsiTypeElement returnTypeElement = method.getReturnTypeElement();
-    if (returnTypeElement == null) {
+    if (returnTypeElement == null || returnType == null) {
       return;
     }
     final PsiType substitutedReturnType = substituteType(substitutor, returnType);
