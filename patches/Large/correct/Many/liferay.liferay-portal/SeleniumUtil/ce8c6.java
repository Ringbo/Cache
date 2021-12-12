diff --git a/modules/test/poshi-runner/src/com/liferay/poshi/runner/selenium/SeleniumUtil.java b/modules/test/poshi-runner/src/com/liferay/poshi/runner/selenium/SeleniumUtil.java
index db208f0..d887c3a 100644
--- a/modules/test/poshi-runner/src/com/liferay/poshi/runner/selenium/SeleniumUtil.java
+++ b/modules/test/poshi-runner/src/com/liferay/poshi/runner/selenium/SeleniumUtil.java
@@ -78,7 +78,7 @@
 				System.setProperty(
 					"webdriver.ie.driver",
 					SELENIUM_EXECUTABLE_DIR_NAME +
-						SELENIUM_CHROME_DRIVER_EXECUTABLE);
+						SELENIUM_IE_DRIVER_EXECUTABLE);
 
 				_selenium = new InternetExplorerWebDriverImpl(
 					projectDirName, portalURL);
