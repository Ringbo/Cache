diff --git a/languagetool-core/src/test/java/org/languagetool/rules/patterns/PatternRuleTest.java b/languagetool-core/src/test/java/org/languagetool/rules/patterns/PatternRuleTest.java
index 0dca9ce..6567316 100644
--- a/languagetool-core/src/test/java/org/languagetool/rules/patterns/PatternRuleTest.java
+++ b/languagetool-core/src/test/java/org/languagetool/rules/patterns/PatternRuleTest.java
@@ -74,7 +74,7 @@
   /** To be called from language modules. */
   protected void runGrammarRulesFromXmlTest() throws IOException {
     for (final Language lang : Language.REAL_LANGUAGES) {
-      if (skipCountryVariant(lang)) {
+      if (skipCountryVariant(lang) && Language.REAL_LANGUAGES.length>1) {
         System.out.println("Skipping " + lang + " because there are no specific rules for that variant");
         continue;
       }
@@ -91,7 +91,7 @@
   private String getGrammarFileName(Language lang) {
     final String shortNameWithVariant = lang.getShortNameWithVariant();
     final String fileName;
-    if (shortNameWithVariant.contains("-") && !shortNameWithVariant.endsWith("-ANY")) {
+    if (shortNameWithVariant.contains("-") && !shortNameWithVariant.endsWith("-ANY")  && Language.REAL_LANGUAGES.length>1) {
       fileName = lang.getShortName() + "/" + shortNameWithVariant + "/" + JLanguageTool.PATTERN_FILE;
     } else {
       fileName = lang.getShortName() + "/" + JLanguageTool.PATTERN_FILE;
