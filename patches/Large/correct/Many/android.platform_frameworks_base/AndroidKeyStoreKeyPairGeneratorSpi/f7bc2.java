diff --git a/keystore/java/android/security/keystore/AndroidKeyStoreKeyPairGeneratorSpi.java b/keystore/java/android/security/keystore/AndroidKeyStoreKeyPairGeneratorSpi.java
index 35af34f..c8ecbcd 100644
--- a/keystore/java/android/security/keystore/AndroidKeyStoreKeyPairGeneratorSpi.java
+++ b/keystore/java/android/security/keystore/AndroidKeyStoreKeyPairGeneratorSpi.java
@@ -215,14 +215,8 @@
                                     legacySpec.getKeystoreAlias(),
                                     KeyProperties.PURPOSE_SIGN
                                     | KeyProperties.PURPOSE_VERIFY);
-                            specBuilder.setDigests(
-                                    KeyProperties.DIGEST_NONE,
-                                    KeyProperties.DIGEST_MD5,
-                                    KeyProperties.DIGEST_SHA1,
-                                    KeyProperties.DIGEST_SHA224,
-                                    KeyProperties.DIGEST_SHA256,
-                                    KeyProperties.DIGEST_SHA384,
-                                    KeyProperties.DIGEST_SHA512);
+                            // Authorized to be used with any digest (including no digest).
+                            specBuilder.setDigests(KeyProperties.DIGEST_NONE);
                             break;
                         case KeymasterDefs.KM_ALGORITHM_RSA:
                             specBuilder = new KeyGenParameterSpec.Builder(
@@ -231,19 +225,13 @@
                                     | KeyProperties.PURPOSE_DECRYPT
                                     | KeyProperties.PURPOSE_SIGN
                                     | KeyProperties.PURPOSE_VERIFY);
-                            specBuilder.setDigests(
-                                    KeyProperties.DIGEST_NONE,
-                                    KeyProperties.DIGEST_MD5,
-                                    KeyProperties.DIGEST_SHA1,
-                                    KeyProperties.DIGEST_SHA224,
-                                    KeyProperties.DIGEST_SHA256,
-                                    KeyProperties.DIGEST_SHA384,
-                                    KeyProperties.DIGEST_SHA512);
+                            // Authorized to be used with any digest (including no digest).
+                            specBuilder.setDigests(KeyProperties.DIGEST_NONE);
                             specBuilder.setSignaturePaddings(
                                     KeyProperties.SIGNATURE_PADDING_RSA_PKCS1);
+                            // Authorized to be used with any padding (including no padding).
                             specBuilder.setEncryptionPaddings(
-                                    KeyProperties.ENCRYPTION_PADDING_NONE,
-                                    KeyProperties.ENCRYPTION_PADDING_RSA_PKCS1);
+                                    KeyProperties.ENCRYPTION_PADDING_NONE);
                             // Disable randomized encryption requirement to support encryption
                             // padding NONE above.
                             specBuilder.setRandomizedEncryptionRequired(false);
