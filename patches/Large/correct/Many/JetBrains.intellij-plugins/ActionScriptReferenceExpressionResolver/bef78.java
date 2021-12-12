diff --git a/flex/src/com/intellij/javascript/flex/resolve/ActionScriptReferenceExpressionResolver.java b/flex/src/com/intellij/javascript/flex/resolve/ActionScriptReferenceExpressionResolver.java
index 87b60f0..ac63c80 100644
--- a/flex/src/com/intellij/javascript/flex/resolve/ActionScriptReferenceExpressionResolver.java
+++ b/flex/src/com/intellij/javascript/flex/resolve/ActionScriptReferenceExpressionResolver.java
@@ -76,7 +76,7 @@
     }
 
     SinkResolveProcessor<ResolveResultSink> localProcessor;
-    if (myLocalResolve) {
+    if (myUnqualifiedOrLocalResolve) {
       final PsiElement topParent = JSResolveUtil.getTopReferenceParent(myParent);
       localProcessor = new SinkResolveProcessor<ResolveResultSink>(myReferencedName, myRef, new ResolveResultSink(myRef, myReferencedName)) {
         @Override
@@ -158,11 +158,11 @@
   @Override
   protected void prepareProcessor(WalkUpResolveProcessor processor, @NotNull SinkResolveProcessor<ResolveResultSink> localProcessor) {
     boolean inDefinition = false;
-    boolean allowOnlyCompleteMatches = myLocalResolve && localProcessor.isEncounteredDynamicClasses();
+    boolean allowOnlyCompleteMatches = myUnqualifiedOrLocalResolve && localProcessor.isEncounteredDynamicClasses();
 
     if (myParent instanceof JSDefinitionExpression) {
       inDefinition = true;
-      if (myLocalResolve && localProcessor.processingEncounteredAnyTypeAccess()) allowOnlyCompleteMatches = false;
+      if (myUnqualifiedOrLocalResolve && localProcessor.processingEncounteredAnyTypeAccess()) allowOnlyCompleteMatches = false;
       else allowOnlyCompleteMatches = true;
     } else if (myQualifier instanceof JSThisExpression && localProcessor.processingEncounteredAnyTypeAccess()) {
       processor.allowPartialResults();
