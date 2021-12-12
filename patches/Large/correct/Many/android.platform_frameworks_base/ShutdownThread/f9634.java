diff --git a/services/core/java/com/android/server/power/ShutdownThread.java b/services/core/java/com/android/server/power/ShutdownThread.java
index 1e0185d..84eab42 100644
--- a/services/core/java/com/android/server/power/ShutdownThread.java
+++ b/services/core/java/com/android/server/power/ShutdownThread.java
@@ -390,7 +390,7 @@
             }
         }
 
-        rebootOrShutdown(mReboot, mRebootReason);
+        rebootOrShutdown(mContext, mReboot, mRebootReason);
     }
 
     private void shutdownRadios(int timeout) {
@@ -507,17 +507,18 @@
      * Do not call this directly. Use {@link #reboot(Context, String, boolean)}
      * or {@link #shutdown(Context, boolean)} instead.
      *
+     * @param context Context used to vibrate or null without vibration
      * @param reboot true to reboot or false to shutdown
      * @param reason reason for reboot
      */
-    public static void rebootOrShutdown(boolean reboot, String reason) {
+    public static void rebootOrShutdown(final Context context, boolean reboot, String reason) {
         if (reboot) {
             Log.i(TAG, "Rebooting, reason: " + reason);
             PowerManagerService.lowLevelReboot(reason);
             Log.e(TAG, "Reboot failed, will attempt shutdown instead");
-        } else if (SHUTDOWN_VIBRATE_MS > 0) {
+        } else if (SHUTDOWN_VIBRATE_MS > 0 && context != null) {
             // vibrate before shutting down
-            Vibrator vibrator = new SystemVibrator();
+            Vibrator vibrator = new SystemVibrator(context);
             try {
                 vibrator.vibrate(SHUTDOWN_VIBRATE_MS, VIBRATION_ATTRIBUTES);
             } catch (Exception e) {
