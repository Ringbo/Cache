diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/EditorPainter.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/EditorPainter.java
index ab7db40..4857c6e 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/EditorPainter.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/EditorPainter.java
@@ -1141,7 +1141,7 @@
     if (marginWidthConsumer != null && !marginReached &&
         (visualLine == myEditor.getCaretModel().getVisualPosition().line || x > marginColumns * myView.getPlainSpaceWidth())) {
       int endLogicalColumn = myView.offsetToLogicalPosition(visualLineEndOffset).column;
-      if (endLogicalColumn < marginColumns) {
+      if (endLogicalColumn <= marginColumns) {
         marginWidthConsumer.process(x + (marginColumns - endLogicalColumn) * myView.getPlainSpaceWidth());
       }
     }
