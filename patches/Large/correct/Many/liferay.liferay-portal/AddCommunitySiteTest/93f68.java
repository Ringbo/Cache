diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AddCommunitySiteTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AddCommunitySiteTest.java
index b79301dc..6a4d74e 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AddCommunitySiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/AddCommunitySiteTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
