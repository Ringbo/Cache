diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsSiteAdministrationStagingAdminTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsSiteAdministrationStagingAdminTest.java
index e3ab368..fe3ac083 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsSiteAdministrationStagingAdminTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsSiteAdministrationStagingAdminTest.java
@@ -33,7 +33,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
