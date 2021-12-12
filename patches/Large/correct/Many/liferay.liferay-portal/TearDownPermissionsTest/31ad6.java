diff --git a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/TearDownPermissionsTest.java b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/TearDownPermissionsTest.java
index 1f71f1b..96f9b1c 100644
--- a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/TearDownPermissionsTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/TearDownPermissionsTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
