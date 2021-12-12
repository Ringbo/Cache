diff --git a/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/service/LiferayAlbumService.java b/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/service/LiferayAlbumService.java
index b13a6e1..0887021 100644
--- a/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/service/LiferayAlbumService.java
+++ b/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/service/LiferayAlbumService.java
@@ -329,8 +329,8 @@
 				GetterUtil.getLong(albumId));
 
 			DLAppServiceUtil.updateFolder(
-				folder.getFolderId(), folder.getParentFolderId(),
-				album.getTitle(), album.getDescription(), serviceContext);
+				folder.getFolderId(), album.getTitle(), album.getDescription(),
+				serviceContext);
 		}
 	}
 
