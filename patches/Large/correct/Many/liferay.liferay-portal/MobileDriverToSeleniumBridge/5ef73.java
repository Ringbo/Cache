diff --git a/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/MobileDriverToSeleniumBridge.java b/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/MobileDriverToSeleniumBridge.java
index 7fef2c2..a7cb8a6 100644
--- a/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/MobileDriverToSeleniumBridge.java
+++ b/portal-web/test/functional/com/liferay/portalweb/portal/util/liferayselenium/MobileDriverToSeleniumBridge.java
@@ -137,7 +137,7 @@
 		}
 		catch (Exception e) {
 			if (!webElement.isDisplayed()) {
-				scrollWebElementIntoView(webDriver, webElement);
+				scrollWebElementIntoView(webElement);
 			}
 
 			webElement.click();
@@ -152,7 +152,7 @@
 	public void clickAt(
 		String locator, String coordString, boolean scrollIntoView) {
 
-		WebDriverHelper.click(this, locator);
+		click(locator);
 	}
 
 	@Override
@@ -450,10 +450,10 @@
 	}
 
 	public String getText(String locator, String timeout) {
-		WebElement webElement = getWebElement(webDriver, locator, timeout);
+		WebElement webElement = getWebElement(locator, timeout);
 
 		if (!webElement.isDisplayed()) {
-			scrollWebElementIntoView(webDriver, webElement);
+			scrollWebElementIntoView(webElement);
 		}
 
 		String text = webElement.getText();
@@ -563,10 +563,10 @@
 
 	@Override
 	public boolean isVisible(String locator) {
-		WebElement webElement = getWebElement(webDriver, locator, "1");
+		WebElement webElement = getWebElement(locator, "1");
 
 		if (!webElement.isDisplayed()) {
-			scrollWebElementIntoView(webDriver, webElement);
+			scrollWebElementIntoView(webElement);
 		}
 
 		return webElement.isDisplayed();
