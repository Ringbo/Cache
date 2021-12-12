diff --git a/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/CaseRule.java b/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/CaseRule.java
index dc9b991..c99940e 100644
--- a/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/CaseRule.java
+++ b/languagetool-language-modules/de/src/main/java/org/languagetool/rules/de/CaseRule.java
@@ -545,7 +545,7 @@
 
   private boolean isNominalization(int i, AnalyzedTokenReadings[] tokens) {
     String token = tokens[i].getToken();
-    String prevToken = i > 1 ? tokens[i-1].getToken() : "";
+    String prevToken = i > 0 ? tokens[i-1].getToken() : "";
     AnalyzedTokenReadings nextReadings = i < tokens.length -1 ? tokens[i+1] : null;
     // ignore "das Dümmste, was je..." but not "das Dümmste Kind"
     return "das".equalsIgnoreCase(prevToken) && StringTools.startsWithUppercase(token) && !hasNounReading(nextReadings);
@@ -560,7 +560,7 @@
   }
 
   private boolean isAdjectiveAsNoun(int i, AnalyzedTokenReadings[] tokens) {
-    AnalyzedTokenReadings prevToken = i > 1 ? tokens[i-1] : null;
+    AnalyzedTokenReadings prevToken = i > 0 ? tokens[i-1] : null;
     boolean isPrevDeterminer = prevToken != null && prevToken.hasPartialPosTag("ART"); 
     AnalyzedTokenReadings nextReadings = i < tokens.length -1 ? tokens[i+1] : null;
     for (AnalyzedToken reading : tokens[i].getReadings()) {
