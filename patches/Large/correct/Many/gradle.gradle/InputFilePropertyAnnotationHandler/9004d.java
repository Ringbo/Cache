diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/project/taskfactory/InputFilePropertyAnnotationHandler.java b/subprojects/core/src/main/java/org/gradle/api/internal/project/taskfactory/InputFilePropertyAnnotationHandler.java
index 0423913..421ab8e 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/project/taskfactory/InputFilePropertyAnnotationHandler.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/project/taskfactory/InputFilePropertyAnnotationHandler.java
@@ -28,6 +28,6 @@
     }
 
     protected TaskInputFilePropertyBuilder createPropertyBuilder(TaskPropertyActionContext context, TaskInternal task, TaskPropertyValue futureValue) {
-        return task.getInputs().files(futureValue);
+        return task.getInputs().file(futureValue);
     }
 }
