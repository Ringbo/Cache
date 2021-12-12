diff --git a/src/com/facebook/buck/cli/Main.java b/src/com/facebook/buck/cli/Main.java
index 3ccf0aa..87232b9 100644
--- a/src/com/facebook/buck/cli/Main.java
+++ b/src/com/facebook/buck/cli/Main.java
@@ -577,7 +577,7 @@
     }
 
     // Return help strings fast if the command is a help request.
-    Optional<ExitCode> result = command.runHelp(stdErr);
+    Optional<ExitCode> result = command.runHelp(stdOut);
     if (result.isPresent()) {
       return result.get();
     }
