diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/deactivatestaging/DeactivateStagingTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/deactivatestaging/DeactivateStagingTest.java
index 6471f71..95da535 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/deactivatestaging/DeactivateStagingTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/deactivatestaging/DeactivateStagingTest.java
@@ -30,7 +30,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
