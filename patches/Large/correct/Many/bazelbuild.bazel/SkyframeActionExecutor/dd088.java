diff --git a/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeActionExecutor.java b/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeActionExecutor.java
index 632671d..82b8411 100644
--- a/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeActionExecutor.java
+++ b/src/main/java/com/google/devtools/build/lib/skyframe/SkyframeActionExecutor.java
@@ -736,7 +736,7 @@
     }
   }
 
-  private ActionExecutionException processAndThrow(
+  ActionExecutionException processAndThrow(
       ActionExecutionException e, Action action, FileOutErr outErrBuffer)
       throws ActionExecutionException {
     reportActionExecution(action, e, outErrBuffer);
