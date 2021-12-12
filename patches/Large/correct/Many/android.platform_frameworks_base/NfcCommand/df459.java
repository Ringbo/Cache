diff --git a/cmds/svc/src/com/android/commands/svc/NfcCommand.java b/cmds/svc/src/com/android/commands/svc/NfcCommand.java
index 8e9791f..02a92b9 100644
--- a/cmds/svc/src/com/android/commands/svc/NfcCommand.java
+++ b/cmds/svc/src/com/android/commands/svc/NfcCommand.java
@@ -58,7 +58,8 @@
                 IPackageManager pm = IPackageManager.Stub.asInterface(
                         ServiceManager.getService("package"));
                 try {
-                    if (pm.hasSystemFeature(PackageManager.FEATURE_NFC, 0)) {
+                    if (pm.hasSystemFeature(PackageManager.FEATURE_NFC, 0) ||
+			pm.hasSystemFeature(PackageManager.FEATURE_NFC_HOST_CARD_EMULATION, 0)) {
                         INfcAdapter nfc = INfcAdapter.Stub
                                 .asInterface(ServiceManager.getService(Context.NFC_SERVICE));
                         try {
