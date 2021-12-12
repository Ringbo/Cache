diff --git a/portal-impl/src/com/liferay/portal/image/ImageToolImpl.java b/portal-impl/src/com/liferay/portal/image/ImageToolImpl.java
index 7e8e7b9..096a6ad 100644
--- a/portal-impl/src/com/liferay/portal/image/ImageToolImpl.java
+++ b/portal-impl/src/com/liferay/portal/image/ImageToolImpl.java
@@ -231,7 +231,7 @@
 	public RenderedImage crop(
 		RenderedImage renderedImage, int height, int width, int x, int y) {
 
-		Rectangle rectangle = new Rectangle(width, height);
+		Rectangle rectangle = new Rectangle(x, y, width, height);
 
 		Rectangle croppedRectangle = rectangle.intersection(
 			new Rectangle(renderedImage.getWidth(), renderedImage.getHeight()));
@@ -239,7 +239,8 @@
 		BufferedImage bufferedImage = getBufferedImage(renderedImage);
 
 		return bufferedImage.getSubimage(
-			x, y, croppedRectangle.width, croppedRectangle.height);
+			croppedRectangle.x, croppedRectangle.y, croppedRectangle.width,
+			croppedRectangle.height);
 	}
 
 	@Override
