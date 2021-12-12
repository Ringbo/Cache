diff --git a/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/GermanSpellerRuleTest.java b/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/GermanSpellerRuleTest.java
index 042df1e..f6b5650 100644
--- a/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/GermanSpellerRuleTest.java
+++ b/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/GermanSpellerRuleTest.java
@@ -163,7 +163,7 @@
     assertCorrectionsByOrder(rule, "Aerger", "Ärger");
     assertCorrectionsByOrder(rule, "Walt", "Wald");
     assertCorrectionsByOrder(rule, "Rythmus", "Rhythmus");
-    assertCorrectionsByOrder(rule, "Rytmus", "Remus", "Rhythmus");
+    assertCorrectionsByOrder(rule, "Rytmus", "Rhythmus", "Remus");
   }
   
   private void assertCorrection(HunspellRule rule, String input, String... expectedTerms) throws IOException {
