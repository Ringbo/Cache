diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/CaretModelImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/CaretModelImpl.java
index 9d4e8af..c8a218c 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/CaretModelImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/CaretModelImpl.java
@@ -213,7 +213,7 @@
 
     int newLineNumber = visualCaret.line + lineShift;
     int newColumnNumber = visualCaret.column + columnShift;
-    if (desiredX >= 0) {
+    if (desiredX >= 0 && !ApplicationManager.getApplication().isUnitTestMode()) {
       newColumnNumber = myEditor.xyToVisualPosition(new Point(desiredX, Math.max(0, newLineNumber) * myEditor.getLineHeight())).column;
     }
 
