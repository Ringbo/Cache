diff --git a/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java b/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java
index 4079777..44fa5c3 100644
--- a/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java
+++ b/languagetool-office-extension/src/main/java/org/languagetool/openoffice/Main.java
@@ -453,8 +453,8 @@
       for (RuleMatch myRuleMatch : paragraphMatches) {
         int startErrPos = myRuleMatch.getFromPos();
         int endErrPos = myRuleMatch.getToPos();
-        if (startErrPos >= startPos && startErrPos < endPos
-            && endErrPos >= startPos && endErrPos < endPos) {
+        if (startErrPos >= startPos && startErrPos <= endPos
+            && endErrPos >= startPos && endErrPos <= endPos) {
           errorList.add(createOOoError(myRuleMatch, 0, myRuleMatch.getToPos(), 
         		                            paraText.charAt(myRuleMatch.getToPos()-1)));
         }
