diff --git a/src/com/facebook/buck/distributed/build_client/DistBuildController.java b/src/com/facebook/buck/distributed/build_client/DistBuildController.java
index 90eea0a..1e45927 100644
--- a/src/com/facebook/buck/distributed/build_client/DistBuildController.java
+++ b/src/com/facebook/buck/distributed/build_client/DistBuildController.java
@@ -170,7 +170,8 @@
               invocationInfo,
               ruleKeyCalculatorFuture);
     } catch (IOException | RuntimeException ex) { // Important: Don't swallow InterruptedException
-      LOG.error(ex, "Distributed build step failed.");
+      // Don't print an error here, because we might have failed due to local finishing first.
+      LOG.warn(ex, "Distributed build step failed.");
       return createFailedExecutionResult(
           Preconditions.checkNotNull(stampedeIdReference.get()),
           ExitCode.DISTRIBUTED_BUILD_STEP_LOCAL_EXCEPTION);
