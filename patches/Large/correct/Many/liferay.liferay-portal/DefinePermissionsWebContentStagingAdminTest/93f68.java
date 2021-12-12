diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsWebContentStagingAdminTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsWebContentStagingAdminTest.java
index f6efb390..4018501 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsWebContentStagingAdminTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsWebContentStagingAdminTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
