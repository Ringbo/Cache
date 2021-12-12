diff --git a/test/com/facebook/buck/cli/DaemonIntegrationTest.java b/test/com/facebook/buck/cli/DaemonIntegrationTest.java
index 754e22d..0f8eafc 100644
--- a/test/com/facebook/buck/cli/DaemonIntegrationTest.java
+++ b/test/com/facebook/buck/cli/DaemonIntegrationTest.java
@@ -217,7 +217,7 @@
               new BuildId(),
               tmp.getRootPath(),
               Optional.<NGContext>of(new TestContext()),
-              ImmutableMap.<String, String>of(),
+              ImmutableMap.copyOf(System.getenv()),
               args);
           assertEquals("Unexpected exit code.", expectedExitCode, exitCode);
         } catch (IOException e) {
