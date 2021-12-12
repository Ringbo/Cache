diff --git a/languagetool-core/src/main/java/org/languagetool/rules/bitext/DifferentLengthRule.java b/languagetool-core/src/main/java/org/languagetool/rules/bitext/DifferentLengthRule.java
index ed6ffcd..d9de4f6 100644
--- a/languagetool-core/src/main/java/org/languagetool/rules/bitext/DifferentLengthRule.java
+++ b/languagetool-core/src/main/java/org/languagetool/rules/bitext/DifferentLengthRule.java
@@ -58,7 +58,7 @@
     if (isLengthDifferent(getPureText(sourceText), getPureText(targetText))) {
       final AnalyzedTokenReadings[] tokens = targetText.getTokens();
       final int len = tokens[tokens.length - 1].getStartPos() + tokens[tokens.length - 1].getToken().length();
-      return new RuleMatch[] { new RuleMatch(this, 1, len, getMessage()) };
+      return new RuleMatch[] { new RuleMatch(this, 0, len, getMessage()) };
     }
     return new RuleMatch[0];
   }
