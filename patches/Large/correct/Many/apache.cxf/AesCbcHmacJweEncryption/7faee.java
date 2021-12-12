diff --git a/rt/rs/security/jose/src/main/java/org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption.java b/rt/rs/security/jose/src/main/java/org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption.java
index 80a8630..8f1e4bc 100644
--- a/rt/rs/security/jose/src/main/java/org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption.java
+++ b/rt/rs/security/jose/src/main/java/org/apache/cxf/rs/security/jose/jwe/AesCbcHmacJweEncryption.java
@@ -147,7 +147,7 @@
     }
     
     private static class AesCbcContentEncryptionAlgorithm extends AbstractContentEncryptionAlgorithm {
-        public AesCbcContentEncryptionAlgorithm(byte[] cek, byte[] iv, ContentAlgorithm algo) { 
+        AesCbcContentEncryptionAlgorithm(byte[] cek, byte[] iv, ContentAlgorithm algo) { 
             super(cek, iv, algo);    
         }
         @Override
