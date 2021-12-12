diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 0c85329..47e06fc 100644
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -19028,7 +19028,7 @@
         if ((changes & ActivityInfo.CONFIG_LOCALE) != 0) {
             intent = new Intent(Intent.ACTION_LOCALE_CHANGED);
             intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND);
-            if (!mProcessesReady) {
+            if (initLocale || !mProcessesReady) {
                 intent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
             }
             broadcastIntentLocked(null, null, intent, null, null, 0, null, null, null,
