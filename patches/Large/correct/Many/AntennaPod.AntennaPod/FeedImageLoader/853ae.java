diff --git a/src/de/danoeh/antennapod/asynctask/FeedImageLoader.java b/src/de/danoeh/antennapod/asynctask/FeedImageLoader.java
index 4b6855a..0617308 100644
--- a/src/de/danoeh/antennapod/asynctask/FeedImageLoader.java
+++ b/src/de/danoeh/antennapod/asynctask/FeedImageLoader.java
@@ -104,7 +104,7 @@
 	}
 
 	public void loadCoverBitmap(FeedImage image, ImageView target) {
-		if (image.getFile_url() != null) {
+		if (image != null && image.getFile_url() != null) {
 			Bitmap bitmap = getBitmapFromCoverCache(image.getFile_url());
 			if (bitmap != null) {
 				target.setImageBitmap(bitmap);
