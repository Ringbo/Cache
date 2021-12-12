diff --git a/portal-impl/src/com/liferay/portlet/assetpublisher/action/ConfigurationActionImpl.java b/portal-impl/src/com/liferay/portlet/assetpublisher/action/ConfigurationActionImpl.java
index cec399e..5908ade 100644
--- a/portal-impl/src/com/liferay/portlet/assetpublisher/action/ConfigurationActionImpl.java
+++ b/portal-impl/src/com/liferay/portlet/assetpublisher/action/ConfigurationActionImpl.java
@@ -726,7 +726,7 @@
 		String name = queryRule.getName();
 
 		if (name.equals("assetTags")) {
-			AssetTagLocalServiceUtil.checkTagsWithProperties(
+			AssetTagLocalServiceUtil.checkTags(
 				userId, groupId, queryRule.getValues());
 		}
 
