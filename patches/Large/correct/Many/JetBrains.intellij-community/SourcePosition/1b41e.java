diff --git a/java/debugger/openapi/src/com/intellij/debugger/SourcePosition.java b/java/debugger/openapi/src/com/intellij/debugger/SourcePosition.java
index fcafd64..45f50d3 100644
--- a/java/debugger/openapi/src/com/intellij/debugger/SourcePosition.java
+++ b/java/debugger/openapi/src/com/intellij/debugger/SourcePosition.java
@@ -238,12 +238,12 @@
           while (true) {
             final CharSequence charsSequence = document.getCharsSequence();
             for (; offset < charsSequence.length(); offset++) {
-              char c = charsSequence.charAt(startOffset);
+              char c = charsSequence.charAt(offset);
               if (c != ' ' && c != '\t') {
                 break;
               }
             }
-            element = rootElement.findElementAt(startOffset);
+            element = rootElement.findElementAt(offset);
 
             if (element instanceof PsiComment) {
               offset = element.getTextRange().getEndOffset() + 1;
