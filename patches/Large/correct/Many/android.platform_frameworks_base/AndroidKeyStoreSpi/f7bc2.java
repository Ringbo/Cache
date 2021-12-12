diff --git a/keystore/java/android/security/keystore/AndroidKeyStoreSpi.java b/keystore/java/android/security/keystore/AndroidKeyStoreSpi.java
index 831a106..3bd9d1d 100644
--- a/keystore/java/android/security/keystore/AndroidKeyStoreSpi.java
+++ b/keystore/java/android/security/keystore/AndroidKeyStoreSpi.java
@@ -247,14 +247,8 @@
             specBuilder =
                     new KeyProtection.Builder(
                             KeyProperties.PURPOSE_SIGN | KeyProperties.PURPOSE_VERIFY);
-            specBuilder.setDigests(
-                    KeyProperties.DIGEST_NONE,
-                    KeyProperties.DIGEST_MD5,
-                    KeyProperties.DIGEST_SHA1,
-                    KeyProperties.DIGEST_SHA224,
-                    KeyProperties.DIGEST_SHA256,
-                    KeyProperties.DIGEST_SHA384,
-                    KeyProperties.DIGEST_SHA512);
+            // Authorized to be used with any digest (including no digest).
+            specBuilder.setDigests(KeyProperties.DIGEST_NONE);
         } else if (KeyProperties.KEY_ALGORITHM_RSA.equalsIgnoreCase(keyAlgorithm)) {
             specBuilder =
                     new KeyProtection.Builder(
@@ -262,19 +256,13 @@
                             | KeyProperties.PURPOSE_DECRYPT
                             | KeyProperties.PURPOSE_SIGN
                             | KeyProperties.PURPOSE_VERIFY);
-            specBuilder.setDigests(
-                    KeyProperties.DIGEST_NONE,
-                    KeyProperties.DIGEST_MD5,
-                    KeyProperties.DIGEST_SHA1,
-                    KeyProperties.DIGEST_SHA224,
-                    KeyProperties.DIGEST_SHA256,
-                    KeyProperties.DIGEST_SHA384,
-                    KeyProperties.DIGEST_SHA512);
+            // Authorized to be used with any digest (including no digest).
+            specBuilder.setDigests(KeyProperties.DIGEST_NONE);
             specBuilder.setSignaturePaddings(
                     KeyProperties.SIGNATURE_PADDING_RSA_PKCS1);
+            // Authorized to be used with any padding (including no padding).
             specBuilder.setEncryptionPaddings(
-                    KeyProperties.ENCRYPTION_PADDING_NONE,
-                    KeyProperties.ENCRYPTION_PADDING_RSA_PKCS1);
+                    KeyProperties.ENCRYPTION_PADDING_NONE);
             // Disable randomized encryption requirement to support encryption padding NONE
             // above.
             specBuilder.setRandomizedEncryptionRequired(false);
