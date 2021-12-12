diff --git a/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/Menu.java b/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/Menu.java
index 8f028eb..6b6c366 100644
--- a/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/Menu.java
+++ b/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/Menu.java
@@ -117,7 +117,7 @@
           .click();
 
     } catch (WebDriverException ex) {
-      LOG.error(ex.getLocalizedMessage(), ex);
+      LOG.warn(ex.getLocalizedMessage());
       WaitUtils.sleepQuietly(REDRAW_UI_ELEMENTS_TIMEOUT_SEC, TimeUnit.MILLISECONDS);
       redrawMenuItemsWait
           .until(ExpectedConditions.visibilityOfElementLocated(By.id(idTopMenuCommand)))
