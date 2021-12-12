diff --git a/flex/src/com/intellij/lang/javascript/generation/ActionScriptGenerateToStringHandler.java b/flex/src/com/intellij/lang/javascript/generation/ActionScriptGenerateToStringHandler.java
index 5d93384..ab2d9bb 100644
--- a/flex/src/com/intellij/lang/javascript/generation/ActionScriptGenerateToStringHandler.java
+++ b/flex/src/com/intellij/lang/javascript/generation/ActionScriptGenerateToStringHandler.java
@@ -74,7 +74,7 @@
 
 
   protected void collectCandidates(final JSClass clazz, final Collection<JSNamedElementNode> candidates) {
-    collectJSVariables(clazz, candidates, false, false, true, true);
+    collectJSVariables(clazz, candidates, false, false, true, true, true);
   }
 
   protected boolean canHaveEmptySelectedElements() {
