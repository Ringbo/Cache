diff --git a/src/com/facebook/buck/cli/InstallCommand.java b/src/com/facebook/buck/cli/InstallCommand.java
index cfca252..860c27d 100644
--- a/src/com/facebook/buck/cli/InstallCommand.java
+++ b/src/com/facebook/buck/cli/InstallCommand.java
@@ -462,7 +462,7 @@
         params.getConsole().printBuildFailure(hre.getMessage());
         return ExitCode.RUN_ERROR;
       } catch (Exception e) {
-        throw new BuckUncheckedExecutionException("When starting activity.");
+        throw new BuckUncheckedExecutionException(e, "When starting activity.");
       }
     }
 
