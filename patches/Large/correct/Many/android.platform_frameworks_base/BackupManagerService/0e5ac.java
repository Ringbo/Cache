diff --git a/services/backup/java/com/android/server/backup/BackupManagerService.java b/services/backup/java/com/android/server/backup/BackupManagerService.java
index 5ce8c9e..556f55f 100644
--- a/services/backup/java/com/android/server/backup/BackupManagerService.java
+++ b/services/backup/java/com/android/server/backup/BackupManagerService.java
@@ -5501,11 +5501,11 @@
 
                         // If the policy is satisfied, go ahead and set up to pipe the
                         // data to the agent.
-                        if (DEBUG && okay && mAgent != null) {
+                        if (MORE_DEBUG && okay && mAgent != null) {
                             Slog.i(TAG, "Reusing existing agent instance");
                         }
                         if (okay && mAgent == null) {
-                            if (DEBUG) Slog.d(TAG, "Need to launch agent for " + pkg);
+                            if (MORE_DEBUG) Slog.d(TAG, "Need to launch agent for " + pkg);
 
                             try {
                                 mTargetApp = mPackageManager.getApplicationInfo(pkg, 0);
