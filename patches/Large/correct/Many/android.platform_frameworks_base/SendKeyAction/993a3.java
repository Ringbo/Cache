diff --git a/services/core/java/com/android/server/hdmi/SendKeyAction.java b/services/core/java/com/android/server/hdmi/SendKeyAction.java
index 814e43e..b91bbe3 100644
--- a/services/core/java/com/android/server/hdmi/SendKeyAction.java
+++ b/services/core/java/com/android/server/hdmi/SendKeyAction.java
@@ -91,7 +91,7 @@
         if (isPressed) {
             if (keycode != mLastKeycode) {
                 if (!HdmiCecKeycode.isRepeatableKey(keycode)) {
-                    sendKeyUp();
+                    sendKeyDown(keycode);
                     finish();
                     return;
                 }
