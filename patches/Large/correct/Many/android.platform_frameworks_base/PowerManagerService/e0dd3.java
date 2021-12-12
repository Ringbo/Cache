diff --git a/services/core/java/com/android/server/power/PowerManagerService.java b/services/core/java/com/android/server/power/PowerManagerService.java
index 16b09bc..9ffcc8c 100644
--- a/services/core/java/com/android/server/power/PowerManagerService.java
+++ b/services/core/java/com/android/server/power/PowerManagerService.java
@@ -1553,7 +1553,7 @@
             return false;
         }
         if (!isBeingKeptAwakeLocked()) {
-            if (!mIsPowered && !mDreamsEnabledByDefaultConfig) {
+            if (!mIsPowered && !mDreamsEnabledOnBatteryConfig) {
                 return false;
             }
             if (!mIsPowered
