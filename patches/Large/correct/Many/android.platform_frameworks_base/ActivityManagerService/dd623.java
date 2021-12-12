diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 7ca3860..b623bc7 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -19040,7 +19040,7 @@
                 if ((changes&ActivityInfo.CONFIG_LOCALE) != 0) {
                     intent = new Intent(Intent.ACTION_LOCALE_CHANGED);
                     intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
-                    if (!mProcessesReady) {
+	            if (initLocale || !mProcessesReady) {
                         intent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
                     }
                     broadcastIntentLocked(null, null, intent,
