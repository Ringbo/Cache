diff --git a/modules/apps/collaboration/blogs/blogs-test/src/testIntegration/java/com/liferay/blogs/attachments/test/BlogsEntryImageSelectorHelperTest.java b/modules/apps/collaboration/blogs/blogs-test/src/testIntegration/java/com/liferay/blogs/attachments/test/BlogsEntryImageSelectorHelperTest.java
index ea7c6db..6e833cf 100644
--- a/modules/apps/collaboration/blogs/blogs-test/src/testIntegration/java/com/liferay/blogs/attachments/test/BlogsEntryImageSelectorHelperTest.java
+++ b/modules/apps/collaboration/blogs/blogs-test/src/testIntegration/java/com/liferay/blogs/attachments/test/BlogsEntryImageSelectorHelperTest.java
@@ -84,7 +84,8 @@
 				"BlogsEntryImageSelectorHelper");
 
 		_constructor = clazz.getConstructor(
-			Long.TYPE, Long.TYPE, String.class, String.class, String.class);
+			Long.TYPE, Long.TYPE, Long.TYPE, String.class, String.class,
+			String.class);
 
 		_getImageSelectorMethod = clazz.getMethod("getImageSelector");
 
@@ -103,7 +104,7 @@
 		throws Exception {
 
 		Object blogsEntryImageSelectorHelper = _constructor.newInstance(
-			0, 1, StringPool.BLANK, StringPool.BLANK, StringPool.BLANK);
+			0, 0, 1, StringPool.BLANK, StringPool.BLANK, StringPool.BLANK);
 
 		ImageSelector imageSelector =
 			(ImageSelector)_getImageSelectorMethod.invoke(
@@ -132,7 +133,7 @@
 				StringPool.BLANK, StringPool.BLANK, bytes, serviceContext);
 
 			Object blogsEntryImageSelectorHelper = _constructor.newInstance(
-				fileEntry.getFileEntryId(), fileEntry.getFileEntryId() + 1,
+				0, fileEntry.getFileEntryId(), fileEntry.getFileEntryId() + 1,
 				_IMAGE_CROP_REGION, StringPool.BLANK, StringPool.BLANK);
 
 			ImageSelector imageSelector =
@@ -157,7 +158,7 @@
 	@Test
 	public void testGetImageSelectorWithImageURL() throws Exception {
 		Object blogsEntryImageSelectorHelper = _constructor.newInstance(
-			0, 0, StringPool.BLANK, _IMAGE_URL, StringPool.BLANK);
+			0, 0, 0, StringPool.BLANK, _IMAGE_URL, StringPool.BLANK);
 
 		ImageSelector imageSelector =
 			(ImageSelector)_getImageSelectorMethod.invoke(
@@ -192,7 +193,7 @@
 				StringPool.BLANK, StringPool.BLANK, bytes, serviceContext);
 
 			Object blogsEntryImageSelectorHelper = _constructor.newInstance(
-				fileEntry.getFileEntryId(), fileEntry.getFileEntryId(),
+				0, fileEntry.getFileEntryId(), fileEntry.getFileEntryId(),
 				_IMAGE_CROP_REGION, StringPool.BLANK, StringPool.BLANK);
 
 			Assert.assertNull(
@@ -207,7 +208,7 @@
 	@Test
 	public void testGetImageSelectorWithSameImageURL() throws Exception {
 		Object blogsEntryImageSelectorHelper = _constructor.newInstance(
-			0, 0, StringPool.BLANK, _IMAGE_URL, _IMAGE_URL);
+			0, 0, 0, StringPool.BLANK, _IMAGE_URL, _IMAGE_URL);
 
 		Assert.assertNull(
 			(ImageSelector)_getImageSelectorMethod.invoke(
@@ -228,7 +229,7 @@
 				ContentTypes.IMAGE_JPEG);
 
 			Object blogsEntryImageSelectorHelper = _constructor.newInstance(
-				tempFileEntry.getFileEntryId(),
+				0, tempFileEntry.getFileEntryId(),
 				tempFileEntry.getFileEntryId() + 1, _IMAGE_CROP_REGION,
 				StringPool.BLANK, StringPool.BLANK);
 
