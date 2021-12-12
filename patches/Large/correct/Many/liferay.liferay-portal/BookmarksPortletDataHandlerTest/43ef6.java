diff --git a/modules/apps/bookmarks/bookmarks-test/src/testIntegration/java/com/liferay/bookmarks/internal/exportimport/data/handler/test/BookmarksPortletDataHandlerTest.java b/modules/apps/bookmarks/bookmarks-test/src/testIntegration/java/com/liferay/bookmarks/internal/exportimport/data/handler/test/BookmarksPortletDataHandlerTest.java
index 6e6549c..475a438 100644
--- a/modules/apps/bookmarks/bookmarks-test/src/testIntegration/java/com/liferay/bookmarks/internal/exportimport/data/handler/test/BookmarksPortletDataHandlerTest.java
+++ b/modules/apps/bookmarks/bookmarks-test/src/testIntegration/java/com/liferay/bookmarks/internal/exportimport/data/handler/test/BookmarksPortletDataHandlerTest.java
@@ -101,7 +101,7 @@
 
 	@Override
 	protected DataLevel getDataLevel() {
-		return DataLevel.SITE;
+		return DataLevel.PORTLET_INSTANCE;
 	}
 
 	@Override
@@ -121,12 +121,12 @@
 
 	@Override
 	protected boolean isDataPortletInstanceLevel() {
-		return false;
+		return true;
 	}
 
 	@Override
 	protected boolean isDataSiteLevel() {
-		return true;
+		return false;
 	}
 
 }
\ No newline at end of file
