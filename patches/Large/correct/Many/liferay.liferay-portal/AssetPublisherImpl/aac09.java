diff --git a/portal-impl/src/com/liferay/portlet/assetpublisher/util/AssetPublisherImpl.java b/portal-impl/src/com/liferay/portlet/assetpublisher/util/AssetPublisherImpl.java
index 2d09a79..9968101 100644
--- a/portal-impl/src/com/liferay/portlet/assetpublisher/util/AssetPublisherImpl.java
+++ b/portal-impl/src/com/liferay/portlet/assetpublisher/util/AssetPublisherImpl.java
@@ -731,7 +731,7 @@
 
 		assetEntryQuery.setAllCategoryIds(allAssetCategoryIds);
 
-		if (overrideAllAssetCategoryIds != null) {
+		if (overrideAllAssetTagNames != null) {
 			allAssetTagNames = overrideAllAssetTagNames;
 		}
 
