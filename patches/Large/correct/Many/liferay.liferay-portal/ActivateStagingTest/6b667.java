diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/ActivateStagingTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/ActivateStagingTest.java
index 07da4ed..251a367 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/ActivateStagingTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/blogs/ActivateStagingTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
