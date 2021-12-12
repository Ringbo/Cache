diff --git a/lang-impl/src/com/intellij/codeInspection/ex/ToolsImpl.java b/lang-impl/src/com/intellij/codeInspection/ex/ToolsImpl.java
index c555fe5..70cf7f0 100644
--- a/lang-impl/src/com/intellij/codeInspection/ex/ToolsImpl.java
+++ b/lang-impl/src/com/intellij/codeInspection/ex/ToolsImpl.java
@@ -242,7 +242,7 @@
   }
 
   public boolean isEnabled(NamedScope namedScope) {
-    if (myTools != null) {
+    if (namedScope != null && myTools != null) {
       for (ScopeToolState state : myTools) {
         if (Comparing.equal(namedScope, state.getScope())) return state.isEnabled();
       }
@@ -356,7 +356,7 @@
   }
 
   public HighlightDisplayLevel getLevel(final NamedScope scope) {
-    if (myTools != null){
+    if (myTools != null && scope != null){
       for (ScopeToolState state : myTools) {
         if (Comparing.equal(state.getScope(), scope)) {
           return state.getLevel();
