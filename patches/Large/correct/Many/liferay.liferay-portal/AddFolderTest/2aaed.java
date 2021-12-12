diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddFolderTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddFolderTest.java
index 815f342..e9de88a 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddFolderTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddFolderTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
