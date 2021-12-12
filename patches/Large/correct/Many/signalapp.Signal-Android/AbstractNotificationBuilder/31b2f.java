diff --git a/src/org/thoughtcrime/securesms/notifications/AbstractNotificationBuilder.java b/src/org/thoughtcrime/securesms/notifications/AbstractNotificationBuilder.java
index 1ad3f7d..28f2550 100644
--- a/src/org/thoughtcrime/securesms/notifications/AbstractNotificationBuilder.java
+++ b/src/org/thoughtcrime/securesms/notifications/AbstractNotificationBuilder.java
@@ -46,7 +46,7 @@
     String[] blinkPatternArray   = parseBlinkPattern(ledBlinkPattern, ledBlinkPatternCustom);
 
     if      (ringtone != null)                       setSound(ringtone);
-    else if (TextUtils.isEmpty(defaultRingtoneName)) setSound(Uri.parse(defaultRingtoneName));
+    else if (!TextUtils.isEmpty(defaultRingtoneName)) setSound(Uri.parse(defaultRingtoneName));
 
     if (vibrate == RecipientPreferenceDatabase.VibrateState.ENABLED ||
         (vibrate == RecipientPreferenceDatabase.VibrateState.DEFAULT && defaultVibrate))
