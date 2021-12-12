diff --git a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/crypto/CryptoUtils.java b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/crypto/CryptoUtils.java
index 99e46d8..76b62aa 100644
--- a/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/crypto/CryptoUtils.java
+++ b/rt/rs/security/oauth-parent/oauth2/src/main/java/org/apache/cxf/rs/security/oauth2/utils/crypto/CryptoUtils.java
@@ -533,7 +533,7 @@
                 }
                 boolean updateRequired = keyProps != null && keyProps.getAdditionalData() != null;
                 int offset = 0;
-                for (; offset + blockSize <= bytes.length; offset += blockSize) {
+                for (; offset + blockSize < bytes.length; offset += blockSize) {
                     byte[] next = !updateRequired ? c.doFinal(bytes, offset, blockSize) 
                         : c.update(bytes, offset, blockSize);
                     result = addToResult(result, next);
