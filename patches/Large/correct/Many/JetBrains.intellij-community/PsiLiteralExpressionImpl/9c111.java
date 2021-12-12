diff --git a/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLiteralExpressionImpl.java b/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLiteralExpressionImpl.java
index 51cce62..d3b1745 100644
--- a/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLiteralExpressionImpl.java
+++ b/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLiteralExpressionImpl.java
@@ -126,7 +126,7 @@
       return PsiLiteralUtil.parseFloat(text);
     }
     if (type == JavaTokenType.DOUBLE_LITERAL) {
-      return PsiLiteralUtil.parseFloat(text);
+      return PsiLiteralUtil.parseDouble(text);
     }
     if (type == JavaTokenType.CHARACTER_LITERAL) {
       if (StringUtil.endsWithChar(text, '\'')) {
