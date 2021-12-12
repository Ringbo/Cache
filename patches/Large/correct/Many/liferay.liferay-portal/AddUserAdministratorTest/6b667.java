diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/AddUserAdministratorTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/AddUserAdministratorTest.java
index 5785457..b2b1d41 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/AddUserAdministratorTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/AddUserAdministratorTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
