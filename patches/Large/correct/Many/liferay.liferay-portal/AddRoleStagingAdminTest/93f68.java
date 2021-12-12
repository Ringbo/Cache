diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AddRoleStagingAdminTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AddRoleStagingAdminTest.java
index 0737e75..4a8886c 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AddRoleStagingAdminTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AddRoleStagingAdminTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
