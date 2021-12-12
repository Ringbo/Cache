diff --git a/portal-impl/src/com/liferay/portlet/assetpublisher/util/AssetPublisherImpl.java b/portal-impl/src/com/liferay/portlet/assetpublisher/util/AssetPublisherImpl.java
index f195584..882497c 100644
--- a/portal-impl/src/com/liferay/portlet/assetpublisher/util/AssetPublisherImpl.java
+++ b/portal-impl/src/com/liferay/portlet/assetpublisher/util/AssetPublisherImpl.java
@@ -133,7 +133,10 @@
 		String referringPortletResource = ParamUtil.getString(
 			portletRequest, "referringPortletResource");
 
-		if (Validator.isNull(referringPortletResource)) {
+		if (Validator.isNull(referringPortletResource) ||
+			!PortletConstants.getRootPortletId(referringPortletResource).equals(
+				PortletKeys.ASSET_PUBLISHER)) {
+
 			return;
 		}
 
