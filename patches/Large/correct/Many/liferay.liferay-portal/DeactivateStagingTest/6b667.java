diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/DeactivateStagingTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/DeactivateStagingTest.java
index a46a8fc..c3e4921 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/DeactivateStagingTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/DeactivateStagingTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
