diff --git a/api/src/main/java/org/openmrs/scheduler/timer/TimerSchedulerServiceImpl.java b/api/src/main/java/org/openmrs/scheduler/timer/TimerSchedulerServiceImpl.java
index 89cf2dc..596f2dd 100644
--- a/api/src/main/java/org/openmrs/scheduler/timer/TimerSchedulerServiceImpl.java
+++ b/api/src/main/java/org/openmrs/scheduler/timer/TimerSchedulerServiceImpl.java
@@ -295,7 +295,7 @@
 			
 			// Update task that has been started
 			taskDefinition.setStarted(false);
-			saveTask(taskDefinition);
+			saveTaskDefinition(taskDefinition);
 		}
 	}
 	
