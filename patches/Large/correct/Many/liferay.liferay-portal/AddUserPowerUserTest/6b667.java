diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/AddUserPowerUserTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/AddUserPowerUserTest.java
index f1fcead..6118194 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/AddUserPowerUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/AddUserPowerUserTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
