diff --git a/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/AbstractTokenValidator.java b/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/AbstractTokenValidator.java
index 1553258..89e7fa4 100644
--- a/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/AbstractTokenValidator.java
+++ b/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/AbstractTokenValidator.java
@@ -115,7 +115,7 @@
         return validateToken(jwtConsumer, jwt, JwsUtils.getSignatureVerifier(key));
     }
     protected JwtToken validateToken(JwsJwtCompactConsumer consumer, JwtToken jwt, JwsSignatureVerifier jws) {
-        if (consumer.verifySignatureWith(jws)) {
+        if (!consumer.verifySignatureWith(jws)) {
             throw new SecurityException("Invalid Signature");
         }
         return jwt;
