diff --git a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CopyPasteIndentProcessor.java b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CopyPasteIndentProcessor.java
index f9e05fb..3bc8e69 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CopyPasteIndentProcessor.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CopyPasteIndentProcessor.java
@@ -144,7 +144,7 @@
   }
 
   public static int getLineStartSafeOffset(final Document document, int line) {
-    if (line == document.getLineCount()) return document.getTextLength();
+    if (line >= document.getLineCount()) return document.getTextLength();
     return document.getLineStartOffset(line);
   }
 
