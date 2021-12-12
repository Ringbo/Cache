diff --git a/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java b/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java
index 7148f33..74dfe97 100644
--- a/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java
+++ b/languagetool-core/src/main/java/org/languagetool/JLanguageTool.java
@@ -1063,7 +1063,7 @@
       int wordCounter = 0;
       for (AnalyzedSentence analyzedSentence : analyzedSentences) {
         String sentence = sentences.get(i++);
-        wordCounter += analyzedSentence.getTokens().length;
+        wordCounter += analyzedSentence.getTokensWithoutWhitespace().length;
         try {
           List<RuleMatch> sentenceMatches = null;
           InputSentence cacheKey = null;
@@ -1090,7 +1090,7 @@
           }
           ruleMatches.addAll(adaptedMatches);
           float errorsPerWord = ruleMatches.size() / (float)wordCounter;
-          //System.out.println("errorPerWord " + errorsPerWord + " (matches: " + ruleMatches.size() + " / " + wordCounter + ")");   // de-DE: 0.3
+          //System.out.println("errorPerWord " + errorsPerWord + " (matches: " + ruleMatches.size() + " / " + wordCounter + ")");
           if (maxErrorsPerWordRate > 0 && errorsPerWord > maxErrorsPerWordRate && wordCounter > 25) {
             throw new ErrorRateTooHighException("Text checking was stopped due to too many errors (more than " + String.format("%.0f", maxErrorsPerWordRate*100) +
                     "% of words seem to have an error). Are you sure you have set the correct text language? Language set: " + language.getName());
