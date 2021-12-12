diff --git a/modules/apps/asset/asset-display-api/src/main/java/com/liferay/asset/display/contributor/AssetDisplayContributor.java b/modules/apps/asset/asset-display-api/src/main/java/com/liferay/asset/display/contributor/AssetDisplayContributor.java
index f3ccae5..133f38b 100644
--- a/modules/apps/asset/asset-display-api/src/main/java/com/liferay/asset/display/contributor/AssetDisplayContributor.java
+++ b/modules/apps/asset/asset-display-api/src/main/java/com/liferay/asset/display/contributor/AssetDisplayContributor.java
@@ -71,7 +71,8 @@
 		for (ClassTypeField classTypeField : classType.getClassTypeFields()) {
 			classTypeFields.add(
 				new AssetDisplayField(
-					classTypeField.getName(), classTypeField.getLabel()));
+					classTypeField.getName(), classTypeField.getLabel(),
+					classTypeField.getType()));
 		}
 
 		return classTypeFields;
