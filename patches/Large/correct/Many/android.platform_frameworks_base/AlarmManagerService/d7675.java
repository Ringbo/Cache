diff --git a/services/core/java/com/android/server/AlarmManagerService.java b/services/core/java/com/android/server/AlarmManagerService.java
index 882899e..08f0952 100644
--- a/services/core/java/com/android/server/AlarmManagerService.java
+++ b/services/core/java/com/android/server/AlarmManagerService.java
@@ -971,8 +971,8 @@
             // This is a special alarm that will put the system into idle until it goes off.
             // The caller has given the time they want this to happen at, however we need
             // to pull that earlier if there are existing alarms that have requested to
-            // bring us out of idle.
-            if (mNextWakeFromIdle != null) {
+            // bring us out of idle at an earlier time.
+            if (mNextWakeFromIdle != null && a.whenElapsed > mNextWakeFromIdle.whenElapsed) {
                 a.when = a.whenElapsed = a.maxWhenElapsed = mNextWakeFromIdle.whenElapsed;
             }
             // Add fuzz to make the alarm go off some time before the actual desired time.
