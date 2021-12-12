diff --git a/java/java-impl/src/com/intellij/codeInsight/completion/ReferenceExpressionCompletionContributor.java b/java/java-impl/src/com/intellij/codeInsight/completion/ReferenceExpressionCompletionContributor.java
index 546d759..7462719 100644
--- a/java/java-impl/src/com/intellij/codeInsight/completion/ReferenceExpressionCompletionContributor.java
+++ b/java/java-impl/src/com/intellij/codeInsight/completion/ReferenceExpressionCompletionContributor.java
@@ -388,7 +388,7 @@
     if (varType instanceof PsiEllipsisType) {
       varType = ((PsiEllipsisType)varType).getComponentType();
     }
-    if (varType instanceof PsiWildcardType) {
+    if (varType instanceof PsiWildcardType || varType instanceof PsiCapturedWildcardType) {
       varType = TypeConversionUtil.erasure(expectedType);
     }
 
