diff --git a/portal-impl/src/com/liferay/portal/lar/PortletImporter.java b/portal-impl/src/com/liferay/portal/lar/PortletImporter.java
index 191fe64..3805159 100644
--- a/portal-impl/src/com/liferay/portal/lar/PortletImporter.java
+++ b/portal-impl/src/com/liferay/portal/lar/PortletImporter.java
@@ -342,7 +342,8 @@
 
 			String prefix = "queryName";
 
-			if (value.equalsIgnoreCase("assetCategories") &&
+			if (Validator.isNotNull(value) &&
+				value.equalsIgnoreCase("assetCategories") &&
 				name.startsWith(prefix)) {
 
 				String index = name.substring(prefix.length(), name.length());
@@ -363,7 +364,7 @@
 
 				for (String importedCategoryPK : importedCategoryPKs) {
 					newCategoryPKs[i++] = StringUtil.valueOf(
-						assetCategoryPKs.get(importedCategoryPK));
+						assetCategoryPKs.get(new Long(importedCategoryPK)));
 				}
 
 				portletPreferences.setValues(queryValuesName, newCategoryPKs);
