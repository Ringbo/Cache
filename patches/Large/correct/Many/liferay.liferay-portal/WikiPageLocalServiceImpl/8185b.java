diff --git a/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java
index 51de020..865b073 100644
--- a/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/wiki/service/impl/WikiPageLocalServiceImpl.java
@@ -1761,7 +1761,7 @@
 		String rootPortletId = serviceContext.getRootPortletId();
 
 		if (Validator.isNull(rootPortletId) ||
-			rootPortletId.equals(PortletKeys.WIKI_DISPLAY)) {
+			!rootPortletId.equals(PortletKeys.WIKI_DISPLAY)) {
 
 			preferences = ServiceContextUtil.getPortletPreferences(
 				serviceContext);
