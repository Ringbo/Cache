diff --git a/java/java-impl/src/com/intellij/codeInspection/SimplifyStreamApiCallChainsInspection.java b/java/java-impl/src/com/intellij/codeInspection/SimplifyStreamApiCallChainsInspection.java
index 0a9a90b..411c1ad 100644
--- a/java/java-impl/src/com/intellij/codeInspection/SimplifyStreamApiCallChainsInspection.java
+++ b/java/java-impl/src/com/intellij/codeInspection/SimplifyStreamApiCallChainsInspection.java
@@ -1879,7 +1879,7 @@
       CommentTracker ct = new CommentTracker();
       ct.markUnchanged(call);
       PsiElement result = ct.replaceAndRestoreComments(context.myStringJoinCall, call);
-      return JavaCodeStyleManager.getInstance(call.getProject()).shortenClassReferences(result);
+      return JavaCodeStyleManager.getInstance(result.getProject()).shortenClassReferences(result);
     }
 
     static CallHandler<CallChainSimplification> handler() {
