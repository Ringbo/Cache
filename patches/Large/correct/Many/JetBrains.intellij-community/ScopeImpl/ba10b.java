diff --git a/python/src/com/jetbrains/python/codeInsight/dataflow/scope/impl/ScopeImpl.java b/python/src/com/jetbrains/python/codeInsight/dataflow/scope/impl/ScopeImpl.java
index 3b48330..a5d8da6 100644
--- a/python/src/com/jetbrains/python/codeInsight/dataflow/scope/impl/ScopeImpl.java
+++ b/python/src/com/jetbrains/python/codeInsight/dataflow/scope/impl/ScopeImpl.java
@@ -108,7 +108,7 @@
   @NotNull
   @Override
   public List<NameDefiner> getNameDefiners() {
-    if (myNamedElements == null) {
+    if (myNameDefiners == null) {
       collectDeclarations();
     }
     return myNameDefiners;
