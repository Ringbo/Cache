diff --git a/java/src/main/java/com/google/cloud/crypto/tink/subtle/HybridDecryptBase.java b/java/src/main/java/com/google/cloud/crypto/tink/subtle/HybridDecryptBase.java
index 54882fd..87b0f0c 100644
--- a/java/src/main/java/com/google/cloud/crypto/tink/subtle/HybridDecryptBase.java
+++ b/java/src/main/java/com/google/cloud/crypto/tink/subtle/HybridDecryptBase.java
@@ -31,8 +31,7 @@
       throws GeneralSecurityException;
 
   @Override
-  public Future<byte[]> asyncDecrypt(final byte[] ciphertext, final byte[] contextInfo)
-      throws GeneralSecurityException {
+  public Future<byte[]> asyncDecrypt(final byte[] ciphertext, final byte[] contextInfo) {
     return Executors.newSingleThreadExecutor().submit(() -> decrypt(ciphertext, contextInfo));
   }
 }
