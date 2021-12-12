diff --git a/services/usage/java/com/android/server/usage/UsageStatsService.java b/services/usage/java/com/android/server/usage/UsageStatsService.java
index f078a35..2b0919b 100644
--- a/services/usage/java/com/android/server/usage/UsageStatsService.java
+++ b/services/usage/java/com/android/server/usage/UsageStatsService.java
@@ -215,11 +215,11 @@
             mPowerManager = getContext().getSystemService(PowerManager.class);
 
             mScreenOnSystemTimeSnapshot = System.currentTimeMillis();
-            synchronized (this) {
+            synchronized (mLock) {
                 mScreenOnTime = readScreenOnTimeLocked();
             }
             mDisplayManager.registerDisplayListener(mDisplayListener, mHandler);
-            synchronized (this) {
+            synchronized (mLock) {
                 updateDisplayLocked();
             }
         } else if (phase == PHASE_BOOT_COMPLETED) {
