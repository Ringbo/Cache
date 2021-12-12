diff --git a/services/core/java/com/android/server/BatteryService.java b/services/core/java/com/android/server/BatteryService.java
index 87647ca..155dcee 100644
--- a/services/core/java/com/android/server/BatteryService.java
+++ b/services/core/java/com/android/server/BatteryService.java
@@ -625,7 +625,7 @@
             // them will get the new sequence number at that point.  (See for example how testing
             // of JobScheduler's BatteryController works.)
             sendBatteryChangedIntentLocked();
-            if (mLastBatteryLevel != mHealthInfo.batteryLevel) {
+            if (mLastBatteryLevel != mHealthInfo.batteryLevel || mLastPlugType != mPlugType) {
                 sendBatteryLevelChangedIntentLocked();
             }
 
