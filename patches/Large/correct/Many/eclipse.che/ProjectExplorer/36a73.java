diff --git a/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/ProjectExplorer.java b/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/ProjectExplorer.java
index 70cf578..f728788 100644
--- a/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/ProjectExplorer.java
+++ b/selenium/che-selenium-test/src/main/java/org/eclipse/che/selenium/pageobject/ProjectExplorer.java
@@ -380,7 +380,7 @@
     // sometimes an element in the project explorer may not be attached to the DOM. We should
     // refresh all items.
     catch (StaleElementReferenceException ex) {
-      LOG.warn(ex.getLocalizedMessage(), ex);
+      LOG.debug(ex.getLocalizedMessage(), ex);
 
       waitProjectExplorer();
       clickOnRefreshTreeButton();
@@ -411,7 +411,7 @@
     // sometimes an element in the project explorer may not be attached to the DOM. We should
     // refresh all items.
     catch (StaleElementReferenceException ex) {
-      LOG.warn(ex.getLocalizedMessage(), ex);
+      LOG.debug(ex.getLocalizedMessage(), ex);
 
       waitProjectExplorer();
       clickOnRefreshTreeButton();
@@ -492,7 +492,7 @@
     // sometimes an element in the project explorer may not be attached to the DOM. We should
     // refresh all items.
     catch (StaleElementReferenceException ex) {
-      LOG.warn(ex.getLocalizedMessage(), ex);
+      LOG.debug(ex.getLocalizedMessage(), ex);
 
       clickOnRefreshTreeButton();
       waitItem(path);
