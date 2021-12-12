diff --git a/plugins/IntelliLang/src/org/intellij/plugins/intelliLang/inject/InjectLanguageAction.java b/plugins/IntelliLang/src/org/intellij/plugins/intelliLang/inject/InjectLanguageAction.java
index 3141d0a..82f8f93 100644
--- a/plugins/IntelliLang/src/org/intellij/plugins/intelliLang/inject/InjectLanguageAction.java
+++ b/plugins/IntelliLang/src/org/intellij/plugins/intelliLang/inject/InjectLanguageAction.java
@@ -95,7 +95,7 @@
   }
 
   private static boolean defaultFunctionalityWorked(final PsiLanguageInjectionHost host, final String languageId) {
-    return Configuration.getInstance().setHostInjectionEnabled(host, Collections.singleton(languageId), false);
+    return Configuration.getInstance().setHostInjectionEnabled(host, Collections.singleton(languageId), true);
   }
 
   private static boolean doChooseLanguageToInject(final Processor<String> onChosen) {
