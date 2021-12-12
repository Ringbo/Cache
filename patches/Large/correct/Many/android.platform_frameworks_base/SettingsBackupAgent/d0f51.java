diff --git a/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java b/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
index dd89df1..2b181dc 100644
--- a/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
+++ b/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
@@ -858,7 +858,10 @@
                 out.writeInt(NETWORK_POLICIES_BACKUP_VERSION);
                 out.writeInt(policies.length);
                 for (NetworkPolicy policy : policies) {
-                    if (policy != null) {
+                    // We purposefully only backup policies that the user has
+                    // defined; any inferred policies might include
+                    // carrier-protected data that we can't export.
+                    if (policy != null && !policy.inferred) {
                         byte[] marshaledPolicy = policy.getBytesForBackup();
                         out.writeByte(BackupUtils.NOT_NULL);
                         out.writeInt(marshaledPolicy.length);
