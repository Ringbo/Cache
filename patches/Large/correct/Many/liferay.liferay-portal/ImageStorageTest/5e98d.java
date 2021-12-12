diff --git a/modules/apps/adaptive-media/adaptive-media-image-service/src/test/java/com/liferay/adaptive/media/image/internal/storage/ImageStorageTest.java b/modules/apps/adaptive-media/adaptive-media-image-service/src/test/java/com/liferay/adaptive/media/image/internal/storage/ImageStorageTest.java
index bdc30dd..c4583a8 100644
--- a/modules/apps/adaptive-media/adaptive-media-image-service/src/test/java/com/liferay/adaptive/media/image/internal/storage/ImageStorageTest.java
+++ b/modules/apps/adaptive-media/adaptive-media-image-service/src/test/java/com/liferay/adaptive/media/image/internal/storage/ImageStorageTest.java
@@ -68,7 +68,7 @@
 
 		String configurationUuid = RandomTestUtil.randomString();
 
-		String fileVersionPath = _imageStorage.getFileVersionPath(
+		String fileVersionPath = AMStoreUtil.getFileVersionPath(
 			fileVersion, configurationUuid);
 
 		Assert.assertEquals(
