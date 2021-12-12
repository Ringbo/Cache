diff --git a/portal-impl/src/com/liferay/portal/events/ServicePreAction.java b/portal-impl/src/com/liferay/portal/events/ServicePreAction.java
index 0bde745..04762dd 100644
--- a/portal-impl/src/com/liferay/portal/events/ServicePreAction.java
+++ b/portal-impl/src/com/liferay/portal/events/ServicePreAction.java
@@ -1215,8 +1215,8 @@
 
 			if (myAccountPortlet != null) {
 				PortletURLImpl myAccountURL = new PortletURLImpl(
-					request, myAccountPortlet.getPortletName(),
-					controlPanelPlid, PortletRequest.RENDER_PHASE);
+					request, myAccountPortlet.getPortletId(), controlPanelPlid,
+					PortletRequest.RENDER_PHASE);
 
 				if (scopeGroupId > 0) {
 					myAccountURL.setDoAsGroupId(scopeGroupId);
