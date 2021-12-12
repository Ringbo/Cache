diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java
index 25c072b..bbd7f63 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/EditorMarkupModelImpl.java
@@ -564,7 +564,7 @@
 
       final Rectangle bounds = getBounds();
 
-      g.setColor(myEditor.getBackroundColor());
+      g.setColor(myEditor.getBackgroundColor());
       g.fillRect(0, 0, bounds.width, bounds.height);
 
       g.setColor(ButtonlessScrollBarUI.TRACK_BACKGROUND);
@@ -630,7 +630,7 @@
     protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
       Rectangle bounds = new Rectangle(trackBounds);
 
-      g.setColor(myEditor.getBackroundColor());
+      g.setColor(myEditor.getBackgroundColor());
       g.fillRect(0, 0, bounds.width, bounds.height);
 
       bounds.width /= 1.20;
