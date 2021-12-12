diff --git a/core/java/android/widget/ViewFlipper.java b/core/java/android/widget/ViewFlipper.java
index 061bb00..b152297 100644
--- a/core/java/android/widget/ViewFlipper.java
+++ b/core/java/android/widget/ViewFlipper.java
@@ -90,7 +90,7 @@
         final IntentFilter filter = new IntentFilter();
         filter.addAction(Intent.ACTION_SCREEN_OFF);
         filter.addAction(Intent.ACTION_USER_PRESENT);
-        getContext().registerReceiver(mReceiver, filter);
+        getContext().registerReceiver(mReceiver, filter, null, mHandler);
 
         if (mAutoStart) {
             // Automatically start when requested
