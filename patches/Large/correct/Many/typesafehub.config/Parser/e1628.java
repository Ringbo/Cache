diff --git a/src/main/java/com/typesafe/config/impl/Parser.java b/src/main/java/com/typesafe/config/impl/Parser.java
index 7b90487..a93e700 100644
--- a/src/main/java/com/typesafe/config/impl/Parser.java
+++ b/src/main/java/com/typesafe/config/impl/Parser.java
@@ -42,7 +42,7 @@
         ParseContext(ConfigSyntax flavor, ConfigOrigin origin,
                 Iterator<Token> tokens, ConfigIncluder includer,
                 ConfigIncludeContext includeContext) {
-            lineNumber = 0;
+            lineNumber = 1;
             buffer = new Stack<Token>();
             this.tokens = tokens;
             this.flavor = flavor;
@@ -79,7 +79,9 @@
         private Token nextTokenIgnoringNewline() {
             Token t = nextToken();
             while (Tokens.isNewline(t)) {
-                lineNumber = Tokens.getLineNumber(t);
+                // line number tokens have the line that was _ended_ by the
+                // newline, so we have to add one.
+                lineNumber = Tokens.getLineNumber(t) + 1;
                 t = nextToken();
             }
             return t;
