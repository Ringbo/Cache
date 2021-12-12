diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/event/addeventrepeatdailysptl/AddSiteTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/event/addeventrepeatdailysptl/AddSiteTest.java
index 93b49d2..d8c0c08 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/event/addeventrepeatdailysptl/AddSiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/event/addeventrepeatdailysptl/AddSiteTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
