diff --git a/portal-impl/test/integration/com/liferay/portlet/asset/service/persistence/AssetTagFinderTest.java b/portal-impl/test/integration/com/liferay/portlet/asset/service/persistence/AssetTagFinderTest.java
index ae975e7..94f9035 100644
--- a/portal-impl/test/integration/com/liferay/portlet/asset/service/persistence/AssetTagFinderTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/asset/service/persistence/AssetTagFinderTest.java
@@ -68,26 +68,24 @@
 	}
 
 	@Test
-	public void testFilterCountByG_C_N() throws Exception {
+	public void testCountByG_C_N() throws Exception {
 		long classNameId = PortalUtil.getClassNameId(BlogsEntry.class);
 		String assetTagName = RandomTestUtil.randomString();
 
-		int initialScopeGroupAssetTagsCount =
-			AssetTagFinderUtil.filterCountByG_C_N(
+		int initialScopeGroupAssetTagsCount = AssetTagFinderUtil.countByG_C_N(
 				_scopeGroup.getGroupId(), classNameId, assetTagName);
-		int initialSiteGroupAssetTagsCount =
-			AssetTagFinderUtil.filterCountByG_C_N(
+		int initialSiteGroupAssetTagsCount = AssetTagFinderUtil.countByG_C_N(
 				_scopeGroup.getParentGroupId(), classNameId, assetTagName);
 
 		addBlogsEntry(_scopeGroup.getGroupId(), assetTagName);
 
-		int scopeGroupAssetTagsCount = AssetTagFinderUtil.filterCountByG_C_N(
+		int scopeGroupAssetTagsCount = AssetTagFinderUtil.countByG_C_N(
 			_scopeGroup.getGroupId(), classNameId, assetTagName);
 
 		Assert.assertEquals(
 			initialScopeGroupAssetTagsCount + 1, scopeGroupAssetTagsCount);
 
-		int siteGroupAssetTagsCount = AssetTagFinderUtil.filterCountByG_C_N(
+		int siteGroupAssetTagsCount = AssetTagFinderUtil.countByG_C_N(
 			_scopeGroup.getParentGroupId(), classNameId, assetTagName);
 
 		Assert.assertEquals(
@@ -95,55 +93,52 @@
 	}
 
 	@Test
-	public void testFilterCountByG_N() throws Exception {
+	public void testCountByG_N() throws Exception {
 		String assetTagName = RandomTestUtil.randomString();
 
-		int initialScopeGroupAssetTagsCount =
-			AssetTagFinderUtil.filterCountByG_N(
+		int initialScopeGroupAssetTagsCount = AssetTagFinderUtil.countByG_N(
 				_scopeGroup.getGroupId(), assetTagName);
-		int initialTagsCountSiteGroup = AssetTagFinderUtil.filterCountByG_N(
+		int initialTagsCountSiteGroup = AssetTagFinderUtil.countByG_N(
 			_scopeGroup.getParentGroupId(), assetTagName);
 
 		addBlogsEntry(_scopeGroup.getGroupId(), assetTagName);
 
-		int scopeGroupAssetTagsCount = AssetTagFinderUtil.filterCountByG_N(
+		int scopeGroupAssetTagsCount = AssetTagFinderUtil.countByG_N(
 			_scopeGroup.getGroupId(), assetTagName);
 
 		Assert.assertEquals(
 			initialScopeGroupAssetTagsCount + 1, scopeGroupAssetTagsCount);
 
-		int siteGroupAssetTagsCount = AssetTagFinderUtil.filterCountByG_N(
+		int siteGroupAssetTagsCount = AssetTagFinderUtil.countByG_N(
 			_scopeGroup.getParentGroupId(), assetTagName);
 
 		Assert.assertEquals(initialTagsCountSiteGroup, siteGroupAssetTagsCount);
 	}
 
 	@Test
-	public void testFilterFindByG_C_N() throws Exception {
+	public void testFindByG_C_N() throws Exception {
 		long classNameId = PortalUtil.getClassNameId(BlogsEntry.class);
 		String assetTagName = RandomTestUtil.randomString();
 
 		List<AssetTag> initialScopeGroupAssetTags =
-			AssetTagFinderUtil.filterFindByG_C_N(
+			AssetTagFinderUtil.findByG_C_N(
 				_scopeGroup.getGroupId(), classNameId, assetTagName,
 				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
 		List<AssetTag> initialSiteGroupAssetTags =
-			AssetTagFinderUtil.filterFindByG_C_N(
+			AssetTagFinderUtil.findByG_C_N(
 				_scopeGroup.getParentGroupId(), classNameId, assetTagName,
 				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
 
 		addBlogsEntry(_scopeGroup.getGroupId(), assetTagName);
 
-		List<AssetTag> scopeGroupAssetTags =
-			AssetTagFinderUtil.filterFindByG_C_N(
+		List<AssetTag> scopeGroupAssetTags = AssetTagFinderUtil.findByG_C_N(
 				_scopeGroup.getGroupId(), classNameId, assetTagName,
 				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
 
 		Assert.assertEquals(
 			initialScopeGroupAssetTags.size() + 1, scopeGroupAssetTags.size());
 
-		List<AssetTag> siteGroupAssetTags =
-			AssetTagFinderUtil.filterFindByG_C_N(
+		List<AssetTag> siteGroupAssetTags = AssetTagFinderUtil.findByG_C_N(
 				_scopeGroup.getParentGroupId(), classNameId, assetTagName,
 				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
 
