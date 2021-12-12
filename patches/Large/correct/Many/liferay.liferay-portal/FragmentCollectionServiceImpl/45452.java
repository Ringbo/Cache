diff --git a/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/service/impl/FragmentCollectionServiceImpl.java b/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/service/impl/FragmentCollectionServiceImpl.java
index c7a34d3..04a0337 100644
--- a/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/service/impl/FragmentCollectionServiceImpl.java
+++ b/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/service/impl/FragmentCollectionServiceImpl.java
@@ -119,15 +119,14 @@
 
 	@Override
 	public List<FragmentCollection> getFragmentCollections(long groupId) {
-		return fragmentCollectionPersistence.filterFindByGroupId(groupId);
+		return fragmentCollectionPersistence.findByGroupId(groupId);
 	}
 
 	@Override
 	public List<FragmentCollection> getFragmentCollections(
 		long groupId, int start, int end) {
 
-		return fragmentCollectionPersistence.filterFindByGroupId(
-			groupId, start, end);
+		return fragmentCollectionPersistence.findByGroupId(groupId, start, end);
 	}
 
 	@Override
@@ -135,7 +134,7 @@
 		long groupId, int start, int end,
 		OrderByComparator<FragmentCollection> orderByComparator) {
 
-		return fragmentCollectionPersistence.filterFindByGroupId(
+		return fragmentCollectionPersistence.findByGroupId(
 			groupId, start, end, orderByComparator);
 	}
 
@@ -144,19 +143,19 @@
 		long groupId, String name, int start, int end,
 		OrderByComparator<FragmentCollection> orderByComparator) {
 
-		return fragmentCollectionPersistence.filterFindByG_LikeN(
+		return fragmentCollectionPersistence.findByG_LikeN(
 			groupId, _customSQL.keywords(name, WildcardMode.SURROUND)[0], start,
 			end, orderByComparator);
 	}
 
 	@Override
 	public int getFragmentCollectionsCount(long groupId) {
-		return fragmentCollectionPersistence.filterCountByGroupId(groupId);
+		return fragmentCollectionPersistence.countByGroupId(groupId);
 	}
 
 	@Override
 	public int getFragmentCollectionsCount(long groupId, String name) {
-		return fragmentCollectionPersistence.filterCountByG_LikeN(
+		return fragmentCollectionPersistence.countByG_LikeN(
 			groupId, _customSQL.keywords(name, WildcardMode.SURROUND)[0]);
 	}
 
