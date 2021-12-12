diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsDocumentsStagingAdminTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsDocumentsStagingAdminTest.java
index 4034209..d7745c2 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsDocumentsStagingAdminTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/DefinePermissionsDocumentsStagingAdminTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
