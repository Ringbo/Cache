diff --git a/app/src/main/java/com/fastaccess/provider/tasks/notification/NotificationSchedulerJobTask.java b/app/src/main/java/com/fastaccess/provider/tasks/notification/NotificationSchedulerJobTask.java
index 772079a..12cead3 100644
--- a/app/src/main/java/com/fastaccess/provider/tasks/notification/NotificationSchedulerJobTask.java
+++ b/app/src/main/java/com/fastaccess/provider/tasks/notification/NotificationSchedulerJobTask.java
@@ -46,7 +46,7 @@
     private static final String NOTIFICATION_GROUP_ID = "FastHub";
 
     @Override public boolean onStartJob(JobParameters job) {
-        if (PrefGetter.getNotificationTaskDuration(this) != -1) {
+        if (PrefGetter.getNotificationTaskDuration(this) == -1) {
             scheduleJob(this, -1, false);
             finishJob(job);
             return true;
