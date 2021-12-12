diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorGutterComponentImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorGutterComponentImpl.java
index a20dd6c..23cb256 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorGutterComponentImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorGutterComponentImpl.java
@@ -282,7 +282,7 @@
   private void drawEditorBackgroundForRange(Graphics g, int startOffset, int endOffset, TextAttributes attributes,
                                             Color defaultBackgroundColor, Color defaultForegroundColor, int startX) {
     VisualPosition visualStart = myEditor.offsetToVisualPosition(startOffset, true, false);
-    VisualPosition visualEnd   = myEditor.offsetToVisualPosition(endOffset, false, true);
+    VisualPosition visualEnd   = myEditor.offsetToVisualPosition(endOffset, false, false);
     for (int line = visualStart.getLine(); line <= visualEnd.getLine(); line++) {
       if (line == visualStart.getLine()) {
         if (visualStart.getColumn() == 0) {
