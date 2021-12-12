diff --git a/src/com/goide/editor/GoFoldingBuilder.java b/src/com/goide/editor/GoFoldingBuilder.java
index 24689de..963ae4f 100644
--- a/src/com/goide/editor/GoFoldingBuilder.java
+++ b/src/com/goide/editor/GoFoldingBuilder.java
@@ -164,7 +164,7 @@
 
     for (GoCompositeLit compositeLit : PsiTreeUtil.findChildrenOfType(file, GoCompositeLit.class)) {
       GoLiteralValue literalValue = compositeLit.getLiteralValue();
-      if (literalValue.getElementList().size() > 1) {
+      if (literalValue != null && literalValue.getElementList().size() > 1) {
         fold(literalValue, literalValue.getLbrace(), literalValue.getRbrace(), "{...}", result);
       }
     }
