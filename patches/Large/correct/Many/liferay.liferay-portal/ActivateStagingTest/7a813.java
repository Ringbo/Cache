diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/activatestaging/ActivateStagingTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/activatestaging/ActivateStagingTest.java
index f4a6664..8deadf0 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/activatestaging/ActivateStagingTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/activatestaging/ActivateStagingTest.java
@@ -35,7 +35,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
