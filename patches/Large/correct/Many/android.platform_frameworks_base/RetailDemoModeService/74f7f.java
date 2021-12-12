diff --git a/services/retaildemo/java/com/android/server/retaildemo/RetailDemoModeService.java b/services/retaildemo/java/com/android/server/retaildemo/RetailDemoModeService.java
index d858e82..2ecea0b 100644
--- a/services/retaildemo/java/com/android/server/retaildemo/RetailDemoModeService.java
+++ b/services/retaildemo/java/com/android/server/retaildemo/RetailDemoModeService.java
@@ -256,7 +256,7 @@
         synchronized (mActivityLock) {
             sessionDuration = (int) ((mLastUserActivityTime - mFirstUserActivityTime) / 1000);
         }
-        MetricsLogger.count(getContext(), DEMO_SESSION_DURATION, sessionDuration);
+        MetricsLogger.histogram(getContext(), DEMO_SESSION_DURATION, sessionDuration);
     }
 
     private ActivityManagerService getActivityManager() {
