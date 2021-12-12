diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/AddSiteTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/AddSiteTest.java
index 68d78f4f..681c607 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/AddSiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/AddSiteTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
