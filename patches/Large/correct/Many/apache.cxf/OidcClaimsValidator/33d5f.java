diff --git a/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/OidcClaimsValidator.java b/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/OidcClaimsValidator.java
index 52dd672..222d421 100644
--- a/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/OidcClaimsValidator.java
+++ b/rt/rs/security/sso/oidc/src/main/java/org/apache/cxf/rs/security/oidc/rp/OidcClaimsValidator.java
@@ -153,7 +153,7 @@
         }
         JwsSignatureVerifier theJwsVerifier = null;
         if (key != null) {
-            theJwsVerifier = JwsUtils.getSignatureVerifier(key);
+            theJwsVerifier = JwsUtils.getSignatureVerifier(key, jwt.getJwsHeaders().getSignatureAlgorithm());
         } else {
             theJwsVerifier = super.getInitializedSignatureVerifier(jwt.getJwsHeaders());
         }
