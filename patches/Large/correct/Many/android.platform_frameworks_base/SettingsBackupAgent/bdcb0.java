diff --git a/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java b/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
index 78af785..d1b4812 100644
--- a/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
+++ b/packages/SettingsProvider/src/com/android/providers/settings/SettingsBackupAgent.java
@@ -580,7 +580,7 @@
     private void writeNewChecksums(long[] checksums, ParcelFileDescriptor newState)
             throws IOException {
         DataOutputStream dataOutput = new DataOutputStream(
-                new FileOutputStream(newState.getFileDescriptor()));
+                new BufferedOutputStream(new FileOutputStream(newState.getFileDescriptor())));
 
         dataOutput.writeInt(STATE_VERSION);
         for (int i = 0; i < STATE_SIZE; i++) {
