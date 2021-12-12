diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/EditorPainter.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/EditorPainter.java
index f9cef65..9e623c2 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/EditorPainter.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/view/EditorPainter.java
@@ -735,7 +735,8 @@
       }
       else {
         float xNew = fragment.getEndX();
-        painter.paint(g, fragment, 0, fragment.getEndOffset() - fragment.getStartOffset(), getFoldRegionAttributes(foldRegion), x, xNew, y);
+        painter.paint(g, fragment, 0, fragment.getEndVisualColumn() - fragment.getStartVisualColumn(), getFoldRegionAttributes(foldRegion), 
+                      x, xNew, y);
         x = xNew;
         prevEndOffset = -1;
         it = null;
