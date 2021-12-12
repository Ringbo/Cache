diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/TearDownPermissionsTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/TearDownPermissionsTest.java
index 29ec3fd..b436fdb 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/TearDownPermissionsTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/TearDownPermissionsTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
