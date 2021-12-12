diff --git a/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java
index dc369a2..25c4a01 100644
--- a/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java
@@ -1563,7 +1563,9 @@
 
 		String portletId = serviceContext.getPortletId();
 
-		if (!portletId.startsWith(PortletKeys.WIKI_DISPLAY)) {
+		if ((portletId == null) ||
+			!portletId.startsWith(PortletKeys.WIKI_DISPLAY)) {
+
 			preferences = ServiceContextUtil.getPortletPreferences(
 				serviceContext);
 		}
