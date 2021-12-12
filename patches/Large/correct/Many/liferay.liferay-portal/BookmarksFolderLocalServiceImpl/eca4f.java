diff --git a/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java
index 9870bb2..30b05c2 100644
--- a/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java
@@ -792,7 +792,7 @@
 
 				if (oldStatus != WorkflowConstants.STATUS_APPROVED) {
 					trashVersionLocalService.addTrashVersion(
-						trashEntryId, BookmarksEntry.class.getName(),
+						trashEntryId, BookmarksFolder.class.getName(),
 						folder.getFolderId(), oldStatus, null);
 				}
 
