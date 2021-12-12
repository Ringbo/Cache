diff --git a/portal-impl/src/com/liferay/portlet/wiki/asset/WikiPageAssetRenderer.java b/portal-impl/src/com/liferay/portlet/wiki/asset/WikiPageAssetRenderer.java
index bd71c7d..8b8a9ee 100644
--- a/portal-impl/src/com/liferay/portlet/wiki/asset/WikiPageAssetRenderer.java
+++ b/portal-impl/src/com/liferay/portlet/wiki/asset/WikiPageAssetRenderer.java
@@ -50,7 +50,7 @@
 
 	public static long getClassPK(WikiPage page) {
 		if (!page.isApproved() && !page.isDraft() && !page.isPending() &&
-			!page.isInTrash() &&
+			!page.isInTrash() && !page.isInTrashFolder() &&
 			(page.getVersion() != WikiPageConstants.VERSION_DEFAULT)) {
 
 			return page.getPageId();
