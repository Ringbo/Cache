diff --git a/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeLambdaInspection.java b/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeLambdaInspection.java
index 9d66555..71fc1f2 100644
--- a/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeLambdaInspection.java
+++ b/java/java-analysis-impl/src/com/intellij/codeInspection/AnonymousCanBeLambdaInspection.java
@@ -159,7 +159,7 @@
     }
 
     final PsiCall call = LambdaUtil.treeWalkUp(topExpr);
-    if (call != null) {
+    if (call != null && call.resolveMethod() != null) {
       final int offsetInTopCall = aClass.getTextRange().getStartOffset() - call.getTextRange().getStartOffset();
       final PsiCall copyCall = (PsiCall)call.copy();
       final PsiAnonymousClass classArg = PsiTreeUtil.getParentOfType(copyCall.findElementAt(offsetInTopCall), PsiAnonymousClass.class);
