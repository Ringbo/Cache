diff --git a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CopyPasteIndentProcessor.java b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CopyPasteIndentProcessor.java
index a42ea96..cfebc39 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CopyPasteIndentProcessor.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/editorActions/CopyPasteIndentProcessor.java
@@ -65,7 +65,7 @@
     }
     int firstNonSpaceChar = CharArrayUtil.shiftForward(document.getCharsSequence(), startOffsets[0], " \t");
     int firstLineLeadingSpaces = (firstNonSpaceChar <= document.getLineEndOffset(selStartLine)) ? firstNonSpaceChar - startOffsets[0] : 0;
-    return new IndentTransferableData(minIndent, maxIndent, firstLineLeadingSpaces);
+    return new IndentTransferableData(maxIndent - minIndent, maxIndent, firstLineLeadingSpaces);
   }
 
   private static boolean acceptFileType(FileType fileType) {
@@ -152,7 +152,7 @@
         }
 
         final List<String> strings = StringUtil.split(pastedText, "\n");
-        if (caretColumn > value.getIndent() && !strings.isEmpty() &&
+        if (caretColumn >= value.getIndent() && !strings.isEmpty() &&
             StringUtil.isEmptyOrSpaces(strings.get(strings.size()-1))) endLine -=1;
 
         for (int i = startLine+1; i <= endLine; i++) {
