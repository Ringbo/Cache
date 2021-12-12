diff --git a/services/core/java/com/android/server/EntropyMixer.java b/services/core/java/com/android/server/EntropyMixer.java
index 24d8d1e..9877717 100644
--- a/services/core/java/com/android/server/EntropyMixer.java
+++ b/services/core/java/com/android/server/EntropyMixer.java
@@ -70,7 +70,10 @@
     /**
      * Handler that periodically updates the entropy on disk.
      */
-    private final Handler mHandler = new Handler() {
+    private final Handler mHandler = new Handler(IoThread.getHandler().getLooper()) {
+        // IMPLEMENTATION NOTE: This handler runs on the I/O thread to avoid I/O on the main thread.
+        // The reason we're using our own Handler instead of IoThread.getHandler() is to create our
+        // own ID space for the "what" parameter of messages seen by the handler.
         @Override
         public void handleMessage(Message msg) {
             if (msg.what != ENTROPY_WHAT) {
@@ -115,7 +118,12 @@
         IntentFilter broadcastFilter = new IntentFilter(Intent.ACTION_SHUTDOWN);
         broadcastFilter.addAction(Intent.ACTION_POWER_CONNECTED);
         broadcastFilter.addAction(Intent.ACTION_REBOOT);
-        context.registerReceiver(mBroadcastReceiver, broadcastFilter);
+        context.registerReceiver(
+                mBroadcastReceiver,
+                broadcastFilter,
+                null, // do not require broadcaster to hold any permissions
+                mHandler // process received broadcasts on the I/O thread instead of the main thread
+                );
     }
 
     private void scheduleEntropyWriter() {
