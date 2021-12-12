diff --git a/util-taglib/src/com/liferay/taglib/ui/AssetCategoriesAvailableTag.java b/util-taglib/src/com/liferay/taglib/ui/AssetCategoriesAvailableTag.java
index 716819b..8225f72 100644
--- a/util-taglib/src/com/liferay/taglib/ui/AssetCategoriesAvailableTag.java
+++ b/util-taglib/src/com/liferay/taglib/ui/AssetCategoriesAvailableTag.java
@@ -35,7 +35,7 @@
 			_assetCategories = AssetCategoryServiceUtil.getCategories(
 				_className, _classPK);
 
-			if (_assetCategories.isEmpty()) {
+			if (!_assetCategories.isEmpty()) {
 				return EVAL_BODY_INCLUDE;
 			}
 
