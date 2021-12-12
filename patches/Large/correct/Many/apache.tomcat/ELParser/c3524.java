diff --git a/java/org/apache/jasper/compiler/ELParser.java b/java/org/apache/jasper/compiler/ELParser.java
index 91552df..ffbccdc 100644
--- a/java/org/apache/jasper/compiler/ELParser.java
+++ b/java/org/apache/jasper/compiler/ELParser.java
@@ -298,13 +298,17 @@
         }
         char quote = input.charAt(0);
         if (quote != '\'' && quote != '\"') {
-            throw new IllegalArgumentException();
+            throw new IllegalArgumentException(Localizer.getMessage(
+                    "org.apache.jasper.compiler.ELParser.invalidQuotesForStringLiteral",
+                    input));
         }
 
         int lastAppend = 1;
         StringBuilder output = null;
         if (input.charAt(len - 1) != quote) {
-            throw new IllegalArgumentException();
+            throw new IllegalArgumentException(Localizer.getMessage(
+                    "org.apache.jasper.compiler.ELParser.invalidQuotesForStringLiteral",
+                    input));
         }
         for (int i = 1; i < len - 1; i++) {
             char ch = input.charAt(i);
@@ -388,7 +392,9 @@
                 if (ch == '\\' || ch == '\'' || ch == '\"') {
                     buf.append(ch);
                 } else {
-                    throw new IllegalArgumentException();
+                    throw new IllegalArgumentException(Localizer.getMessage(
+                            "org.apache.jasper.compiler.ELParser.invalidQuoting",
+                            expression));
                 }
             } else if (ch == quote) {
                 buf.append(ch);
