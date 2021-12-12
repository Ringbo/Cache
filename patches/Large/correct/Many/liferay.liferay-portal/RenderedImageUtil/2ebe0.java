diff --git a/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/util/RenderedImageUtil.java b/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/util/RenderedImageUtil.java
index 5ba9c4a..ee58c6b 100644
--- a/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/util/RenderedImageUtil.java
+++ b/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/util/RenderedImageUtil.java
@@ -69,7 +69,7 @@
 
 				return imageReader.read(0);
 			}
-			catch (IOException ioe) {
+			catch (Exception e) {
 				continue;
 			}
 			finally {
