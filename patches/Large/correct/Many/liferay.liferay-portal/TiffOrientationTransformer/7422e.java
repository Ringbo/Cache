diff --git a/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/processor/util/TiffOrientationTransformer.java b/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/processor/util/TiffOrientationTransformer.java
index f83c146..5269b42 100644
--- a/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/processor/util/TiffOrientationTransformer.java
+++ b/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/processor/util/TiffOrientationTransformer.java
@@ -56,7 +56,8 @@
 			ExifIFD0Directory exifIFD0Directory =
 				metadata.getFirstDirectoryOfType(ExifIFD0Directory.class);
 
-			if (!exifIFD0Directory.containsTag(
+			if ((exifIFD0Directory == null) ||
+				!exifIFD0Directory.containsTag(
 					ExifIFD0Directory.TAG_ORIENTATION)) {
 
 				return Optional.empty();
