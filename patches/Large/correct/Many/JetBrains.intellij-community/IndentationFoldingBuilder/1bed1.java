diff --git a/platform/lang-impl/src/com/intellij/indentation/IndentationFoldingBuilder.java b/platform/lang-impl/src/com/intellij/indentation/IndentationFoldingBuilder.java
index 5322803..b084041 100644
--- a/platform/lang-impl/src/com/intellij/indentation/IndentationFoldingBuilder.java
+++ b/platform/lang-impl/src/com/intellij/indentation/IndentationFoldingBuilder.java
@@ -32,7 +32,7 @@
   private void collectDescriptors(@NotNull final ASTNode node, @NotNull final List<FoldingDescriptor> descriptors) {
     final ASTNode[] children = node.getChildren(myTokenSet);
     if (children.length > 0) {
-      if (node.getTreeParent() !=null) {
+      if (node.getTreeParent() !=null && node.getTextLength() > 0) {
         descriptors.add(new FoldingDescriptor(node, node.getTextRange()));
       }
       for (ASTNode child : children) {
