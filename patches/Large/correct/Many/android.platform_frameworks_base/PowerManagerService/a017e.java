diff --git a/services/core/java/com/android/server/power/PowerManagerService.java b/services/core/java/com/android/server/power/PowerManagerService.java
index 4f239a5..61ed72d 100644
--- a/services/core/java/com/android/server/power/PowerManagerService.java
+++ b/services/core/java/com/android/server/power/PowerManagerService.java
@@ -991,7 +991,7 @@
                     }
                     intent = new Intent(PowerManager.ACTION_POWER_SAVE_MODE_CHANGED);
                     intent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
-                    mContext.sendBroadcast(intent);
+                    mContext.sendBroadcastAsUser(intent, UserHandle.ALL);
                     // Send internal version that requires signature permission.
                     intent = new Intent(PowerManager.ACTION_POWER_SAVE_MODE_CHANGED_INTERNAL);
                     intent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
