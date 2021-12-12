diff --git a/services/core/java/com/android/server/notification/NotificationUsageStats.java b/services/core/java/com/android/server/notification/NotificationUsageStats.java
index 07142f0..34c5283 100644
--- a/services/core/java/com/android/server/notification/NotificationUsageStats.java
+++ b/services/core/java/com/android/server/notification/NotificationUsageStats.java
@@ -146,7 +146,8 @@
     /**
      * Called when a notification has been updated.
      */
-    public void registerUpdatedByApp(NotificationRecord notification, NotificationRecord old) {
+    public synchronized void registerUpdatedByApp(NotificationRecord notification,
+            NotificationRecord old) {
         notification.stats.updateFrom(old.stats);
         AggregatedStats[] aggregatedStatsArray = getAggregatedStatsLocked(notification);
         for (AggregatedStats stats : aggregatedStatsArray) {
