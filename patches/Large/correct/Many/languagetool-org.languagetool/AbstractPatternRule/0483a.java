diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/AbstractPatternRule.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/AbstractPatternRule.java
index 5a5fa0b..e35fe6d 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/AbstractPatternRule.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/AbstractPatternRule.java
@@ -173,7 +173,8 @@
         return false;
       }
       thisMatched = thisMatched || elem.isMatched(matchToken);
-      if (!thisMatched && !elem.isInflected() && elem.getPOStag() == null) {
+      if (!thisMatched && !elem.isInflected() && elem.getPOStag() == null 
+          && (prevElement != null && prevElement.getExceptionList() == null)) {
         return false; // the token is the same, we will not get a match
       }
       if (groupsOrUnification) {
