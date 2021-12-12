diff --git a/python/src/com/jetbrains/python/console/PydevConsoleRunnerImpl.java b/python/src/com/jetbrains/python/console/PydevConsoleRunnerImpl.java
index 5ca6b40..44701e2 100644
--- a/python/src/com/jetbrains/python/console/PydevConsoleRunnerImpl.java
+++ b/python/src/com/jetbrains/python/console/PydevConsoleRunnerImpl.java
@@ -360,7 +360,7 @@
       exeGroup.addParametersString(runParams.getInterpreterOptions());
     }
 
-    PydevConsoleCli.setupPythonConsoleScriptInClientMode(cmd, port);
+    PydevConsoleCli.setupPythonConsoleScriptInClientMode(cmd, sdk, port);
 
     return cmd;
   }
