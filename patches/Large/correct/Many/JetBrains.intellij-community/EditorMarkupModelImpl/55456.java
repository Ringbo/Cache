diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java
index e3ebb00..30d6469 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java
@@ -306,7 +306,7 @@
 
       try {
         if (myErrorStripeRenderer != null) {
-          myErrorStripeRenderer.paint(this, g, new Rectangle(3, 2, ERROR_ICON_WIDTH, ERROR_ICON_HEIGHT));
+          myErrorStripeRenderer.paint(this, g, new Rectangle(5, 2, ERROR_ICON_WIDTH, ERROR_ICON_HEIGHT));
         }
       }
       finally {
@@ -350,7 +350,7 @@
 
     @Override
     protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
-      int shift = isMirrored() ? -6 : 6;
+      int shift = isMirrored() ? -8 : 8;
       g.translate(shift, 0);
       super.paintThumb(g, c, thumbBounds);
       g.translate(-shift, 0);
@@ -358,12 +358,12 @@
 
     @Override
     protected int adjustThumbWidth(int width) {
-      return width - 1;
+      return width - 2;
     }
 
     @Override
     protected int getThickness() {
-      return super.getThickness() + 4;
+      return super.getThickness() + 6;
     }
 
     @Override
@@ -507,12 +507,12 @@
                           Color color,
                           boolean drawTopDecoration,
                           boolean drawBottomDecoration) {
-      int x = isMirrored() ? 2 : 3;
+      int x = isMirrored() ? 3 : 5;
       int paintWidth = width;
       if (thinErrorStripeMark) {
         paintWidth /= 2;
         paintWidth += 1;
-        x = isMirrored() ? width : 0;
+        x = isMirrored() ? width + 2 : 0;
       }
       if (color == null) return;
       g.setColor(color);
