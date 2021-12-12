diff --git a/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/viewactivatedeactivatesitestaginglocallivedl/DeactivateStagingTest.java b/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/viewactivatedeactivatesitestaginglocallivedl/DeactivateStagingTest.java
index 4e48288..53b48c4 100644
--- a/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/viewactivatedeactivatesitestaginglocallivedl/DeactivateStagingTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingcommunity/documentlibrary/document/viewactivatedeactivatesitestaginglocallivedl/DeactivateStagingTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
