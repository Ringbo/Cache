diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/convertToJava/ClassGenerator.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/convertToJava/ClassGenerator.java
index 2981cf1..ee6a883 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/convertToJava/ClassGenerator.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/refactoring/convertToJava/ClassGenerator.java
@@ -187,7 +187,7 @@
     for (PsiMethod psiMethod : method.findSuperMethods()) {
       if (!psiMethod.hasModifierProperty(PsiModifier.ABSTRACT)) {
         final PsiType type = method.getReturnType();
-        final PsiType superType = method.getReturnType();
+        final PsiType superType = psiMethod.getReturnType();
         if (type != null && superType != null && !superType.isAssignableFrom(type)) {
           return false;
         }
