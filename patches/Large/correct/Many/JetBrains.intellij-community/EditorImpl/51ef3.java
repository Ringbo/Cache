diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
index 335c53b..ffbf6b1 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorImpl.java
@@ -4325,10 +4325,10 @@
     };
   }
 
-  private boolean isInsideGutterOnlyFoldingArea(@NotNull MouseEvent e) {
+  private boolean isInsideGutterWhitespaceArea(@NotNull MouseEvent e) {
     EditorMouseEventArea area = getMouseEventArea(e);
     return area == EditorMouseEventArea.FOLDING_OUTLINE_AREA &&
-           myGutterComponent.convertX(e.getX()) <= myGutterComponent.getWhitespaceSeparatorOffset();
+           myGutterComponent.convertX(e.getX()) > myGutterComponent.getWhitespaceSeparatorOffset();
   }
 
   @Override
@@ -5963,10 +5963,9 @@
       // Don't move caret on mouse press above gutter line markers area (a place where break points, 'override', 'implements' etc icons
       // are drawn) and annotations area. E.g. we don't want to change caret position if a user sets new break point (clicks
       // at 'line markers' area).
-      if (e.getSource() != myGutterComponent ||
-          (eventArea != EditorMouseEventArea.LINE_MARKERS_AREA &&
-          eventArea != EditorMouseEventArea.ANNOTATIONS_AREA &&
-          !isInsideGutterOnlyFoldingArea(e)))
+      if (eventArea == EditorMouseEventArea.LINE_NUMBERS_AREA ||
+          eventArea == EditorMouseEventArea.EDITING_AREA ||
+          isInsideGutterWhitespaceArea(e))
       {
         VisualPosition visualPosition = myUseNewRendering ? getTargetPosition(x, y, true) : null;
         LogicalPosition pos = myUseNewRendering ? visualToLogicalPosition(visualPosition) : getLogicalPositionForScreenPos(x, y, true);
