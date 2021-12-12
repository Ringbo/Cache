diff --git a/java/src/main/java/com/google/cloud/crypto/tink/subtle/HybridEncryptBase.java b/java/src/main/java/com/google/cloud/crypto/tink/subtle/HybridEncryptBase.java
index 6a38a75..7d69810 100644
--- a/java/src/main/java/com/google/cloud/crypto/tink/subtle/HybridEncryptBase.java
+++ b/java/src/main/java/com/google/cloud/crypto/tink/subtle/HybridEncryptBase.java
@@ -31,8 +31,7 @@
       throws GeneralSecurityException;
 
   @Override
-  public Future<byte[]> asyncEncrypt(final byte[] plaintext, final byte[] contextInfo)
-      throws GeneralSecurityException {
+  public Future<byte[]> asyncEncrypt(final byte[] plaintext, final byte[] contextInfo) {
     return Executors.newSingleThreadExecutor().submit(() -> encrypt(plaintext, contextInfo));
   }
 }
