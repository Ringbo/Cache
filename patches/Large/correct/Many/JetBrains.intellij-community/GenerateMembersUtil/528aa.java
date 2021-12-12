diff --git a/java/java-impl/src/com/intellij/codeInsight/generation/GenerateMembersUtil.java b/java/java-impl/src/com/intellij/codeInsight/generation/GenerateMembersUtil.java
index 2699efc..6f21bde 100644
--- a/java/java-impl/src/com/intellij/codeInsight/generation/GenerateMembersUtil.java
+++ b/java/java-impl/src/com/intellij/codeInsight/generation/GenerateMembersUtil.java
@@ -242,7 +242,7 @@
 
     try {
       final PsiMethod resultMethod = createMethod(factory, sourceMethod);
-      copyDocComment(resultMethod, sourceMethod);
+      copyDocComment(sourceMethod, resultMethod);
       copyModifiers(sourceMethod.getModifierList(), resultMethod.getModifierList());
       final PsiSubstitutor collisionResolvedSubstitutor =
         substituteTypeParameters(factory, codeStyleManager, target, sourceMethod.getTypeParameterList(), resultMethod.getTypeParameterList(), substitutor);
