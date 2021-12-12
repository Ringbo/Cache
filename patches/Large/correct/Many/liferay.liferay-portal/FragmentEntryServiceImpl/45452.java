diff --git a/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/service/impl/FragmentEntryServiceImpl.java b/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/service/impl/FragmentEntryServiceImpl.java
index 5b5badc..520dbbd 100644
--- a/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/service/impl/FragmentEntryServiceImpl.java
+++ b/modules/apps/fragment/fragment-service/src/main/java/com/liferay/fragment/service/impl/FragmentEntryServiceImpl.java
@@ -146,7 +146,7 @@
 	public int getFragmentCollectionsCount(
 		long groupId, long fragmentCollectionId) {
 
-		return fragmentEntryPersistence.filterCountByG_FCI(
+		return fragmentEntryPersistence.countByG_FCI(
 			groupId, fragmentCollectionId);
 	}
 
@@ -154,7 +154,7 @@
 	public int getFragmentCollectionsCount(
 		long groupId, long fragmentCollectionId, int status) {
 
-		return fragmentEntryPersistence.filterCountByG_FCI_S(
+		return fragmentEntryPersistence.countByG_FCI_S(
 			groupId, fragmentCollectionId, status);
 	}
 
@@ -162,7 +162,7 @@
 	public int getFragmentCollectionsCount(
 		long groupId, long fragmentCollectionId, String name) {
 
-		return fragmentEntryPersistence.filterCountByG_FCI_LikeN(
+		return fragmentEntryPersistence.countByG_FCI_LikeN(
 			groupId, fragmentCollectionId,
 			_customSQL.keywords(name, WildcardMode.SURROUND)[0]);
 	}
@@ -171,7 +171,7 @@
 	public int getFragmentCollectionsCount(
 		long groupId, long fragmentCollectionId, String name, int status) {
 
-		return fragmentEntryPersistence.filterCountByG_FCI_LikeN_S(
+		return fragmentEntryPersistence.countByG_FCI_LikeN_S(
 			groupId, fragmentCollectionId,
 			_customSQL.keywords(name, WildcardMode.SURROUND)[0], status);
 	}
@@ -194,7 +194,7 @@
 	public List<FragmentEntry> getFragmentEntries(
 		long groupId, long fragmentCollectionId, int start, int end) {
 
-		return fragmentEntryPersistence.filterFindByG_FCI(
+		return fragmentEntryPersistence.findByG_FCI(
 			groupId, fragmentCollectionId, start, end);
 	}
 
@@ -203,7 +203,7 @@
 		long groupId, long fragmentCollectionId, int status, int start, int end,
 		OrderByComparator<FragmentEntry> orderByComparator) {
 
-		return fragmentEntryPersistence.filterFindByG_FCI_S(
+		return fragmentEntryPersistence.findByG_FCI_S(
 			groupId, fragmentCollectionId, status, start, end,
 			orderByComparator);
 	}
@@ -213,7 +213,7 @@
 		long groupId, long fragmentCollectionId, int start, int end,
 		OrderByComparator<FragmentEntry> orderByComparator) {
 
-		return fragmentEntryPersistence.filterFindByG_FCI(
+		return fragmentEntryPersistence.findByG_FCI(
 			groupId, fragmentCollectionId, start, end, orderByComparator);
 	}
 
@@ -223,7 +223,7 @@
 		int start, int end,
 		OrderByComparator<FragmentEntry> orderByComparator) {
 
-		return fragmentEntryPersistence.filterFindByG_FCI_LikeN_S(
+		return fragmentEntryPersistence.findByG_FCI_LikeN_S(
 			groupId, fragmentCollectionId,
 			_customSQL.keywords(name, WildcardMode.SURROUND)[0], status, start,
 			end, orderByComparator);
@@ -234,7 +234,7 @@
 		long groupId, long fragmentCollectionId, String name, int start,
 		int end, OrderByComparator<FragmentEntry> orderByComparator) {
 
-		return fragmentEntryPersistence.filterFindByG_FCI_LikeN(
+		return fragmentEntryPersistence.findByG_FCI_LikeN(
 			groupId, fragmentCollectionId,
 			_customSQL.keywords(name, WildcardMode.SURROUND)[0], start, end,
 			orderByComparator);
