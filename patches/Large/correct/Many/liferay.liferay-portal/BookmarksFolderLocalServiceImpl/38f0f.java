diff --git a/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java
index 5625f20..899508c 100644
--- a/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/bookmarks/service/impl/BookmarksFolderLocalServiceImpl.java
@@ -223,7 +223,7 @@
 
 		QueryDefinition queryDefinition = new QueryDefinition(status);
 
-		return bookmarksFolderFinder.findBF_BE_ByG_F(
+		return bookmarksFolderFinder.findF_E_ByG_F(
 			groupId, folderId, queryDefinition);
 	}
 
@@ -234,7 +234,7 @@
 		QueryDefinition queryDefinition = new QueryDefinition(
 			status, start, end, null);
 
-		return bookmarksFolderFinder.findBF_BE_ByG_F(
+		return bookmarksFolderFinder.findF_E_ByG_F(
 			groupId, folderId, queryDefinition);
 	}
 
@@ -244,7 +244,7 @@
 
 		QueryDefinition queryDefinition = new QueryDefinition(status);
 
-		return bookmarksFolderFinder.countBF_BE_ByG_F(
+		return bookmarksFolderFinder.countF_E_ByG_F(
 				groupId, folderId, queryDefinition);
 	}
 
