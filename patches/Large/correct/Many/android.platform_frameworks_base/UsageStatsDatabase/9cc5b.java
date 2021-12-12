diff --git a/services/usage/java/com/android/server/usage/UsageStatsDatabase.java b/services/usage/java/com/android/server/usage/UsageStatsDatabase.java
index e55e073..9705469 100644
--- a/services/usage/java/com/android/server/usage/UsageStatsDatabase.java
+++ b/services/usage/java/com/android/server/usage/UsageStatsDatabase.java
@@ -503,7 +503,7 @@
                     mCal.getTimeInMillis());
 
             mCal.setTimeInMillis(currentTimeMillis);
-            mCal.addDays(-7);
+            mCal.addDays(-10);
             pruneFilesOlderThan(mIntervalDirs[UsageStatsManager.INTERVAL_DAILY],
                     mCal.getTimeInMillis());
 
