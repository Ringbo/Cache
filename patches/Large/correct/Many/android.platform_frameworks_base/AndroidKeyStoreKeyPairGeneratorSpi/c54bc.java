diff --git a/keystore/java/android/security/keystore/AndroidKeyStoreKeyPairGeneratorSpi.java b/keystore/java/android/security/keystore/AndroidKeyStoreKeyPairGeneratorSpi.java
index 2055cdb..f7ff07f 100644
--- a/keystore/java/android/security/keystore/AndroidKeyStoreKeyPairGeneratorSpi.java
+++ b/keystore/java/android/security/keystore/AndroidKeyStoreKeyPairGeneratorSpi.java
@@ -624,9 +624,8 @@
         // Constraints:
         // 1. Key must be authorized for signing without user authentication.
         // 2. Signature digest must be one of key's authorized digests.
-        // 3. For RSA keys, the digest output size must not exceed modulus size minus space needed
-        //    for RSA PKCS#1 signature padding (about 29 bytes: minimum 10 bytes of padding + 15--19
-        //    bytes overhead for encoding digest OID and digest value in DER).
+        // 3. For RSA keys, the digest output size must not exceed modulus size minus space overhead
+        //    of RSA PKCS#1 signature padding scheme (about 30 bytes).
         // 4. For EC keys, the there is no point in using a digest whose output size is longer than
         //    key/field size because the digest will be truncated to that size.
 
@@ -727,10 +726,12 @@
                         spec.getDigests(),
                         AndroidKeyStoreBCWorkaroundProvider.getSupportedEcdsaSignatureDigests());
 
-                // The amount of space available for the digest is less than modulus size because
-                // padding must be at least 10 bytes long, and then there's also the 15--19
-                // bytes overhead for encoding digest OID and digest value in DER.
-                int maxDigestOutputSizeBits = keySizeBits - 29 * 8;
+                // The amount of space available for the digest is less than modulus size by about
+                // 30 bytes because padding must be at least 11 bytes long (00 || 01 || PS || 00,
+                // where PS must be at least 8 bytes long), and then there's also the 15--19 bytes
+                // overhead (depending the on chosen digest) for encoding digest OID and digest
+                // value in DER.
+                int maxDigestOutputSizeBits = keySizeBits - 30 * 8;
                 int bestKeymasterDigest = -1;
                 int bestDigestOutputSizeBits = -1;
                 for (int keymasterDigest : availableKeymasterDigests) {
