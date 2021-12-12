diff --git a/java/org/apache/jasper/compiler/Parser.java b/java/org/apache/jasper/compiler/Parser.java
index dcef0fb..3955859 100644
--- a/java/org/apache/jasper/compiler/Parser.java
+++ b/java/org/apache/jasper/compiler/Parser.java
@@ -1415,7 +1415,9 @@
             parseXMLTemplateText(parent);
         } else if (!pageInfo.isELIgnored() && reader.matches("${")) {
             parseELExpression(parent, '$');
-        } else if (!pageInfo.isELIgnored() && reader.matches("#{")) {
+        } else if (!pageInfo.isELIgnored()
+                && !pageInfo.isDeferredSyntaxAllowedAsLiteral()
+                && reader.matches("#{")) {
             parseELExpression(parent, '#');
         } else if (reader.matches("<jsp:")) {
             parseStandardAction(parent);
