diff --git a/lang-impl/src/com/intellij/psi/templateLanguages/TemplateDataElementType.java b/lang-impl/src/com/intellij/psi/templateLanguages/TemplateDataElementType.java
index 0c87348..3349018 100644
--- a/lang-impl/src/com/intellij/psi/templateLanguages/TemplateDataElementType.java
+++ b/lang-impl/src/com/intellij/psi/templateLanguages/TemplateDataElementType.java
@@ -154,11 +154,11 @@
                                                                 final IElementType outerElementType) {
     final CharSequence buffer = lexer.getBufferSequence();
     final int tokenStart = lexer.getTokenStart();
-    if (tokenStart < 0 || tokenStart >= buffer.length()) {
+    if (tokenStart < 0 || tokenStart > buffer.length()) {
       LOG.assertTrue(false, "Invalid start: " + tokenStart + "; " + lexer);
     }
     final int tokenEnd = lexer.getTokenEnd();
-    if (tokenEnd < 0 || tokenEnd >= buffer.length()) {
+    if (tokenEnd < 0 || tokenEnd > buffer.length()) {
       LOG.assertTrue(false, "Invalid end: " + tokenEnd + "; " + lexer);
     }
 
