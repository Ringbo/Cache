diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/TearDownBookmarkFolderCPTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/TearDownBookmarkFolderCPTest.java
index cb24b23..5a22e6d 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/TearDownBookmarkFolderCPTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/TearDownBookmarkFolderCPTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
