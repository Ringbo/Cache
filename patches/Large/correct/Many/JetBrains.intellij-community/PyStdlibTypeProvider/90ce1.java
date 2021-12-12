diff --git a/python/src/com/jetbrains/python/codeInsight/stdlib/PyStdlibTypeProvider.java b/python/src/com/jetbrains/python/codeInsight/stdlib/PyStdlibTypeProvider.java
index 68d3298..06dcb2a 100644
--- a/python/src/com/jetbrains/python/codeInsight/stdlib/PyStdlibTypeProvider.java
+++ b/python/src/com/jetbrains/python/codeInsight/stdlib/PyStdlibTypeProvider.java
@@ -78,7 +78,7 @@
   public PyType getReturnType(@NotNull PyFunction function, @Nullable PyQualifiedExpression callSite, @NotNull TypeEvalContext context) {
     final String qname = getQualifiedName(function, callSite);
     if (qname != null) {
-      if (callSite != null) {
+      if (OPEN_FUNCTIONS.contains(qname) && callSite != null) {
         PyTypeChecker.AnalyzeCallResults results = PyTypeChecker.analyzeCallSite(callSite, context);
         if (results != null) {
           final PyType overloaded = getOverloadedReturnTypeByQName(results.getArguments(), qname, function, context);
