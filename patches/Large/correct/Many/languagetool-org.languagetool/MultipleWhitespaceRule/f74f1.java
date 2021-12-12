diff --git a/languagetool-core/src/main/java/org/languagetool/rules/MultipleWhitespaceRule.java b/languagetool-core/src/main/java/org/languagetool/rules/MultipleWhitespaceRule.java
index 7b6e722..2ca301b 100644
--- a/languagetool-core/src/main/java/org/languagetool/rules/MultipleWhitespaceRule.java
+++ b/languagetool-core/src/main/java/org/languagetool/rules/MultipleWhitespaceRule.java
@@ -71,12 +71,13 @@
           StringTools.isNonBreakingWhitespace(tokens[i].getToken())) && prevWhite && !tokenIsTab && !prevTokenIsLinebreak && !isLineBreakContinuation) {
         int pos = tokens[i -1].getStartPos();
         while (i < tokens.length && (tokens[i].isWhitespace() ||
-            StringTools.isNonBreakingWhitespace(tokens[i].getToken()))) {
+            StringTools.isNonBreakingWhitespace(tokens[i].getToken())) 
+        		&& !tokens[i].isLinebreak()) {    // preserve LF because LO/OO can't handle grammar errors including LF
           prevLen += tokens[i].getToken().length();
           i++;
         }
         String message = messages.getString("whitespace_repetition");
-        if (prevLen > 0) {
+        if (prevLen > 1) {
           if (prevPos >= 2 && sentence.getText().substring(prevPos-2, pos + prevLen).equals("-- \n")) {
             // no match for typical email signature delimiter
             continue;
