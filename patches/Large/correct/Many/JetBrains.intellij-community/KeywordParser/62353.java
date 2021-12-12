diff --git a/platform/lang-impl/src/com/intellij/ide/highlighter/custom/tokens/KeywordParser.java b/platform/lang-impl/src/com/intellij/ide/highlighter/custom/tokens/KeywordParser.java
index ea7f8bd..cb985a0 100644
--- a/platform/lang-impl/src/com/intellij/ide/highlighter/custom/tokens/KeywordParser.java
+++ b/platform/lang-impl/src/com/intellij/ide/highlighter/custom/tokens/KeywordParser.java
@@ -49,7 +49,7 @@
     }
     Pattern pattern = null;
     try {
-      pattern = Pattern.compile("(" + regex + ")($|[\\W].*)", (ignoreCase ? Pattern.CASE_INSENSITIVE : 0) | Pattern.DOTALL);
+      pattern = Pattern.compile("(" + regex + ")($|[\\W])", (ignoreCase ? Pattern.CASE_INSENSITIVE : 0) | Pattern.DOTALL);
     }
     catch (PatternSyntaxException e) {
       LOG.error(e);
@@ -75,7 +75,7 @@
     }
 
     Matcher matcher = myPattern.matcher(myBuffer.subSequence(position, myBuffer.length()));
-    if (!matcher.matches()) {
+    if (!matcher.lookingAt()) {
       return false;
     }
 
