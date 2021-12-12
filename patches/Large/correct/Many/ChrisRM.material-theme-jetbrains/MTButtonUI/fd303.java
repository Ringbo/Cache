diff --git a/src/main/java/com/chrisrm/idea/ui/MTButtonUI.java b/src/main/java/com/chrisrm/idea/ui/MTButtonUI.java
index 98fc780..e1ac638 100644
--- a/src/main/java/com/chrisrm/idea/ui/MTButtonUI.java
+++ b/src/main/java/com/chrisrm/idea/ui/MTButtonUI.java
@@ -137,9 +137,9 @@
             final GraphicsConfig config = GraphicsUtil.setupAAPainting(g);
             if (c.isEnabled() && border != null) {
                 final Insets ins = border.getBorderInsets(c);
-                final int xOff = 3;
+                final int xOff = 0;
                 final int yOff = 0;
-                final int width = w - 2 * JBUI.scale(xOff);
+                final int width = w;
 
                 if (c.hasFocus()) {
                     g.setPaint(UIUtil.getGradientPaint(0, 0, focusedButtonColor, 0, h, focusedButtonColor));
@@ -149,7 +149,7 @@
                     g.setPaint(UIUtil.getGradientPaint(0, 0, background, 0, h, background));
                 }
                 int rad = JBUI.scale(3);
-                g.fillRoundRect(JBUI.scale(xOff), yOff, w * JBUI.scale(xOff), h, rad, rad);
+                g.fillRoundRect(xOff, yOff, w, h, rad, rad);
             }
             config.restore();
             return true;
