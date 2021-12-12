diff --git a/rt/rs/security/oauth-parent/oauth2-jwt/src/main/java/org/apache/cxf/rs/security/oauth2/jws/JwsCompactConsumer.java b/rt/rs/security/oauth-parent/oauth2-jwt/src/main/java/org/apache/cxf/rs/security/oauth2/jws/JwsCompactConsumer.java
index eb80170..abec1a6 100644
--- a/rt/rs/security/oauth-parent/oauth2-jwt/src/main/java/org/apache/cxf/rs/security/oauth2/jws/JwsCompactConsumer.java
+++ b/rt/rs/security/oauth-parent/oauth2-jwt/src/main/java/org/apache/cxf/rs/security/oauth2/jws/JwsCompactConsumer.java
@@ -91,7 +91,7 @@
         }
         return token;
     }
-    public boolean verifySignatureWith(JwsSignatureValidator validator) {
+    public boolean verifySignatureWith(JwsSignatureVerifier validator) {
         if (!validator.verify(getJwtHeaders(), getUnsignedEncodedToken(), getDecodedSignature())) {
             throw new SecurityException();
         }
