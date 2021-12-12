diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index 81c2540..d917cdb 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -9446,7 +9446,7 @@
         return mDailyPackageChanges;
     }
 
-    long getBatteryUptimeLocked() {
+    protected long getBatteryUptimeLocked() {
         return mOnBatteryTimeBase.getUptime(mClocks.uptimeMillis() * 1000);
     }
 
