diff --git a/portal-impl/src/com/liferay/portlet/bookmarks/lar/BookmarksPortletDataHandlerImpl.java b/portal-impl/src/com/liferay/portlet/bookmarks/lar/BookmarksPortletDataHandlerImpl.java
index 89e5136..4fadec7 100644
--- a/portal-impl/src/com/liferay/portlet/bookmarks/lar/BookmarksPortletDataHandlerImpl.java
+++ b/portal-impl/src/com/liferay/portlet/bookmarks/lar/BookmarksPortletDataHandlerImpl.java
@@ -270,7 +270,7 @@
 			while (itr.hasNext()) {
 				BookmarksEntry entry = (BookmarksEntry)itr.next();
 
-				if (JournalStructureUtil.fetchByPrimaryKey(
+				if (BookmarksEntryUtil.fetchByPrimaryKey(
 						entry.getPrimaryKey()) == null) {
 
 					boolean addCommunityPermissions = true;
