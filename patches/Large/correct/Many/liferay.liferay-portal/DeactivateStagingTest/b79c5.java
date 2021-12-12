diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/DeactivateStagingTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/DeactivateStagingTest.java
index 2e153a8..2ad4128 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/DeactivateStagingTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/DeactivateStagingTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
