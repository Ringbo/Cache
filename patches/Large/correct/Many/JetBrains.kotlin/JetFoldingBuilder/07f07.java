diff --git a/idea/src/org/jetbrains/jet/plugin/JetFoldingBuilder.java b/idea/src/org/jetbrains/jet/plugin/JetFoldingBuilder.java
index c09fc0e..d44a3c8 100644
--- a/idea/src/org/jetbrains/jet/plugin/JetFoldingBuilder.java
+++ b/idea/src/org/jetbrains/jet/plugin/JetFoldingBuilder.java
@@ -38,7 +38,7 @@
             ASTNode next = node.getTreeNext();
             if (next != null) {
                 ASTNode nextNext = next.getTreeNext();
-                if (nextNext.getElementType() == JetTokens.IDE_TEMPLATE_END) {
+                if (nextNext != null && nextNext.getElementType() == JetTokens.IDE_TEMPLATE_END) {
                     TextRange range = new TextRange(node.getStartOffset(), nextNext.getStartOffset() + nextNext.getTextLength());
                     descriptors.add(new FoldingDescriptor(next, range, null, Collections.<Object>emptySet(), true));
                 }
