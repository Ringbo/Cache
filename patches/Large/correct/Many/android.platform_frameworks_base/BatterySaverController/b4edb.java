diff --git a/services/core/java/com/android/server/power/batterysaver/BatterySaverController.java b/services/core/java/com/android/server/power/batterysaver/BatterySaverController.java
index 32f38b7..a9a1456 100644
--- a/services/core/java/com/android/server/power/batterysaver/BatterySaverController.java
+++ b/services/core/java/com/android/server/power/batterysaver/BatterySaverController.java
@@ -347,7 +347,7 @@
             Intent intent = new Intent(PowerManager.ACTION_POWER_SAVE_MODE_CHANGING)
                     .putExtra(PowerManager.EXTRA_POWER_SAVE_MODE, enabled)
                     .addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
-            mContext.sendBroadcast(intent);
+            mContext.sendBroadcastAsUser(intent, UserHandle.ALL);
 
             intent = new Intent(PowerManager.ACTION_POWER_SAVE_MODE_CHANGED);
             intent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
