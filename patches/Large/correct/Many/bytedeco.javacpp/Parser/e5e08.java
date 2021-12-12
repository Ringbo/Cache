diff --git a/src/main/java/org/bytedeco/javacpp/tools/Parser.java b/src/main/java/org/bytedeco/javacpp/tools/Parser.java
index 9ac0f8d..7799255 100644
--- a/src/main/java/org/bytedeco/javacpp/tools/Parser.java
+++ b/src/main/java/org/bytedeco/javacpp/tools/Parser.java
@@ -897,7 +897,7 @@
         for (Token token = tokens.get(); token.match(Token.COMMENT); token = tokens.next()) {
             String s = token.value;
             if (s.startsWith("/**") || s.startsWith("/*!") || s.startsWith("///") || s.startsWith("//!")) {
-                if (s.charAt(3) == '<') {
+                if (s.length() > 3 && s.charAt(3) == '<') {
                     continue;
                 } else if (s.startsWith("/// ") || s.startsWith("//!")) {
                     s = (comment.length() == 0 || comment.contains("*/")
@@ -933,7 +933,7 @@
             String spacing = token.spacing;
             int n = spacing.lastIndexOf('\n') + 1;
             if (s.startsWith("/**") || s.startsWith("/*!") || s.startsWith("///") || s.startsWith("//!")) {
-                if (s.charAt(3) != '<') {
+                if (s.length() > 3 && s.charAt(3) != '<') {
                     continue;
                 } else if (s.startsWith("///") || s.startsWith("//!")) {
                     s = (comment.length() == 0 || comment.contains("*/")
