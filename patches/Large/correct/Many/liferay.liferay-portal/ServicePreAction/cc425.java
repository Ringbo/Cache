diff --git a/portal-impl/src/com/liferay/portal/events/ServicePreAction.java b/portal-impl/src/com/liferay/portal/events/ServicePreAction.java
index 206a25d..3f99b4a 100644
--- a/portal-impl/src/com/liferay/portal/events/ServicePreAction.java
+++ b/portal-impl/src/com/liferay/portal/events/ServicePreAction.java
@@ -961,7 +961,7 @@
 
 				if (hasPublishStagingPermission) {
 					PortletURL publishToLiveURL = PortletURLFactoryUtil.create(
-						request, PortletKeys.EXPORT_IMPORT,
+						request, PortletKeys.EXPORT_IMPORT,  plid,
 						PortletRequest.RENDER_PHASE);
 
 					publishToLiveURL.setParameter(
