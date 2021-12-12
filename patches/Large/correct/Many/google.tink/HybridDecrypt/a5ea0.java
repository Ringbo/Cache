diff --git a/java/src/main/java/com/google/cloud/crypto/tink/HybridDecrypt.java b/java/src/main/java/com/google/cloud/crypto/tink/HybridDecrypt.java
index 6b80123..3ff84e4 100644
--- a/java/src/main/java/com/google/cloud/crypto/tink/HybridDecrypt.java
+++ b/java/src/main/java/com/google/cloud/crypto/tink/HybridDecrypt.java
@@ -54,8 +54,11 @@
    * Asynchronous decryption:
    * decrypts {@code ciphertext} verifying the integrity of {@code contextInfo}.
    *
-   * @return resulting plaintext.
+   * If the ciphertext is invalid or unauthenticated then {@code get()} method will return
+   * {@code ExecutionException} whose {@code getCause()} method returns {@code
+   * GeneralSecurityException}.
+   *
+   * @return a {@code Future} that holds the resulting plaintext.
    */
-  Future<byte[]> asyncDecrypt(final byte[] ciphertext, final byte[] contextInfo)
-      throws GeneralSecurityException;
+  Future<byte[]> asyncDecrypt(final byte[] ciphertext, final byte[] contextInfo);
 }
