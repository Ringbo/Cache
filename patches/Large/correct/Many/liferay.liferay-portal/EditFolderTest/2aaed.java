diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/EditFolderTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/EditFolderTest.java
index 075c90d..1a38b7b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/EditFolderTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/EditFolderTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
