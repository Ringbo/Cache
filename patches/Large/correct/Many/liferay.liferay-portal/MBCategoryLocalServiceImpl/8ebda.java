diff --git a/portal-ejb/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java b/portal-ejb/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java
index bf3e073..c28e9d8 100644
--- a/portal-ejb/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java
+++ b/portal-ejb/src/com/liferay/portlet/messageboards/service/impl/MBCategoryLocalServiceImpl.java
@@ -390,7 +390,8 @@
 		// Merge categories
 
 		if (mergeWithParentCategory &&
-			!oldCategoryId.equals(parentCategoryId)) {
+			!oldCategoryId.equals(parentCategoryId) &&
+			!parentCategoryId.equals(MBCategory.DEFAULT_PARENT_CATEGORY_ID)) {
 
 			mergeCategories(category, parentCategoryId);
 		}
