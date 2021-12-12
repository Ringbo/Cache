diff --git a/source/com/intellij/psi/formatter/PsiBasedFormattingModel.java b/source/com/intellij/psi/formatter/PsiBasedFormattingModel.java
index 53f1759..c101977 100644
--- a/source/com/intellij/psi/formatter/PsiBasedFormattingModel.java
+++ b/source/com/intellij/psi/formatter/PsiBasedFormattingModel.java
@@ -138,7 +138,7 @@
       }
     }
     final ASTNode found = myASTNode.findLeafElementAt(offset);
-    if (found.getElementType() == ElementType.XML_COMMENT_START) {
+    if (found != null && found.getElementType() == ElementType.XML_COMMENT_START) {
       return found.getTreeParent();
     } else {
       return found;
