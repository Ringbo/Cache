diff --git a/portal-impl/test/integration/com/liferay/portlet/wiki/service/WikiPageLocalServiceTest.java b/portal-impl/test/integration/com/liferay/portlet/wiki/service/WikiPageLocalServiceTest.java
index 3d0a343d..8539a28 100644
--- a/portal-impl/test/integration/com/liferay/portlet/wiki/service/WikiPageLocalServiceTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/wiki/service/WikiPageLocalServiceTest.java
@@ -646,7 +646,7 @@
 		long[] assetCategoryIds = AssetCategoryLocalServiceUtil.getCategoryIds(
 			WikiPage.class.getName(), page.getResourcePrimKey());
 
-		Assert.assertEquals(
+		Assert.assertArrayEquals(
 			serviceContext.getAssetCategoryIds(), assetCategoryIds);
 
 		AssetEntry assetEntry = AssetEntryLocalServiceUtil.getEntry(
@@ -658,7 +658,7 @@
 		long[] assetLinkEntryIds = ListUtil.toLongArray(
 			assetLinks, AssetLink.ENTRY_ID2_ACCESSOR);
 
-		Assert.assertEquals(
+		Assert.assertArrayEquals(
 			serviceContext.getAssetLinkEntryIds(), assetLinkEntryIds);
 
 		String[] assetTagNames = AssetTagLocalServiceUtil.getTagNames(
