diff --git a/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLiteralExpressionImpl.java b/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLiteralExpressionImpl.java
index ed54d26..74d1350 100644
--- a/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLiteralExpressionImpl.java
+++ b/java/java-psi-impl/src/com/intellij/psi/impl/source/tree/java/PsiLiteralExpressionImpl.java
@@ -176,7 +176,7 @@
     }
     if (type == JavaTokenType.STRING_LITERAL) {
       String innerText = getInnerText();
-      return innerText == null ? null : internedParseStringCharacters(text);
+      return innerText == null ? null : internedParseStringCharacters(innerText);
     }
     if (type == JavaTokenType.TRUE_KEYWORD) {
       return Boolean.TRUE;
