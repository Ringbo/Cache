diff --git a/modules/apps/web-experience/fragment/fragment-web/src/main/java/com/liferay/fragment/web/internal/portlet/action/ImportFragmentEntriesMVCActionCommand.java b/modules/apps/web-experience/fragment/fragment-web/src/main/java/com/liferay/fragment/web/internal/portlet/action/ImportFragmentEntriesMVCActionCommand.java
index a38d4ef..298a99b 100644
--- a/modules/apps/web-experience/fragment/fragment-web/src/main/java/com/liferay/fragment/web/internal/portlet/action/ImportFragmentEntriesMVCActionCommand.java
+++ b/modules/apps/web-experience/fragment/fragment-web/src/main/java/com/liferay/fragment/web/internal/portlet/action/ImportFragmentEntriesMVCActionCommand.java
@@ -141,9 +141,7 @@
 					tempFileEntry.getContentStream());
 
 				if (_importUtil.hasFragmentCollection(zipReader)) {
-					throw new InvalidFragmentEntryFileException(
-						"fragment-collection-cannot-be-imported-into-" +
-							"existing-fragment-collection");
+					throw new InvalidFragmentEntryFileException();
 				}
 
 				_importUtil.importFragmentEntries(
