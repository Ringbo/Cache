diff --git a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/git/PullRequestPluginTest.java b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/git/PullRequestPluginTest.java
index ec4384e..273e07a 100644
--- a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/git/PullRequestPluginTest.java
+++ b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/git/PullRequestPluginTest.java
@@ -143,7 +143,7 @@
     mainBrowserTabHandle = seleniumWebDriver.getWindowHandle();
 
     // wait until jdt.ls initialized this need to avoid problem in next steps of test
-    consoles.waitUntilJdtLsStarted();
+    consoles.waitJDTLSStartedMessage();
     // add committer info
     testUserPreferencesServiceClient.addGitCommitter(gitHubUsername, user.getEmail());
 
