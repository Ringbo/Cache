diff --git a/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java b/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java
index d725671..07fd89a 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/LayoutTypePortletImpl.java
@@ -1397,7 +1397,7 @@
 				staticPortlets.contains(portlet) ||
 				portlet.isSystem() || portlet.isUndeployedPortlet() ||
 				!portlet.isActive() ||
-				portletAddDefaultResourceCheckWhiteList.contains(portletId)) {
+				!portletAddDefaultResourceCheckWhiteList.contains(portletId)) {
 
 				continue;
 			}
