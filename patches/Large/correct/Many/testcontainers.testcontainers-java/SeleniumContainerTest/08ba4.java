diff --git a/examples/selenium-container/src/test/java/SeleniumContainerTest.java b/examples/selenium-container/src/test/java/SeleniumContainerTest.java
index 9630a87..528397f 100644
--- a/examples/selenium-container/src/test/java/SeleniumContainerTest.java
+++ b/examples/selenium-container/src/test/java/SeleniumContainerTest.java
@@ -30,7 +30,7 @@
         searchInput.sendKeys("Rick Astley");
         searchInput.submit();
 
-        WebElement otherPage = driver.findElementByLinkText("Rickrolling");
+        WebElement otherPage = driver.findElementByPartialLinkText("Rickrolling");
         otherPage.click();
 
         boolean expectedTextFound = driver.findElementsByCssSelector("p")
