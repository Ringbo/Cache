diff --git a/portal-impl/src/com/liferay/portlet/wiki/importers/mediawiki/MediaWikiImporter.java b/portal-impl/src/com/liferay/portlet/wiki/importers/mediawiki/MediaWikiImporter.java
index 13798f6..c429352 100644
--- a/portal-impl/src/com/liferay/portlet/wiki/importers/mediawiki/MediaWikiImporter.java
+++ b/portal-impl/src/com/liferay/portlet/wiki/importers/mediawiki/MediaWikiImporter.java
@@ -254,7 +254,7 @@
 					serviceContext.setAddGroupPermissions(true);
 					serviceContext.setAddGuestPermissions(true);
 
-					WikiPageLocalServiceUtil.movePage(
+					WikiPageLocalServiceUtil.renamePage(
 						userId, node.getNodeId(), frontPageTitle,
 						WikiPageConstants.FRONT_PAGE, false, serviceContext);
 				}
