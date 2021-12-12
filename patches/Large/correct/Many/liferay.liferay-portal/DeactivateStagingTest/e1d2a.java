diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/usecase/demo1/DeactivateStagingTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/usecase/demo1/DeactivateStagingTest.java
index d55b869..57231c7 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/usecase/demo1/DeactivateStagingTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/webcontentdisplay/usecase/demo1/DeactivateStagingTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
