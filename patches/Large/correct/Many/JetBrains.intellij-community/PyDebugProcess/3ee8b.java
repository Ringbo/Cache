diff --git a/python/src/com/jetbrains/python/debugger/PyDebugProcess.java b/python/src/com/jetbrains/python/debugger/PyDebugProcess.java
index 3ab7886b..3570746 100644
--- a/python/src/com/jetbrains/python/debugger/PyDebugProcess.java
+++ b/python/src/com/jetbrains/python/debugger/PyDebugProcess.java
@@ -533,7 +533,8 @@
               breakpoint = myRegisteredExceptionBreakpoints.get(exceptionName);
             }
           }
-          if ((breakpoint != null) && (breakpoint.getSuspendPolicy() == SuspendPolicy.ALL)) {
+          if ((breakpoint != null) && (breakpoint.getType().isSuspendThreadSupported()) &&
+              (breakpoint.getSuspendPolicy() == SuspendPolicy.ALL)) {
             return true;
           }
         }
@@ -855,7 +856,7 @@
           }
         }
         if (breakpoint != null) {
-          if (breakpoint.getSuspendPolicy() == SuspendPolicy.ALL) {
+          if ((breakpoint.getType().isSuspendThreadSupported()) && (breakpoint.getSuspendPolicy() == SuspendPolicy.ALL)) {
             suspendAllOtherThreads(threadInfo);
           }
         }
