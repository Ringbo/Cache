diff --git a/src/com/goide/editor/GoFoldingBuilder.java b/src/com/goide/editor/GoFoldingBuilder.java
index dc77e2c..7a9430e 100644
--- a/src/com/goide/editor/GoFoldingBuilder.java
+++ b/src/com/goide/editor/GoFoldingBuilder.java
@@ -44,7 +44,7 @@
 
     for (GoFunctionOrMethodDeclaration method : ContainerUtil.concat(file.getMethods(), file.getFunctions())) {
       GoBlock block = method.getBlock();
-      if (block != null) result.add(new FoldingDescriptor(block, block.getTextRange()));
+      if (block != null && block.getTextRange().getLength() > 1) result.add(new FoldingDescriptor(block, block.getTextRange()));
     }
 
     if (!quick) {
