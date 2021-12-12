diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index d939345..d3ec7e7 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -1328,7 +1328,7 @@
                 Message msg = mHandler.obtainMessage(MSG_POWER_DELAYED_PRESS,
                         interactive ? 1 : 0, mPowerKeyPressCounter, eventTime);
                 msg.setAsynchronous(true);
-                mHandler.sendMessageDelayed(msg, ViewConfiguration.getDoubleTapTimeout());
+                mHandler.sendMessageDelayed(msg, ViewConfiguration.getMultiPressTimeout());
                 return;
             }
 
