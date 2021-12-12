diff --git a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/RuleMatch.java b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/RuleMatch.java
index c9fe591..910dc2a 100644
--- a/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/RuleMatch.java
+++ b/trunk/JLanguageTool/src/java/de/danielnaber/languagetool/rules/RuleMatch.java
@@ -66,7 +66,7 @@
     this.toPos = toPos;
     this.message = message;
     // extract suggestion from <suggestion>...</suggestion> in message:
-    Matcher matcher = SUGGESTION_PATTERN.matcher(message);
+    final Matcher matcher = SUGGESTION_PATTERN.matcher(message);
     int pos = 0;
     while (matcher.find(pos)) {
       pos = matcher.end();
@@ -195,7 +195,7 @@
   /**
    * The text fragments which might be an appropriate fix for the problem. One
    * of these fragments can be used to replace the old text between getFromPos()
-   * to getToPos(). Note that by default, text between &lt;em> and &lt;/em> is
+   * to getToPos(). Text between &lt;suggestion> and &lt;/suggestion> is
    * taken as the suggested replacement. 
    * @return List of String objects or an empty List
    */
@@ -210,7 +210,7 @@
   public int compareTo(RuleMatch other) {
     if (other == null)
       throw new ClassCastException();
-    RuleMatch otherRule = (RuleMatch) other;
+    final RuleMatch otherRule = (RuleMatch) other;
     if (getFromPos() < otherRule.getFromPos())
       return -1;
     if (getFromPos() > otherRule.getFromPos())
