diff --git a/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/ImagePanelComponent.java b/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/ImagePanelComponent.java
index bcc40ee..55d44bf 100644
--- a/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/ImagePanelComponent.java
+++ b/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/ImagePanelComponent.java
@@ -118,7 +118,7 @@
 		int imageOffsetX = ((width - imageWidth) / 2) - (SEPARATOR / 2);
 		for (final BufferedImage image : images)
 		{
-			graphics.drawImage(image, imageOffsetX + ((width / images.size()) - image.getWidth()) / 2, y, null);
+			graphics.drawImage(image, imageOffsetX + ((imageWidth / images.size()) - image.getWidth()) / 2, y, null);
 			imageOffsetX += image.getWidth() + SEPARATOR;
 		}
 
