diff --git a/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java b/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
index 8f0a3b3..a25c6ce 100644
--- a/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
+++ b/java/java-impl/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
@@ -386,7 +386,7 @@
 
     if (resolved instanceof PsiMethod) {
       final PsiMethod method = ((PsiMethod)resolved);
-      final PsiMethod[] methods = OverridingMethodsSearch.search(method, method.getUseScope(), false).toArray(PsiMethod.EMPTY_ARRAY);
+      final PsiMethod[] methods = OverridingMethodsSearch.search(method, method.getUseScope(), true).toArray(PsiMethod.EMPTY_ARRAY);
       final OverridenUsageInfo overridenUsageInfo = new OverridenUsageInfo(method);
       final OverriderUsageInfo[] overriders = new OverriderUsageInfo[methods.length];
       for (int i = -1; i < methods.length; i++) {
@@ -409,7 +409,7 @@
       final PsiMethod method = (PsiMethod)((PsiParameter)resolved).getDeclarationScope();
 
       final int index = method.getParameterList().getParameterIndex(((PsiParameter)resolved));
-      final PsiMethod[] methods = OverridingMethodsSearch.search(method, method.getUseScope(), false).toArray(PsiMethod.EMPTY_ARRAY);
+      final PsiMethod[] methods = OverridingMethodsSearch.search(method, method.getUseScope(), true).toArray(PsiMethod.EMPTY_ARRAY);
 
       final OverriderUsageInfo[] overriders = new OverriderUsageInfo[methods.length];
       final OverridenUsageInfo overridenUsageInfo = new OverridenUsageInfo(method.getParameterList().getParameters()[index]);
