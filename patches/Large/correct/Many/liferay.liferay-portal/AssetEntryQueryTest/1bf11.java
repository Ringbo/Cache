diff --git a/portal-impl/test/integration/com/liferay/portlet/asset/service/persistence/AssetEntryQueryTest.java b/portal-impl/test/integration/com/liferay/portlet/asset/service/persistence/AssetEntryQueryTest.java
index 76db83c..d723eb6 100644
--- a/portal-impl/test/integration/com/liferay/portlet/asset/service/persistence/AssetEntryQueryTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/asset/service/persistence/AssetEntryQueryTest.java
@@ -473,7 +473,7 @@
 		BlogsEntryLocalServiceUtil.addEntry(
 			TestPropsValues.getUserId(), title1, StringPool.BLANK,
 			StringPool.BLANK, "This is a blog entry for testing purposes", 1, 1,
-			1965, 0, 0, true, true, null, null, serviceContext);
+			1965, 0, 0, true, true, null, null, null, serviceContext);
 
 		if (assetCategoryIds2 != null) {
 			serviceContext.setAssetCategoryIds(assetCategoryIds2);
@@ -486,7 +486,7 @@
 		BlogsEntryLocalServiceUtil.addEntry(
 			TestPropsValues.getUserId(), title2, StringPool.BLANK,
 			StringPool.BLANK, "This is a blog entry for testing purposes", 1, 1,
-			1965, 0, 0, true, true, null, null, serviceContext);
+			1965, 0, 0, true, true, null, null, null, serviceContext);
 
 		// Clear the thread local cache which is populated in AssetPublisherUtil
 
