diff --git a/OsmAnd/src/net/osmand/plus/views/AidlMapLayer.java b/OsmAnd/src/net/osmand/plus/views/AidlMapLayer.java
index 5d906fb..1e83ff3 100644
--- a/OsmAnd/src/net/osmand/plus/views/AidlMapLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/AidlMapLayer.java
@@ -173,8 +173,7 @@
 			canvas.drawBitmap(image, null, getDstRect(x, y, smallIconSize / 2), bitmapPaint);
 		} else if (pointsType == PointsType.BIG_ICON) {
 			bitmapPaint.setColorFilter(null);
-			// FIXME: vertical offset
-			float vOffset = bigIconBg.getHeight() * 0.9f;
+			float vOffset = bigIconBg.getHeight() * 0.91f;
 			int imageCenterY = (int) (y - vOffset + bigIconBg.getHeight() / 2);
 			canvas.drawBitmap(bigIconBg, x - bigIconBg.getWidth() / 2, y - vOffset, bitmapPaint);
 			canvas.drawBitmap(image, null, getDstRect(x, imageCenterY, bigIconSize / 2), bitmapPaint);
