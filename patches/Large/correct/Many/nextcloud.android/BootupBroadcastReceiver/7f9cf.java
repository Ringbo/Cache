diff --git a/src/com/owncloud/android/files/BootupBroadcastReceiver.java b/src/com/owncloud/android/files/BootupBroadcastReceiver.java
index 2cf4358..84436a0 100644
--- a/src/com/owncloud/android/files/BootupBroadcastReceiver.java
+++ b/src/com/owncloud/android/files/BootupBroadcastReceiver.java
@@ -48,7 +48,7 @@
     @Override
     public void onReceive(Context context, Intent intent) {
         if (!intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) {
-            Log_OC.wtf(TAG, "Incorrect action sent " + intent.getAction());
+            Log_OC.e(TAG, "Incorrect action sent " + intent.getAction());
             return;
         }
         Log_OC.d(TAG, "Starting file observer service...");
