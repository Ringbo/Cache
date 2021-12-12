diff --git a/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/NotificationsPopupPanel.java b/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/NotificationsPopupPanel.java
index fcfc74a..3759575 100644
--- a/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/NotificationsPopupPanel.java
+++ b/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/NotificationsPopupPanel.java
@@ -123,7 +123,7 @@
               (ExpectedCondition<Boolean>)
                   input -> getAllMessagesFromProgressPopupPanel(timeout).contains(message));
     } catch (StaleElementReferenceException ex) {
-      LOG.error(ex.getLocalizedMessage(), ex);
+      LOG.debug(ex.getLocalizedMessage(), ex);
       WaitUtils.sleepQuietly(500, TimeUnit.MILLISECONDS);
       new WebDriverWait(seleniumWebDriver, timeout)
           .until(ExpectedConditions.textToBePresentInElement(progressPopupPanel, message));
