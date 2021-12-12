diff --git a/api/src/main/java/org/openmrs/scheduler/timer/TimerSchedulerTask.java b/api/src/main/java/org/openmrs/scheduler/timer/TimerSchedulerTask.java
index 843deb6..3bb1f19 100644
--- a/api/src/main/java/org/openmrs/scheduler/timer/TimerSchedulerTask.java
+++ b/api/src/main/java/org/openmrs/scheduler/timer/TimerSchedulerTask.java
@@ -48,7 +48,7 @@
 		try {
 			Daemon.executeScheduledTask(task);
 		}
-		catch (Throwable t) {
+		catch (Exception t) {
 			// Fix #862: IllegalStateException: Timer already cancelled.
 			// Suppress error in order to keep the scheduler's Timer from completely failing.
 			log.error(
