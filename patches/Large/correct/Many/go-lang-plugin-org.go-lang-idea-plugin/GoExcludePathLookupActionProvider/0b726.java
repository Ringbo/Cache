diff --git a/src/com/goide/codeInsight/imports/GoExcludePathLookupActionProvider.java b/src/com/goide/codeInsight/imports/GoExcludePathLookupActionProvider.java
index a798b0b..e7f9f68 100644
--- a/src/com/goide/codeInsight/imports/GoExcludePathLookupActionProvider.java
+++ b/src/com/goide/codeInsight/imports/GoExcludePathLookupActionProvider.java
@@ -38,7 +38,7 @@
   @Override
   public void fillActions(LookupElement element, Lookup lookup, Consumer<LookupElementAction> consumer) {
     PsiElement psiElement = element.getPsiElement();
-    PsiFile file = psiElement != null ? psiElement.getContainingFile() : null;
+    PsiFile file = psiElement != null && psiElement.isValid() ? psiElement.getContainingFile() : null;
     String importPath = file instanceof GoFile ? ((GoFile)file).getImportPath(false) : null;
     if (importPath != null) {
       Project project = psiElement.getProject();
@@ -72,7 +72,7 @@
       ApplicationManager.getApplication().invokeLater(new Runnable() {
         @Override
         public void run() {
-          final GoAutoImportConfigurable configurable = new GoAutoImportConfigurable(myProject, true);
+          GoAutoImportConfigurable configurable = new GoAutoImportConfigurable(myProject, true);
           ShowSettingsUtil.getInstance().editConfigurable(myProject, configurable, new Runnable() {
               @Override
               public void run() {
