diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index 15fd742..dcc5328 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -4496,7 +4496,7 @@
                             mHandler.obtainMessage(MSG_DISPOSE_INPUT_CONSUMER, mInputConsumer));
                     mInputConsumer = null;
                 }
-            } else if (mInputConsumer == null) {
+            } else if (mInputConsumer == null && mStatusBar != null && canHideNavigationBar()) {
                 mInputConsumer = mWindowManagerFuncs.createInputConsumer(mHandler.getLooper(),
                         INPUT_CONSUMER_NAVIGATION,
                         (channel, looper) -> new HideNavInputEventReceiver(channel, looper));
