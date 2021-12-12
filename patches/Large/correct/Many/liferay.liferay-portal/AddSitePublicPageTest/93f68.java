diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/event/addeventrepeatdailysptl/AddSitePublicPageTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/event/addeventrepeatdailysptl/AddSitePublicPageTest.java
index 4aea602..8db9128 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/event/addeventrepeatdailysptl/AddSitePublicPageTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/event/addeventrepeatdailysptl/AddSitePublicPageTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
