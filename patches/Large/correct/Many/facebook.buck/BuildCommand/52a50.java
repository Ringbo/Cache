diff --git a/src/com/facebook/buck/cli/BuildCommand.java b/src/com/facebook/buck/cli/BuildCommand.java
index 9deb01d..05f61eb 100644
--- a/src/com/facebook/buck/cli/BuildCommand.java
+++ b/src/com/facebook/buck/cli/BuildCommand.java
@@ -472,18 +472,18 @@
       this.arguments.addAll(additionalTargets);
     }
     BuildEvent.Started started = postBuildStartedEvent(params);
-    ExitCode exitCode = ExitCode.BUILD_ERROR;
+    BuildRunResult result = ImmutableBuildRunResult.of(ExitCode.BUILD_ERROR, ImmutableList.of());
     try (CloseableMemoizedSupplier<ForkJoinPool> poolSupplier =
         getForkJoinPoolSupplier(params.getBuckConfig())) {
-      return executeBuildAndProcessResult(params, commandThreadManager, poolSupplier);
+      result = executeBuildAndProcessResult(params, commandThreadManager, poolSupplier);
     } catch (ActionGraphCreationException e) {
       params.getConsole().printBuildFailure(e.getMessage());
-      exitCode = ExitCode.PARSE_ERROR;
+      result = ImmutableBuildRunResult.of(ExitCode.PARSE_ERROR, ImmutableList.of());
     } finally {
-      params.getBuckEventBus().post(BuildEvent.finished(started, exitCode));
+      params.getBuckEventBus().post(BuildEvent.finished(started, result.getExitCode()));
     }
 
-    return ImmutableBuildRunResult.of(exitCode, ImmutableList.of());
+    return result;
   }
 
   private BuildEvent.Started postBuildStartedEvent(CommandRunnerParams params) {
