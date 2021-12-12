diff --git a/languagetool-core/src/main/java/org/languagetool/rules/DoublePunctuationRule.java b/languagetool-core/src/main/java/org/languagetool/rules/DoublePunctuationRule.java
index 764ba99..fe6106c 100644
--- a/languagetool-core/src/main/java/org/languagetool/rules/DoublePunctuationRule.java
+++ b/languagetool-core/src/main/java/org/languagetool/rules/DoublePunctuationRule.java
@@ -55,7 +55,7 @@
   @Override
   public final RuleMatch[] match(AnalyzedSentence sentence) {
     List<RuleMatch> ruleMatches = new ArrayList<>();
-    AnalyzedTokenReadings[] tokens = sentence.getTokens();
+    AnalyzedTokenReadings[] tokens = sentence.getTokensWithoutWhitespace();
     int startPos = 0;
     int dotCount = 0;
     int commaCount = 0;
