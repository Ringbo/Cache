diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/Match.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/Match.java
index 0519f2c..5c7f0e8 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/Match.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/patterns/Match.java
@@ -463,7 +463,8 @@
         formattedToken.setWhitespaceBefore(matchedToken.isWhitespaceBefore());
       }
       String token = formattedToken.getToken();
-      if (pRegexMatch != null) {
+      if (pRegexMatch != null && regexReplace != null) {
+    	/* only replace if it is something to replace*/
         token = pRegexMatch.matcher(token).replaceAll(regexReplace);
       }
       token = convertCase(token);
