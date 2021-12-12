diff --git a/test/com/facebook/buck/java/ExternalJavacIntegrationTest.java b/test/com/facebook/buck/java/ExternalJavacIntegrationTest.java
index 0022970..de67a09 100644
--- a/test/com/facebook/buck/java/ExternalJavacIntegrationTest.java
+++ b/test/com/facebook/buck/java/ExternalJavacIntegrationTest.java
@@ -108,7 +108,9 @@
 
     workspace.replaceFileContents(".buckconfig", "@JAVAC@", javac.getAbsolutePath());
     workspace.runBuckdCommand(
-        ImmutableMap.of("CHECK_THIS_VARIABLE", "1"),
+        ImmutableMap.of(
+            "CHECK_THIS_VARIABLE", "1",
+            "PATH", System.getenv("PATH")),
         "build",
         "example")
         .assertSuccess();
