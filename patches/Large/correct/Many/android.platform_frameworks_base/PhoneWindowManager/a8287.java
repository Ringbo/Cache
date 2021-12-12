diff --git a/services/core/java/com/android/server/policy/PhoneWindowManager.java b/services/core/java/com/android/server/policy/PhoneWindowManager.java
index d911761..bd67d55 100644
--- a/services/core/java/com/android/server/policy/PhoneWindowManager.java
+++ b/services/core/java/com/android/server/policy/PhoneWindowManager.java
@@ -6157,7 +6157,9 @@
                     sendSystemKeyToStatusBarAsync(event.getKeyCode());
 
                     TelecomManager telecomManager = getTelecommService();
-                    if (telecomManager != null) {
+                    if (telecomManager != null && !mHandleVolumeKeysInWM) {
+                        // When {@link #mHandleVolumeKeysInWM} is set, volume key events
+                        // should be dispatched to WM.
                         if (telecomManager.isRinging()) {
                             // If an incoming call is ringing, either VOLUME key means
                             // "silence ringer".  We handle these keys here, rather than
