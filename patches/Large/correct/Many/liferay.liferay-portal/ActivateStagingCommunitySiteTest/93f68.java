diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/ActivateStagingCommunitySiteTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/ActivateStagingCommunitySiteTest.java
index 9c3da61..3a71ac25 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/ActivateStagingCommunitySiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/sites/usecase/demo1/ActivateStagingCommunitySiteTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
