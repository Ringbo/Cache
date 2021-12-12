diff --git a/lang-impl/src/com/intellij/refactoring/actions/PushDownAction.java b/lang-impl/src/com/intellij/refactoring/actions/PushDownAction.java
index 93c3fff..f03a473 100644
--- a/lang-impl/src/com/intellij/refactoring/actions/PushDownAction.java
+++ b/lang-impl/src/com/intellij/refactoring/actions/PushDownAction.java
@@ -29,7 +29,7 @@
     PsiFile file = LangDataKeys.PSI_FILE.getData(dataContext);
     if (file == null) return null;
     final RefactoringSupportProvider supportProvider = LanguageRefactoringSupport.INSTANCE.forLanguage(file.getViewProvider().getBaseLanguage());
-    return supportProvider != null ? supportProvider.getPullUpHandler() : null;
+    return supportProvider != null ? supportProvider.getPushDownHandler() : null;
   }
 
   protected boolean isAvailableForLanguage(final Language language) {
