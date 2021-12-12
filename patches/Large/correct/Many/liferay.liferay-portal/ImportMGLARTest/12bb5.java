diff --git a/portal-web/test/com/liferay/portalweb/portlet/mediagallery/mglar/importmglar/ImportMGLARTest.java b/portal-web/test/com/liferay/portalweb/portlet/mediagallery/mglar/importmglar/ImportMGLARTest.java
index f7d8bf8..f734a27 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/mediagallery/mglar/importmglar/ImportMGLARTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/mediagallery/mglar/importmglar/ImportMGLARTest.java
@@ -43,7 +43,7 @@
 		selenium.waitForPageToLoad("30000");
 		selenium.clickAt("link=Import", RuntimeVariables.replace("Import"));
 		selenium.waitForPageToLoad("30000");
-		selenium.sendKeys("//input[@id='_86_importFileName']",
+		selenium.uploadFile("//input[@id='_86_importFileName']",
 			RuntimeVariables.replace(
 				"L:\\portal\\build\\portal-web\\test\\com\\liferay\\portalweb\\portlet\\mediagallery\\dependencies\\Media_Gallery-Selenium.portlet.lar"));
 		assertFalse(selenium.isChecked(
