diff --git a/python/src/com/jetbrains/python/testing/PythonTestCommandLineStateBase.java b/python/src/com/jetbrains/python/testing/PythonTestCommandLineStateBase.java
index c004a44..94b14ba 100644
--- a/python/src/com/jetbrains/python/testing/PythonTestCommandLineStateBase.java
+++ b/python/src/com/jetbrains/python/testing/PythonTestCommandLineStateBase.java
@@ -132,7 +132,7 @@
     });
     }
 
-    executionResult.setRestartActions(rerunFailedTestsAction, new ToggleAutoTestAction());
+    executionResult.setRestartActions(rerunFailedTestsAction, new ToggleAutoTestAction(getEnvironment()));
     return executionResult;
   }
 
