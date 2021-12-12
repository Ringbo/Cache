diff --git a/source/com/intellij/psi/formatter/java/AbstractJavaBlock.java b/source/com/intellij/psi/formatter/java/AbstractJavaBlock.java
index c569e2e..9178ee7 100644
--- a/source/com/intellij/psi/formatter/java/AbstractJavaBlock.java
+++ b/source/com/intellij/psi/formatter/java/AbstractJavaBlock.java
@@ -336,14 +336,14 @@
     final ArrayList<Block> subBlocks = new ArrayList<Block>();
     final ASTNode firstNode = subNodes.get(0);
     if (firstNode.getElementType() == ElementType.DOT) {
-      subBlocks.add(createJavaBlock(firstNode, getSettings(), Formatter.getInstance().createContinuationIndent(),
+      subBlocks.add(createJavaBlock(firstNode, getSettings(), Formatter.getInstance().getNoneIndent(),
                                     null,
                                     null));
       subNodes.remove(0);
       if (!subNodes.isEmpty()) {
         subBlocks.add(createSynthBlock(subNodes, wrap));
       }
-      return new SynteticCodeBlock(subBlocks, null, mySettings, Formatter.getInstance().getNoneIndent(), wrap);
+      return new SynteticCodeBlock(subBlocks, null, mySettings, Formatter.getInstance().createContinuationIndent(), wrap);
     } else {
       return new SynteticCodeBlock(createJavaBlocks(subNodes), null, mySettings,
                                    Formatter.getInstance().createContinuationWithoutFirstIndent(), null);
