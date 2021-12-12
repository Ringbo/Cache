diff --git a/python/src/com/jetbrains/python/documentation/DocStringReferenceProvider.java b/python/src/com/jetbrains/python/documentation/DocStringReferenceProvider.java
index 0e1a26b..296f232 100644
--- a/python/src/com/jetbrains/python/documentation/DocStringReferenceProvider.java
+++ b/python/src/com/jetbrains/python/documentation/DocStringReferenceProvider.java
@@ -69,7 +69,7 @@
       if (PyNames.isIdentifier(s)) {
         result.add(new DocStringParameterReference(element, name.getTextRange().shiftRight(offset), refType));
       }
-      if (!refType.equals(StructuredDocString.PARAMETER_TYPE)) {
+      if (refType.equals(StructuredDocString.PARAMETER_TYPE)) {
         final Substring type = docString.getParamTypeSubstring(s);
         if (type != null) {
           result.addAll(parseTypeReferences(element, type, offset));
