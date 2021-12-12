diff --git a/test/com/facebook/buck/cli/BuildCommandIntegrationTest.java b/test/com/facebook/buck/cli/BuildCommandIntegrationTest.java
index dc26fe1..175e05a 100644
--- a/test/com/facebook/buck/cli/BuildCommandIntegrationTest.java
+++ b/test/com/facebook/buck/cli/BuildCommandIntegrationTest.java
@@ -248,8 +248,7 @@
         TestDataHelper.createProjectWorkspaceForScenario(this, "multiple_cell_build", tmp);
     workspace.setUp();
     ProcessResult runBuckResult =
-        workspace.runBuckBuild(
-            "//main/...", "-c", "project.embedded_cell_buck_out_enabled=true", "//main/...");
+        workspace.runBuckBuild("-c", "project.embedded_cell_buck_out_enabled=true", "//main/...");
     runBuckResult.assertSuccess();
 
     assertTrue(Files.exists(workspace.getPath("buck-out/cells/cxx")));
