diff --git a/languagetool-core/src/main/java/org/languagetool/rules/patterns/PatternRuleMatcher.java b/languagetool-core/src/main/java/org/languagetool/rules/patterns/PatternRuleMatcher.java
index e3ba77f..060522a 100644
--- a/languagetool-core/src/main/java/org/languagetool/rules/patterns/PatternRuleMatcher.java
+++ b/languagetool-core/src/main/java/org/languagetool/rules/patterns/PatternRuleMatcher.java
@@ -332,7 +332,7 @@
     String suggestionRight = "";
     String rightSideNew = rightSide;
     final int sPos = leftSide.lastIndexOf(SUGGESTION_START_TAG);
-    if (sPos > 0) {
+    if (sPos >= 0) {
       suggestionLeft = leftSide.substring(sPos + SUGGESTION_START_TAG.length());
     }
     if (StringTools.isEmpty(suggestionLeft)) {
@@ -341,7 +341,7 @@
       errorMessage = leftSide.substring(0, leftSide.lastIndexOf(SUGGESTION_START_TAG)) + SUGGESTION_START_TAG;
     }
     final int rPos = rightSide.indexOf(SUGGESTION_END_TAG);
-    if (rPos > 0) {
+    if (rPos >= 0) {
       suggestionRight = rightSide.substring(0, rPos);
     }
     if (!StringTools.isEmpty(suggestionRight)) {
