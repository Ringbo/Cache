diff --git a/config/src/main/java/com/typesafe/config/impl/ConfigDocumentParser.java b/config/src/main/java/com/typesafe/config/impl/ConfigDocumentParser.java
index a8fe0c8..1768cc7 100644
--- a/config/src/main/java/com/typesafe/config/impl/ConfigDocumentParser.java
+++ b/config/src/main/java/com/typesafe/config/impl/ConfigDocumentParser.java
@@ -104,7 +104,7 @@
                 boolean sawSeparatorOrNewline = false;
                 Token t = nextToken();
                 while (true) {
-                    if (Tokens.isIgnoredWhitespace(t) || isUnquotedWhitespace(t)) {
+                    if (Tokens.isIgnoredWhitespace(t) || isUnquotedWhitespace(t) || Tokens.isComment(t)) {
                         //do nothing
                     } else if (Tokens.isNewline(t)) {
                         sawSeparatorOrNewline = true;
