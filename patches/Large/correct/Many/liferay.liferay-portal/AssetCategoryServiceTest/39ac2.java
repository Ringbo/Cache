diff --git a/portal-impl/test/integration/com/liferay/portlet/asset/service/AssetCategoryServiceTest.java b/portal-impl/test/integration/com/liferay/portlet/asset/service/AssetCategoryServiceTest.java
index 34e395c..93c633d 100644
--- a/portal-impl/test/integration/com/liferay/portlet/asset/service/AssetCategoryServiceTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/asset/service/AssetCategoryServiceTest.java
@@ -55,32 +55,32 @@
 		AssetCategory category1a = AssetTestUtil.addCategory(
 			groupId, vocabulary1.getVocabularyId());
 
-		assertLeftRightCategory(2, category1a);
+		assertLeftRightCategory(1, category1a);
 
 		AssetCategory category1b = AssetTestUtil.addCategory(
 			groupId, vocabulary1.getVocabularyId());
 
-		assertLeftRightCategory(4, category1b);
+		assertLeftRightCategory(3, category1b);
 
 		AssetCategory category1c = AssetTestUtil.addCategory(
 			groupId, vocabulary1.getVocabularyId());
 
-		assertLeftRightCategory(6, category1c);
+		assertLeftRightCategory(5, category1c);
 
 		AssetCategory category2a = AssetTestUtil.addCategory(
 			groupId, vocabulary2.getVocabularyId());
 
-		assertLeftRightCategory(8, category2a);
+		assertLeftRightCategory(7, category2a);
 
 		AssetCategory category2b = AssetTestUtil.addCategory(
 			groupId, vocabulary2.getVocabularyId());
 
-		assertLeftRightCategory(10, category2b);
+		assertLeftRightCategory(9, category2b);
 
 		AssetCategory category2c = AssetTestUtil.addCategory(
 			groupId, vocabulary2.getVocabularyId());
 
-		assertLeftRightCategory(12, category2c);
+		assertLeftRightCategory(11, category2c);
 
 		AssetVocabularyServiceUtil.deleteVocabulary(
 			vocabulary1.getVocabularyId());
@@ -98,17 +98,17 @@
 		category2a = AssetCategoryServiceUtil.getCategory(
 			category2a.getCategoryId());
 
-		assertLeftRightCategory(2, category2a);
+		assertLeftRightCategory(1, category2a);
 
 		category2b = AssetCategoryServiceUtil.getCategory(
 			category2b.getCategoryId());
 
-		assertLeftRightCategory(4, category2b);
+		assertLeftRightCategory(3, category2b);
 
 		category2c = AssetCategoryServiceUtil.getCategory(
 			category2c.getCategoryId());
 
-		assertLeftRightCategory(6, category2c);
+		assertLeftRightCategory(5, category2c);
 	}
 
 	protected void assertLeftRightCategory(
