diff --git a/services/core/java/com/android/server/connectivity/LingerMonitor.java b/services/core/java/com/android/server/connectivity/LingerMonitor.java
index 0e727c5..929dfc4 100644
--- a/services/core/java/com/android/server/connectivity/LingerMonitor.java
+++ b/services/core/java/com/android/server/connectivity/LingerMonitor.java
@@ -90,8 +90,8 @@
         mNotifier = notifier;
         mDailyLimit = dailyLimit;
         mRateLimitMillis = rateLimitMillis;
-        // Ensure that (now - mFirstNotificationMillis) >= rateLimitMillis at first
-        mFirstNotificationMillis = -rateLimitMillis;
+        // Ensure that (now - mLastNotificationMillis) >= rateLimitMillis at first
+        mLastNotificationMillis = -rateLimitMillis;
     }
 
     private static HashMap<String, Integer> makeTransportToNameMap() {
