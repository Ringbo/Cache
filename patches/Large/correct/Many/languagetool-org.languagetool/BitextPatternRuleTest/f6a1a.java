diff --git a/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/rules/bitext/BitextPatternRuleTest.java b/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/rules/bitext/BitextPatternRuleTest.java
index 26ccefd..ed9045f 100644
--- a/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/rules/bitext/BitextPatternRuleTest.java
+++ b/trunk/JLanguageTool/src/test/de/danielnaber/languagetool/rules/bitext/BitextPatternRuleTest.java
@@ -167,7 +167,7 @@
       assertFalse(lang + ": Did not expect error in: " + goodSentence
           + " (Rule: " + rule + ")", 
           match(rule, goodSentence.getSource(), goodSentence.getTarget(), 
-              languageTool, srcTool));
+              srcTool, languageTool));
     }
     final List<IncorrectBitextExample> badSentences = rule.getIncorrectBitextExamples();
     for (IncorrectBitextExample origBadExample : badSentences) {
@@ -191,7 +191,7 @@
           suggestedCorrection, expectedSrcMatchStart,
           expectedSrcMatchEnd, rule.getSrcRule(), 
           lang,
-          languageTool);
+          srcTool);
       
       testBadSentence(origBadTrgSentence, 
           suggestedCorrection, expectedTrgMatchStart,
