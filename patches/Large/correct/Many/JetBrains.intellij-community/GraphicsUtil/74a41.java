diff --git a/platform/util/src/com/intellij/util/ui/GraphicsUtil.java b/platform/util/src/com/intellij/util/ui/GraphicsUtil.java
index 5b7e749..560b5dec 100644
--- a/platform/util/src/com/intellij/util/ui/GraphicsUtil.java
+++ b/platform/util/src/com/intellij/util/ui/GraphicsUtil.java
@@ -25,21 +25,21 @@
  */
 public class GraphicsUtil {
   public static void setupAntialiasing(@NotNull Graphics g2) {
-    setupAntialiasing(g2, true);
+    setupAntialiasing(g2, true, false);
   }
 
-  public static void setupAntialiasing(Graphics g2, boolean enable) {
+  public static void setupAntialiasing(Graphics g2, boolean enableAA, boolean ignoreSystemSettings) {
     if (g2 instanceof Graphics2D) {
       Graphics2D g = (Graphics2D)g2;
       Toolkit tk = Toolkit.getDefaultToolkit();
       //noinspection HardCodedStringLiteral
       Map map = (Map)tk.getDesktopProperty("awt.font.desktophints");
 
-      if (map != null) {
+      if (map != null && !ignoreSystemSettings) {
         g.addRenderingHints(map);
       } else {
         g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
-                           enable ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
+                           enableAA ? RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HBGR : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
       }
     }
   }
