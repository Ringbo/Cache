diff --git a/modules/test/poshi-runner/src/com/liferay/poshi/runner/selenium/SeleniumUtil.java b/modules/test/poshi-runner/src/com/liferay/poshi/runner/selenium/SeleniumUtil.java
index c1f8872..2a49941 100644
--- a/modules/test/poshi-runner/src/com/liferay/poshi/runner/selenium/SeleniumUtil.java
+++ b/modules/test/poshi-runner/src/com/liferay/poshi/runner/selenium/SeleniumUtil.java
@@ -43,7 +43,7 @@
 	}
 
 	private void _startSelenium() {
-		String projectDir = PoshiRunnerGetterUtil.getProjectDir();
+		String projectDirName = PoshiRunnerGetterUtil.getProjectDirName();
 
 		String portalURL = PORTAL_URL;
 
@@ -52,23 +52,23 @@
 		}
 
 		if (MOBILE_DEVICE_TYPE.equals("android")) {
-			_selenium = new AndroidMobileDriverImpl(projectDir, portalURL);
+			_selenium = new AndroidMobileDriverImpl(projectDirName, portalURL);
 		}
 		else if (MOBILE_DEVICE_TYPE.equals("ios")) {
-			_selenium = new IOSMobileDriverImpl(projectDir, portalURL);
+			_selenium = new IOSMobileDriverImpl(projectDirName, portalURL);
 		}
 		else {
 			if (BROWSER_TYPE.equals("*chrome") ||
 				BROWSER_TYPE.equals("*firefox")) {
 
-				_selenium = new FirefoxWebDriverImpl(projectDir, portalURL);
+				_selenium = new FirefoxWebDriverImpl(projectDirName, portalURL);
 			}
 			else if (BROWSER_TYPE.equals("*googlechrome")) {
 				System.setProperty(
 					"webdriver.chrome.driver",
 					SELENIUM_EXECUTABLE_DIR_NAME + "\\chromedriver.exe");
 
-				_selenium = new ChromeWebDriverImpl(projectDir, portalURL);
+				_selenium = new ChromeWebDriverImpl(projectDirName, portalURL);
 			}
 			else if (BROWSER_TYPE.equals("*iehta") ||
 					 BROWSER_TYPE.equals("*iexplore")) {
@@ -78,10 +78,10 @@
 					SELENIUM_EXECUTABLE_DIR_NAME + "\\IEDriverServer.exe");
 
 				_selenium = new InternetExplorerWebDriverImpl(
-					projectDir, portalURL);
+					projectDirName, portalURL);
 			}
 			else if (BROWSER_TYPE.equals("*safari")) {
-				_selenium = new SafariWebDriverImpl(projectDir, portalURL);
+				_selenium = new SafariWebDriverImpl(projectDirName, portalURL);
 			}
 			else {
 				throw new RuntimeException(
