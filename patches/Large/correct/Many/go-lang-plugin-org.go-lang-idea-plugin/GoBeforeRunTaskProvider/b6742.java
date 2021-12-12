diff --git a/src/com/goide/runconfig/before/GoBeforeRunTaskProvider.java b/src/com/goide/runconfig/before/GoBeforeRunTaskProvider.java
index 76ef3bc..6f62565 100644
--- a/src/com/goide/runconfig/before/GoBeforeRunTaskProvider.java
+++ b/src/com/goide/runconfig/before/GoBeforeRunTaskProvider.java
@@ -134,7 +134,7 @@
         if (!sdkService.isGoModule(module)) return;
 
         done.down();
-        GoExecutor.in(module).withParameters(task.getCommand())
+        GoExecutor.in(module).withParameterString(task.getCommand())
           .withWorkDirectory(workingDirectory)
           .showOutputOnError()
           .showNotifications(false)
