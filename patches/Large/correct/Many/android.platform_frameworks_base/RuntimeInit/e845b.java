diff --git a/core/java/com/android/internal/os/RuntimeInit.java b/core/java/com/android/internal/os/RuntimeInit.java
index 66475e4..895be08 100644
--- a/core/java/com/android/internal/os/RuntimeInit.java
+++ b/core/java/com/android/internal/os/RuntimeInit.java
@@ -71,10 +71,11 @@
         public void uncaughtException(Thread t, Throwable e) {
             // Don't re-enter if KillApplicationHandler has already run
             if (mCrashing) return;
-            if (mApplicationObject == null) {
-                // The "FATAL EXCEPTION" string is still used on Android even though
-                // apps can set a custom UncaughtExceptionHandler that renders uncaught
-                // exceptions non-fatal.
+
+            // mApplicationObject is null for non-zygote java programs (e.g. "am")
+            // There are also apps running with the system UID. We don't want the
+            // first clause in either of these two cases, only for system_server.
+            if (mApplicationObject == null && (Process.SYSTEM_UID == Process.myUid())) {
                 Clog_e(TAG, "*** FATAL EXCEPTION IN SYSTEM PROCESS: " + t.getName(), e);
             } else {
                 StringBuilder message = new StringBuilder();
