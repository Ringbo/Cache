diff --git a/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/WebDriverToSeleniumBridge.java b/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/WebDriverToSeleniumBridge.java
index a62f208..c4dd121 100644
--- a/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/WebDriverToSeleniumBridge.java
+++ b/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/WebDriverToSeleniumBridge.java
@@ -200,14 +200,14 @@
 			open(url);
 		}
 		else {
-			WebElement webElement = getWebElement(webDriver, locator);
+			WebElement webElement = getWebElement(locator);
 
 			try {
 				webElement.click();
 			}
 			catch (Exception e) {
 				if (!webElement.isDisplayed()) {
-					scrollWebElementIntoView(webDriver, webElement);
+					scrollWebElementIntoView(webElement);
 				}
 
 				webElement.click();
@@ -767,10 +767,10 @@
 			return getHtmlNodeText(locator);
 		}
 
-		WebElement webElement = getWebElement(webDriver, locator, timeout);
+		WebElement webElement = getWebElement(locator, timeout);
 
 		if (!webElement.isDisplayed()) {
-			scrollWebElementIntoView(webDriver, webElement);
+			scrollWebElementIntoView(webElement);
 		}
 
 		String text = webElement.getText();
@@ -913,10 +913,10 @@
 
 	@Override
 	public boolean isVisible(String locator) {
-		WebElement webElement = getWebElement(webDriver, locator, "1");
+		WebElement webElement = getWebElement(locator, "1");
 
 		if (!webElement.isDisplayed()) {
-			scrollWebElementIntoView(webDriver, webElement);
+			scrollWebElementIntoView(webElement);
 		}
 
 		return webElement.isDisplayed();
