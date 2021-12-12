diff --git a/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/scaler/AMDefaultImageScaler.java b/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/scaler/AMDefaultImageScaler.java
index 770cd8e..d395514 100644
--- a/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/scaler/AMDefaultImageScaler.java
+++ b/modules/apps/adaptive-media/adaptive-media-image-impl/src/main/java/com/liferay/adaptive/media/image/internal/scaler/AMDefaultImageScaler.java
@@ -69,7 +69,11 @@
 				scaledRenderedImage.getWidth());
 		}
 		catch (IOException | PortalException e) {
-			throw new AMRuntimeException.IOException(e);
+			throw new AMRuntimeException.IOException(
+				"Couldn't scale file entry " + fileVersion.getFileEntryId() +
+					" to match Adaptive Media configuration " +
+						amImageConfigurationEntry.getUUID(),
+				e);
 		}
 	}
 
