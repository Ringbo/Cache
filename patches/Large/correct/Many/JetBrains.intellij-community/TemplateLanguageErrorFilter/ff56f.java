diff --git a/platform/lang-impl/src/com/intellij/codeInsight/highlighting/TemplateLanguageErrorFilter.java b/platform/lang-impl/src/com/intellij/codeInsight/highlighting/TemplateLanguageErrorFilter.java
index 9054594..a5f4926 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/highlighting/TemplateLanguageErrorFilter.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/highlighting/TemplateLanguageErrorFilter.java
@@ -106,7 +106,7 @@
 
   protected boolean isKnownSubLanguage(@NotNull final Language language) {
     for (Language knownLanguage : knownLanguageSet) {
-      if (language.is(knownLanguage)) {
+      if (language.is(knownLanguage) || knownLanguage.getDialects().contains(language)) {
         return true;
       }
     }
