diff --git a/python/src/com/jetbrains/python/codeInsight/PythonFormattedStringReferenceProvider.java b/python/src/com/jetbrains/python/codeInsight/PythonFormattedStringReferenceProvider.java
index 7b4ea15..7d19922 100644
--- a/python/src/com/jetbrains/python/codeInsight/PythonFormattedStringReferenceProvider.java
+++ b/python/src/com/jetbrains/python/codeInsight/PythonFormattedStringReferenceProvider.java
@@ -39,13 +39,13 @@
 
   private static PsiReference[] getReferencesFromFormatString(@NotNull final PyStringLiteralExpression element) {
     final List<PyStringFormatParser.SubstitutionChunk> chunks = PyStringFormatParser.filterSubstitutions(
-      PyStringFormatParser.parseNewStyleFormat(element.getText()));
+      PyStringFormatParser.parseNewStyleFormat(element.getStringValue()));
     return getReferencesFromChunks(element, chunks, false);
   }
 
   private static PsiReference[] getReferencesFromPercentString(@NotNull final PyStringLiteralExpression element) {
     final List<PyStringFormatParser.SubstitutionChunk>
-      chunks = PyStringFormatParser.filterSubstitutions(PyStringFormatParser.parsePercentFormat(element.getText()));
+      chunks = PyStringFormatParser.filterSubstitutions(PyStringFormatParser.parsePercentFormat(element.getStringValue()));
     return getReferencesFromChunks(element, chunks, true);
   }
 
