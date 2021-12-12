diff --git a/modules/apps/web-experience/fragment/fragment-web/src/main/java/com/liferay/fragment/web/internal/portlet/action/ImportFragmentCollectionsMVCActionCommand.java b/modules/apps/web-experience/fragment/fragment-web/src/main/java/com/liferay/fragment/web/internal/portlet/action/ImportFragmentCollectionsMVCActionCommand.java
index d66b5de..ef57a30 100644
--- a/modules/apps/web-experience/fragment/fragment-web/src/main/java/com/liferay/fragment/web/internal/portlet/action/ImportFragmentCollectionsMVCActionCommand.java
+++ b/modules/apps/web-experience/fragment/fragment-web/src/main/java/com/liferay/fragment/web/internal/portlet/action/ImportFragmentCollectionsMVCActionCommand.java
@@ -134,8 +134,7 @@
 					tempFileEntry.getContentStream());
 
 				if (!_importUtil.hasFragmentCollection(zipReader)) {
-					throw new InvalidFragmentCollectionFileException(
-						"selected-file-does-not-contain-fragment-collections");
+					throw new InvalidFragmentCollectionFileException();
 				}
 
 				_importUtil.importFragmentCollections(
