diff --git a/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java
index af2392e..093a208 100644
--- a/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java
@@ -804,7 +804,7 @@
 
 				BookmarksEntry entry = (BookmarksEntry)object;
 
-				if (entry.isInTrashImplicitly()) {
+				if (!entry.isInTrashImplicitly()) {
 					continue;
 				}
 
@@ -850,7 +850,7 @@
 
 				BookmarksFolder folder = (BookmarksFolder)object;
 
-				if (folder.isInTrashImplicitly()) {
+				if (!folder.isInTrashImplicitly()) {
 					continue;
 				}
 
