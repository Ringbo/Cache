diff --git a/app/src/main/java/com/SecUpwN/AIMSICD/receiver/BootCompletedReceiver.java b/app/src/main/java/com/SecUpwN/AIMSICD/receiver/BootCompletedReceiver.java
index 580056a..0abce35 100644
--- a/app/src/main/java/com/SecUpwN/AIMSICD/receiver/BootCompletedReceiver.java
+++ b/app/src/main/java/com/SecUpwN/AIMSICD/receiver/BootCompletedReceiver.java
@@ -16,7 +16,7 @@
         SharedPreferences prefs = context.getSharedPreferences(
                 AimsicdService.SHARED_PREFERENCES_BASENAME, 0);
         final String AUTO_START = context.getString(R.string.pref_autostart_key);
-        boolean mAutoStart = prefs.getBoolean(AUTO_START, true);
+        boolean mAutoStart = prefs.getBoolean(AUTO_START, false);
         if (mAutoStart) {
             Log.i("AIMSICD", "System booted starting service.");
             context.startService(new Intent(context, AimsicdService.class));
