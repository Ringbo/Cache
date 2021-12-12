diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullFolderTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullFolderTest.java
index 7972d62..7ffbcee 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullFolderTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullFolderTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
