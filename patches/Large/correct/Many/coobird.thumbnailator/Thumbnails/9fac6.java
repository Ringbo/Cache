diff --git a/src/net/coobird/thumbnailator/Thumbnails.java b/src/net/coobird/thumbnailator/Thumbnails.java
index 0e885b9..7c7d36a 100644
--- a/src/net/coobird/thumbnailator/Thumbnails.java
+++ b/src/net/coobird/thumbnailator/Thumbnails.java
@@ -2051,7 +2051,7 @@
 			 */
 			if (croppingPosition != null)
 			{
-				filterPipeline.add(new Canvas(width, height, croppingPosition));
+				filterPipeline.addFirst(new Canvas(width, height, croppingPosition));
 			}
 			
 			if (Double.isNaN(scaleWidth))
