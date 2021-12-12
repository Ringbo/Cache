diff --git a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/theia/TheiaBuildPluginTest.java b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/theia/TheiaBuildPluginTest.java
index c7e493f..c1d06f5 100644
--- a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/theia/TheiaBuildPluginTest.java
+++ b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/theia/TheiaBuildPluginTest.java
@@ -174,7 +174,7 @@
     waitHostedPageReady();
     theiaProjectTree.clickOnFilesTab();
     theiaProjectTree.waitProjectAreaOpened();
-    theiaProjectTree.waitOpenWorkspaceButton();
+    theiaProjectTree.waitItem(projectName);
 
     // check plugin output
     theiaIde.pressKeyCombination(Keys.LEFT_CONTROL, Keys.LEFT_SHIFT, "p");
@@ -205,7 +205,7 @@
     seleniumWebDriver.navigate().refresh();
     waitHostedPageReady();
     theiaProjectTree.waitProjectAreaOpened();
-    theiaProjectTree.waitOpenWorkspaceButton();
+    theiaProjectTree.waitItem(projectName);
     theiaIde.pressKeyCombination(Keys.LEFT_CONTROL, Keys.LEFT_SHIFT, "p");
     theiaProposalForm.waitSearchField();
     theiaProposalForm.enterTextToSearchField(helloWorldSearchSequence);
