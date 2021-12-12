diff --git a/python/src/com/jetbrains/python/codeInsight/PySubstitutionChunkReference.java b/python/src/com/jetbrains/python/codeInsight/PySubstitutionChunkReference.java
index 2ed7c88..a5d6704 100644
--- a/python/src/com/jetbrains/python/codeInsight/PySubstitutionChunkReference.java
+++ b/python/src/com/jetbrains/python/codeInsight/PySubstitutionChunkReference.java
@@ -56,9 +56,9 @@
 
   private static TextRange getKeyWordRange(@NotNull final PyStringLiteralExpression element,
                                            @NotNull final PyStringFormatParser.SubstitutionChunk chunk) {
-    final TextRange shifted = chunk.getTextRange().shiftRight(1);
+    final TextRange shifted = chunk.getTextRange();
     if (chunk.getMappingKey() != null) {
-      final int start = shifted.getStartOffset() + chunk.getTextRange().substring(element.getStringValue()).indexOf(chunk.getMappingKey());
+      final int start = shifted.getStartOffset() + chunk.getTextRange().substring(element.getText()).indexOf(chunk.getMappingKey());
       return new TextRange(start, start + chunk.getMappingKey().length());
     }
     return shifted;
