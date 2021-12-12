diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/site/deactivatestaging/DeactivateStagingTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/site/deactivatestaging/DeactivateStagingTest.java
index 7a3f5c6..2b6726d 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/site/deactivatestaging/DeactivateStagingTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/site/deactivatestaging/DeactivateStagingTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
