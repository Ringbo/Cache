diff --git a/python/src/com/jetbrains/python/formatter/PyBlock.java b/python/src/com/jetbrains/python/formatter/PyBlock.java
index 4bb0e39..1d26540 100644
--- a/python/src/com/jetbrains/python/formatter/PyBlock.java
+++ b/python/src/com/jetbrains/python/formatter/PyBlock.java
@@ -295,7 +295,7 @@
 
   private Indent getChildIndent(int newChildIndex) {
     ASTNode lastChild = getLastNonSpaceChild(_node, false);
-    if (lastChild != null && lastChild.getElementType() == PyElementTypes.STATEMENT_LIST && _subBlocks.size() > newChildIndex) {
+    if (lastChild != null && lastChild.getElementType() == PyElementTypes.STATEMENT_LIST && _subBlocks.size() >= newChildIndex) {
       PyBlock insertAfterBlock = (PyBlock)_subBlocks.get(newChildIndex - 1);
       ASTNode afterNode = insertAfterBlock.getNode();
 
