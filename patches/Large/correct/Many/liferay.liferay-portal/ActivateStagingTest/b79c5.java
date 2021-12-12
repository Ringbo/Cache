diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/ActivateStagingTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/ActivateStagingTest.java
index ec7f66f..ef89cda 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/ActivateStagingTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/ActivateStagingTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
