diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index c71c131..e2ccaae 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -8160,7 +8160,7 @@
             final int size = delta.size();
             for (int i = 0; i < size; i++) {
                 final NetworkStats.Entry entry = delta.getValues(i, mTmpNetworkStatsEntry);
-                if (entry.rxPackets == 0 || entry.txPackets == 0) {
+                if (entry.rxPackets == 0 && entry.txPackets == 0) {
                     continue;
                 }
 
@@ -8211,13 +8211,13 @@
                     if (activityInfo != null) {
                         ControllerActivityCounterImpl activityCounter =
                                 u.getOrCreateModemControllerActivityLocked();
-                        if (entry.rxPackets != 0) {
+                        if (totalRxPackets > 0 && entry.rxPackets > 0) {
                             final long rxMs = (entry.rxPackets * activityInfo.getRxTimeMillis())
                                     / totalRxPackets;
                             activityCounter.getRxTimeCounter().addCountLocked(rxMs);
                         }
 
-                        if (entry.txPackets != 0) {
+                        if (totalTxPackets > 0 && entry.txPackets > 0) {
                             for (int lvl = 0; lvl < ModemActivityInfo.TX_POWER_LEVELS; lvl++) {
                                 long txMs = entry.txPackets * activityInfo.getTxTimeMillis()[lvl];
                                 txMs /= totalTxPackets;
