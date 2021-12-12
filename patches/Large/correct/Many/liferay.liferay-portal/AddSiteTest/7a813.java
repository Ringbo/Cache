diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/activatestaging/AddSiteTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/activatestaging/AddSiteTest.java
index dd1e2dd..2165077 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/activatestaging/AddSiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/activatestaging/AddSiteTest.java
@@ -30,7 +30,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
