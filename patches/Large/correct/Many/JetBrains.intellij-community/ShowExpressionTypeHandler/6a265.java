diff --git a/platform/lang-impl/src/com/intellij/codeInsight/hint/ShowExpressionTypeHandler.java b/platform/lang-impl/src/com/intellij/codeInsight/hint/ShowExpressionTypeHandler.java
index ec04c04..d36a372 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/hint/ShowExpressionTypeHandler.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/hint/ShowExpressionTypeHandler.java
@@ -115,7 +115,7 @@
     TextRange range = EditorUtil.getSelectionInAnyMode(editor);
     final Map<PsiElement, ExpressionTypeProvider> map = ContainerUtil.newLinkedHashMap();
     int offset = !range.isEmpty() ? range.getStartOffset() : TargetElementUtil.adjustOffset(file, editor.getDocument(), range.getStartOffset());
-    for (int i = 0; i < 3 && map.isEmpty() && offset > i; i++) {
+    for (int i = 0; i < 3 && map.isEmpty() && offset >= i; i++) {
       PsiElement elementAt = file.findElementAt(offset - i);
       if (elementAt == null) continue;
       for (ExpressionTypeProvider handler : handlers) {
