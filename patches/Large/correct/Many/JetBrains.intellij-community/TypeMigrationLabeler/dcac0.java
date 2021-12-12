diff --git a/plugins/typeMigration/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java b/plugins/typeMigration/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
index e9b4bcd..abbd520 100644
--- a/plugins/typeMigration/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
+++ b/plugins/typeMigration/src/com/intellij/refactoring/typeMigration/TypeMigrationLabeler.java
@@ -372,7 +372,7 @@
 
     if (resolved instanceof PsiMethod) {
       final PsiMethod method = ((PsiMethod)resolved);
-      final PsiMethod[] methods = OverridingMethodsSearch.search(method, method.getUseScope(), true).toArray(PsiMethod.EMPTY_ARRAY);
+      final PsiMethod[] methods = OverridingMethodsSearch.search(method, method.getUseScope(), false).toArray(PsiMethod.EMPTY_ARRAY);
       final OverridenUsageInfo overridenUsageInfo = new OverridenUsageInfo(method);
       final OverriderUsageInfo[] overriders = new OverriderUsageInfo[methods.length];
       for (int i = -1; i < methods.length; i++) {
@@ -399,7 +399,7 @@
       }
 
       final int index = method.getParameterList().getParameterIndex(((PsiParameter)resolved));
-      final PsiMethod[] methods = OverridingMethodsSearch.search(method, method.getUseScope(), true).toArray(PsiMethod.EMPTY_ARRAY);
+      final PsiMethod[] methods = OverridingMethodsSearch.search(method, method.getUseScope(), false).toArray(PsiMethod.EMPTY_ARRAY);
 
       final OverriderUsageInfo[] overriders = new OverriderUsageInfo[methods.length];
       final OverridenUsageInfo overridenUsageInfo = new OverridenUsageInfo(method.getParameterList().getParameters()[index]);
@@ -533,7 +533,7 @@
   }
 
   public PsiReference[] markRootUsages(final PsiElement element, final PsiType migrationType) {
-    return markRootUsages(element, migrationType, ReferencesSearch.search(element, element.getUseScope(), true).toArray(new PsiReference[0]));
+    return markRootUsages(element, migrationType, ReferencesSearch.search(element, element.getUseScope(), false).toArray(new PsiReference[0]));
   }
 
   PsiReference[] markRootUsages(final PsiElement element, final PsiType migrationType, final PsiReference[] refs) {
@@ -620,7 +620,7 @@
     final PsiParameterList parameterList = method.getParameterList();
     final int parametersCount = parameterList.getParametersCount();
     final int index = parameterList.getParameterIndex(param);
-    final List<PsiReference> refs = filterReferences(psiClass, ReferencesSearch.search(method, method.getUseScope().intersectWith(myRules.getSearchScope()), true));
+    final List<PsiReference> refs = filterReferences(psiClass, ReferencesSearch.search(method, method.getUseScope().intersectWith(myRules.getSearchScope()), false));
     for (PsiReference ref1 : refs) {
       final PsiElement ref = ref1.getElement();
       final PsiElement parent = Util.getEssentialParent(ref);
