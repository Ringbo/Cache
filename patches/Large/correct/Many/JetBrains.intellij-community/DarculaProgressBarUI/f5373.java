diff --git a/platform/platform-impl/src/com/intellij/ide/ui/laf/darcula/ui/DarculaProgressBarUI.java b/platform/platform-impl/src/com/intellij/ide/ui/laf/darcula/ui/DarculaProgressBarUI.java
index a99132f..33e0c51 100644
--- a/platform/platform-impl/src/com/intellij/ide/ui/laf/darcula/ui/DarculaProgressBarUI.java
+++ b/platform/platform-impl/src/com/intellij/ide/ui/laf/darcula/ui/DarculaProgressBarUI.java
@@ -95,7 +95,7 @@
 
         BufferedImage pathTile = UIUtil.createImage(getPeriodLength(), barRectHeight, BufferedImage.TYPE_INT_ARGB);
         Graphics2D gpt = pathTile.createGraphics();
-        GraphicsUtil.setupAAPainting(g);
+        GraphicsUtil.setupAAPainting(gpt);
         gpt.setColor(new JBColor(Gray._165, Gray._88));
         gpt.fill(path);
 
@@ -105,7 +105,7 @@
 
           TexturePaint pathPaint =
             new TexturePaint(pathTile, new Rectangle2D.Double(
-              getPeriodLength() - progressOffset,0, getPeriodLength(), barRectHeight));
+              Math.rint(getPeriodLength() - progressOffset),0, getPeriodLength(), barRectHeight));
           pathPaintList.add(pathPaint);
         }
 
