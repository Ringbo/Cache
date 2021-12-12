diff --git a/python/educational-python/course-creator-python/src/com/jetbrains/edu/coursecreator/run/PyCCCommandLineState.java b/python/educational-python/course-creator-python/src/com/jetbrains/edu/coursecreator/run/PyCCCommandLineState.java
index c11593f..02e9d13 100644
--- a/python/educational-python/course-creator-python/src/com/jetbrains/edu/coursecreator/run/PyCCCommandLineState.java
+++ b/python/educational-python/course-creator-python/src/com/jetbrains/edu/coursecreator/run/PyCCCommandLineState.java
@@ -100,7 +100,7 @@
     CCUtils.updateResources(myRunConfiguration.getProject(), myTask, myTaskDir);
     ApplicationManager.getApplication().runWriteAction(() -> StudyCheckUtils.flushWindows(myTask, myTaskDir));
 
-    return super.execute(executor, patchers);
+    return super.execute(executor, processStarter, patchers);
   }
 
   @Override
