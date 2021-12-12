diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index 8ee31f7..fdb9756 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -11597,7 +11597,7 @@
      * time at the highest power level.
      * @param activityInfo
      */
-    private void addModemTxPowerToHistory(final ModemActivityInfo activityInfo) {
+    private synchronized void addModemTxPowerToHistory(final ModemActivityInfo activityInfo) {
         if (activityInfo == null) {
             return;
         }
