diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsWCDStagingAdminTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsWCDStagingAdminTest.java
index 64deb98..824b58a 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsWCDStagingAdminTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsWCDStagingAdminTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
