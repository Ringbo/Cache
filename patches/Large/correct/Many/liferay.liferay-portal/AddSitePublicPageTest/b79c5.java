diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/AddSitePublicPageTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/AddSitePublicPageTest.java
index 053c93d..ecc5502 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/AddSitePublicPageTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/assetpublisher/assertcannoteditapentry/AddSitePublicPageTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
