diff --git a/platform/util/src/com/intellij/util/ui/UIUtil.java b/platform/util/src/com/intellij/util/ui/UIUtil.java
index dc6f6e4..40e27c2 100644
--- a/platform/util/src/com/intellij/util/ui/UIUtil.java
+++ b/platform/util/src/com/intellij/util/ui/UIUtil.java
@@ -165,7 +165,7 @@
                                           final int height,
                                           final Color top,
                                           final Color bottom) {
-    BufferedImage img = new BufferedImage(10, height, BufferedImage.TYPE_INT_RGB);
+    BufferedImage img = new BufferedImage(50, height, BufferedImage.TYPE_INT_RGB);
     Graphics2D imageGraphics = (Graphics2D)img.getGraphics();
     imageGraphics.setPaint(new GradientPaint(0, 0, top, 0, height, bottom));
     imageGraphics.fillRect(0, 0, 50, height);
