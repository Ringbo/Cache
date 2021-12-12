diff --git a/Dart/src/com/jetbrains/lang/dart/ide/completion/DartServerCompletionContributor.java b/Dart/src/com/jetbrains/lang/dart/ide/completion/DartServerCompletionContributor.java
index 59abe04..0931362 100644
--- a/Dart/src/com/jetbrains/lang/dart/ide/completion/DartServerCompletionContributor.java
+++ b/Dart/src/com/jetbrains/lang/dart/ide/completion/DartServerCompletionContributor.java
@@ -78,7 +78,7 @@
     final PsiElement parent = psiElement != null ? psiElement.getParent() : null;
     final PsiElement parentParent = parent instanceof DartStringLiteralExpression ? parent.getParent() : null;
     if (parentParent instanceof DartUriElement) {
-      final int uriStringOffset = ((DartUriElement)parentParent).getUriStringAndItsRange().second.getEndOffset();
+      final int uriStringOffset = ((DartUriElement)parentParent).getUriStringAndItsRange().second.getStartOffset();
       if (parameters.getOffset() >= parentParent.getTextRange().getStartOffset() + uriStringOffset) {
         return parentParent.getText().substring(uriStringOffset, parameters.getOffset() - parentParent.getTextRange().getStartOffset());
       }
