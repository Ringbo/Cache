diff --git a/util-taglib/src/com/liferay/taglib/ui/SearchContainerRowTag.java b/util-taglib/src/com/liferay/taglib/ui/SearchContainerRowTag.java
index b491f94..62a521e 100644
--- a/util-taglib/src/com/liferay/taglib/ui/SearchContainerRowTag.java
+++ b/util-taglib/src/com/liferay/taglib/ui/SearchContainerRowTag.java
@@ -295,10 +295,11 @@
 			primaryKey = String.valueOf(model);
 		}
 		else if (isStringKey()) {
-			primaryKey = BeanPropertiesUtil.getString(model, _keyProperty);
+			primaryKey = BeanPropertiesUtil.getStringSilent(
+				model, _keyProperty);
 		}
 		else {
-			Object primaryKeyObj = BeanPropertiesUtil.getObject(
+			Object primaryKeyObj = BeanPropertiesUtil.getObjectSilent(
 				model, _keyProperty);
 
 			primaryKey = String.valueOf(primaryKeyObj);
@@ -310,7 +311,7 @@
 			rowId = String.valueOf(_rowIndex + 1);
 		}
 		else {
-			Object rowIdObj = BeanPropertiesUtil.getObject(
+			Object rowIdObj = BeanPropertiesUtil.getObjectSilent(
 				model, _rowIdProperty);
 
 			if (Validator.isNull(rowIdObj)) {
