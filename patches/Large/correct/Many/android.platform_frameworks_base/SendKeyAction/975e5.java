diff --git a/services/core/java/com/android/server/hdmi/SendKeyAction.java b/services/core/java/com/android/server/hdmi/SendKeyAction.java
index d17b31b..ca2826e 100644
--- a/services/core/java/com/android/server/hdmi/SendKeyAction.java
+++ b/services/core/java/com/android/server/hdmi/SendKeyAction.java
@@ -92,7 +92,7 @@
             if (keycode != mLastKeycode) {
                 sendKeyDown(keycode);
                 if (!HdmiCecKeycode.isRepeatableKey(keycode)) {
-                    sendKeyDown(keycode);
+                    sendKeyUp();
                     finish();
                     return;
                 }
