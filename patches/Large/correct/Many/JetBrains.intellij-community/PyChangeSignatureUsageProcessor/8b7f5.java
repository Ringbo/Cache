diff --git a/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureUsageProcessor.java b/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureUsageProcessor.java
index 87447ab..45f259b 100644
--- a/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureUsageProcessor.java
+++ b/python/src/com/jetbrains/python/refactoring/changeSignature/PyChangeSignatureUsageProcessor.java
@@ -210,7 +210,7 @@
                              int currentIndex,
                              int oldIndex,
                              PyExpression[] arguments) {
-    final String paramName = info.getName();
+    final String paramName = info.getOldName();
     final PyKeywordArgument keywordArgument = argumentList.getKeywordArgument(paramName);
     if (keywordArgument != null) {
       params.add(keywordArgument.getText());
