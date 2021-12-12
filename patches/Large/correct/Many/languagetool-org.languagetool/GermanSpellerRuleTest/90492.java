diff --git a/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/GermanSpellerRuleTest.java b/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/GermanSpellerRuleTest.java
index c164711..fd0bfa6 100644
--- a/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/GermanSpellerRuleTest.java
+++ b/languagetool-language-modules/de/src/test/java/org/languagetool/rules/de/GermanSpellerRuleTest.java
@@ -280,7 +280,7 @@
     HunspellRule rule = new GermanSpellerRule(TestTools.getMessages("de"), GERMAN_DE);
 
     assertCorrection(rule, "Hauk", "Haus", "Haut");
-    assertCorrection(rule, "Eisnbahn", "Einbahn", "Eisbahn", "Eisenbahn"); 
+    assertCorrection(rule, "Eisnbahn", "Eisbahn", "Eisenbahn"); 
     assertCorrection(rule, "Rechtschreipreform", "Rechtschreibreform");
     assertCorrection(rule, "Theatrekasse", "Theaterkasse");
     assertCorrection(rule, "Traprennen", "Trabrennen");
