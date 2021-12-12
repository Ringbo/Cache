diff --git a/python/src/com/jetbrains/python/PythonFoldingBuilder.java b/python/src/com/jetbrains/python/PythonFoldingBuilder.java
index 81349b8..d9762e1 100644
--- a/python/src/com/jetbrains/python/PythonFoldingBuilder.java
+++ b/python/src/com/jetbrains/python/PythonFoldingBuilder.java
@@ -48,7 +48,7 @@
             IElementType elType = node.getTreeParent().getElementType();
             if (elType == PyElementTypes.FUNCTION_DECLARATION || elType == PyElementTypes.CLASS_DECLARATION) {
                 ASTNode colon = node.getTreeParent().findChildByType(PyTokenTypes.COLON);
-                if (colon != null) {
+                if (colon != null && colon.getStartOffset() + 1 < node.getStartOffset() + node.getTextLength()) {
                     descriptors.add(new FoldingDescriptor(node,
                             new TextRange(colon.getStartOffset() + 1, node.getStartOffset() + node.getTextLength())));
                 }
