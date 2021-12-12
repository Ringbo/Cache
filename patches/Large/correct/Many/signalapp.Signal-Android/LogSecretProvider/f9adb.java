diff --git a/src/org/thoughtcrime/securesms/logging/LogSecretProvider.java b/src/org/thoughtcrime/securesms/logging/LogSecretProvider.java
index 8566a0e..e180a08 100644
--- a/src/org/thoughtcrime/securesms/logging/LogSecretProvider.java
+++ b/src/org/thoughtcrime/securesms/logging/LogSecretProvider.java
@@ -31,7 +31,7 @@
   }
 
   private static byte[] parseEncryptedSecret(String secret) {
-    if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
+    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
       KeyStoreHelper.SealedData encryptedSecret = KeyStoreHelper.SealedData.fromString(secret);
       return KeyStoreHelper.unseal(encryptedSecret);
     } else {
