diff --git a/idea/src/org/jetbrains/jet/plugin/annotations/JetPsiChecker.java b/idea/src/org/jetbrains/jet/plugin/annotations/JetPsiChecker.java
index 6d7bce3..4b0f3d1 100644
--- a/idea/src/org/jetbrains/jet/plugin/annotations/JetPsiChecker.java
+++ b/idea/src/org/jetbrains/jet/plugin/annotations/JetPsiChecker.java
@@ -108,7 +108,7 @@
                         if (diagnostic.getSeverity() == Severity.ERROR) {
                             if (diagnostic instanceof Errors.UnresolvedReferenceDiagnostic) {
                                 Errors.UnresolvedReferenceDiagnostic unresolvedReferenceDiagnostic = (Errors.UnresolvedReferenceDiagnostic) diagnostic;
-                                JetReferenceExpression referenceExpression = unresolvedReferenceDiagnostic.getReference();
+                                JetReferenceExpression referenceExpression = unresolvedReferenceDiagnostic.getPsiElement();
                                 PsiReference reference = referenceExpression.getReference();
                                 if (reference instanceof MultiRangeReference) {
                                     MultiRangeReference mrr = (MultiRangeReference) reference;
