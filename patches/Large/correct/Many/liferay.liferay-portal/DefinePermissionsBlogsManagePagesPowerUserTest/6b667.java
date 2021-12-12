diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/DefinePermissionsBlogsManagePagesPowerUserTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/DefinePermissionsBlogsManagePagesPowerUserTest.java
index d36f819..2150d66 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/DefinePermissionsBlogsManagePagesPowerUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/DefinePermissionsBlogsManagePagesPowerUserTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
