diff --git a/src/net/coobird/thumbnailator/builders/BufferedImageBuilder.java b/src/net/coobird/thumbnailator/builders/BufferedImageBuilder.java
index 0ad8243..10b21ad 100644
--- a/src/net/coobird/thumbnailator/builders/BufferedImageBuilder.java
+++ b/src/net/coobird/thumbnailator/builders/BufferedImageBuilder.java
@@ -129,10 +129,10 @@
 	 */
 	public BufferedImageBuilder width(int width)
 	{
-		if (width < 0)
+		if (width <= 0)
 		{
 			throw new IllegalArgumentException(
-					"Width must be greater or equal to 0."
+					"Width must be greater than 0."
 			);
 		}
 		
@@ -149,10 +149,10 @@
 	 */
 	public BufferedImageBuilder height(int height)
 	{
-		if (height < 0)
+		if (height <= 0)
 		{
 			throw new IllegalArgumentException(
-					"Height must be greater or equal to 0."
+					"Height must be greater than 0."
 			);
 		}
 
