diff --git a/portal-impl/src/com/liferay/portlet/bookmarks/lar/BookmarksPortletDataHandler.java b/portal-impl/src/com/liferay/portlet/bookmarks/lar/BookmarksPortletDataHandler.java
index 7950f75..21591df 100644
--- a/portal-impl/src/com/liferay/portlet/bookmarks/lar/BookmarksPortletDataHandler.java
+++ b/portal-impl/src/com/liferay/portlet/bookmarks/lar/BookmarksPortletDataHandler.java
@@ -184,7 +184,8 @@
 			BookmarksFolder folder = BookmarksFolderLocalServiceUtil.getFolder(
 				rootFolderId);
 
-			Portlet portlet = PortletLocalServiceUtil.getPortletById(portletId);
+			Portlet portlet = PortletLocalServiceUtil.getPortletById(
+				portletDataContext.getCompanyId(), portletId);
 
 			portletDataContext.addReferenceElement(
 				portlet, rootElement, folder, BookmarksFolder.class,
