diff --git a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/git/PullRequestPluginWithForkTest.java b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/git/PullRequestPluginWithForkTest.java
index afb22c7..2bde4c9 100644
--- a/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/git/PullRequestPluginWithForkTest.java
+++ b/selenium/che-selenium-test/src/test/java/org/eclipse/che/selenium/git/PullRequestPluginWithForkTest.java
@@ -89,7 +89,7 @@
 
     ide.open(testWorkspace);
     // wait until jdt.ls initialized this need to avoid problem in next steps of test
-    consoles.waitUntilJdtLsStarted();
+    consoles.waitJDTLSStartedMessage();
 
     // add committer info
     testUserPreferencesServiceClient.addGitCommitter(githubUserName, testUser.getEmail());
