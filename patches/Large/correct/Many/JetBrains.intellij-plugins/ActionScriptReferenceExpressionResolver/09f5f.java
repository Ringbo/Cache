diff --git a/flex/src/com/intellij/javascript/flex/resolve/ActionScriptReferenceExpressionResolver.java b/flex/src/com/intellij/javascript/flex/resolve/ActionScriptReferenceExpressionResolver.java
index 5c0a044..0ebd0ba 100644
--- a/flex/src/com/intellij/javascript/flex/resolve/ActionScriptReferenceExpressionResolver.java
+++ b/flex/src/com/intellij/javascript/flex/resolve/ActionScriptReferenceExpressionResolver.java
@@ -143,7 +143,7 @@
     }
 
     ResolveResult[] results =
-      resolveFromIndices(localProcessor, null);
+      resolveFromIndices(localProcessor);
 
     if (results.length == 0 && localProcessor.isEncounteredXmlLiteral()) {
       return dummyResult(myRef);
@@ -153,9 +153,7 @@
   }
 
   @Override
-  protected void prepareProcessor(JSType qualifierType,
-                                  WalkUpResolveProcessor processor,
-                                  SinkResolveProcessor localProcessor) {
+  protected void prepareProcessor(WalkUpResolveProcessor processor, SinkResolveProcessor localProcessor) {
     boolean inDefinition = false;
     boolean allowOnlyCompleteMatches = myLocalResolve && localProcessor.isEncounteredDynamicClasses();
 
