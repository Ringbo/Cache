diff --git a/modules/apps/search/search-web/src/com/liferay/search/web/facet/AssetTagsSearchFacet.java b/modules/apps/search/search-web/src/com/liferay/search/web/facet/AssetTagsSearchFacet.java
index 4cac975..8baa08a 100644
--- a/modules/apps/search/search-web/src/com/liferay/search/web/facet/AssetTagsSearchFacet.java
+++ b/modules/apps/search/search-web/src/com/liferay/search/web/facet/AssetTagsSearchFacet.java
@@ -100,7 +100,7 @@
 		boolean showAssetCount = ParamUtil.getBoolean(
 			actionRequest, getClassName() + "showAssetCount", true);
 
-		jsonObject.put("displayStyle", displayStyle);
+		jsonObject.put("displayStyle", displayStyleFacet);
 		jsonObject.put("frequencyThreshold", frequencyThreshold);
 		jsonObject.put("maxTerms", maxTerms);
 		jsonObject.put("showAssetCount", showAssetCount);
