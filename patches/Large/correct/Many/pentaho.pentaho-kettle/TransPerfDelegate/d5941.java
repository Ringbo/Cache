diff --git a/src-ui/org/pentaho/di/ui/spoon/trans/TransPerfDelegate.java b/src-ui/org/pentaho/di/ui/spoon/trans/TransPerfDelegate.java
index b3febe0..6c16013 100644
--- a/src-ui/org/pentaho/di/ui/spoon/trans/TransPerfDelegate.java
+++ b/src-ui/org/pentaho/di/ui/spoon/trans/TransPerfDelegate.java
@@ -531,7 +531,7 @@
 		renderer.setSeriesOutlineStroke(1, new BasicStroke(2.5f));
 		renderer.setSeriesShape(0, new Ellipse2D.Double(-3.0, -3.0, 6.0, 6.0));
 		
-		BufferedImage bufferedImage = chart.createBufferedImage(bounds.width, bounds.height);
+		BufferedImage bufferedImage = chart.createBufferedImage(bounds.width, bounds.height, BufferedImage.TYPE_INT_RGB, null);
 		ImageData imageData = ImageUtil.convertToSWT(bufferedImage);
 		
 		// dispose previous image...
