diff --git a/java/src/main/java/com/google/cloud/crypto/tink/HybridEncrypt.java b/java/src/main/java/com/google/cloud/crypto/tink/HybridEncrypt.java
index 809ce3e..6a07684 100644
--- a/java/src/main/java/com/google/cloud/crypto/tink/HybridEncrypt.java
+++ b/java/src/main/java/com/google/cloud/crypto/tink/HybridEncrypt.java
@@ -54,8 +54,7 @@
    * Asynchronous encryption:
    * encrypts {@code plaintext} binding {@code contextInfo} to the resulting ciphertext.
    *
-   * @return resulting ciphertext.
+   * @return a {@code Future} that holds the resulting ciphertext.
    */
-  Future<byte[]> asyncEncrypt(final byte[] plaintext, final byte[] contextInfo)
-      throws GeneralSecurityException;
+  Future<byte[]> asyncEncrypt(final byte[] plaintext, final byte[] contextInfo);
 }
