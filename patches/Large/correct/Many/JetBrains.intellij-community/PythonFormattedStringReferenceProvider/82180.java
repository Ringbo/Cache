diff --git a/python/src/com/jetbrains/python/codeInsight/PythonFormattedStringReferenceProvider.java b/python/src/com/jetbrains/python/codeInsight/PythonFormattedStringReferenceProvider.java
index d56fb3b..a9dbf48 100644
--- a/python/src/com/jetbrains/python/codeInsight/PythonFormattedStringReferenceProvider.java
+++ b/python/src/com/jetbrains/python/codeInsight/PythonFormattedStringReferenceProvider.java
@@ -39,13 +39,13 @@
 
   private static PsiReference[] getReferencesFromFormatString(@NotNull final PyStringLiteralExpression element) {
     final List<PyStringFormatParser.SubstitutionChunk> chunks = PyStringFormatParser.filterSubstitutions(
-      PyStringFormatParser.parseNewStyleFormat(element.getStringValue()));
+      PyStringFormatParser.parseNewStyleFormat(element.getText()));
     return getReferencesFromChunks(element, chunks, false);
   }
 
   private static PsiReference[] getReferencesFromPercentString(@NotNull final PyStringLiteralExpression element) {
     final List<PyStringFormatParser.SubstitutionChunk>
-      chunks = PyStringFormatParser.filterSubstitutions(PyStringFormatParser.parsePercentFormat(element.getStringValue()));
+      chunks = PyStringFormatParser.filterSubstitutions(PyStringFormatParser.parsePercentFormat(element.getText()));
     return getReferencesFromChunks(element, chunks, true);
   }
 
