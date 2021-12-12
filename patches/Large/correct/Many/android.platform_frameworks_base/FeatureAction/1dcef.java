diff --git a/services/core/java/com/android/server/hdmi/FeatureAction.java b/services/core/java/com/android/server/hdmi/FeatureAction.java
index f8e9b7b..0ba7773 100644
--- a/services/core/java/com/android/server/hdmi/FeatureAction.java
+++ b/services/core/java/com/android/server/hdmi/FeatureAction.java
@@ -133,7 +133,8 @@
 
         @Override
         public void sendTimerMessage(int state, long delayMillis) {
-            sendMessageDelayed(obtainMessage(MSG_TIMEOUT, state), delayMillis);
+            // The third argument(0) is not used.
+            sendMessageDelayed(obtainMessage(MSG_TIMEOUT, state, 0), delayMillis);
         }
 
         @Override
