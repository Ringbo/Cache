diff --git a/src/com/facebook/buck/shell/WorkerShellStep.java b/src/com/facebook/buck/shell/WorkerShellStep.java
index 566711b..94966d6 100644
--- a/src/com/facebook/buck/shell/WorkerShellStep.java
+++ b/src/com/facebook/buck/shell/WorkerShellStep.java
@@ -82,7 +82,7 @@
         }
       }
       return StepExecutionResult.of(result.getExitCode());
-    } catch (IOException e) {
+    } catch (Exception e) {
       throw new HumanReadableException(e, "Error communicating with external process.");
     } finally {
       if (pool != null && process != null) {
