diff --git a/rt/rs/security/sso/saml/src/main/java/org/apache/cxf/rs/security/saml/sso/SamlRedirectBindingFilter.java b/rt/rs/security/sso/saml/src/main/java/org/apache/cxf/rs/security/saml/sso/SamlRedirectBindingFilter.java
index 0ecc9f8..6826145 100644
--- a/rt/rs/security/sso/saml/src/main/java/org/apache/cxf/rs/security/saml/sso/SamlRedirectBindingFilter.java
+++ b/rt/rs/security/sso/saml/src/main/java/org/apache/cxf/rs/security/saml/sso/SamlRedirectBindingFilter.java
@@ -159,7 +159,7 @@
         signature.update(requestToSign.getBytes(StandardCharsets.UTF_8));
         byte[] signBytes = signature.sign();
 
-        String encodedSignature = Base64.getMimeEncoder().encodeToString(signBytes);
+        String encodedSignature = Base64.getEncoder().encodeToString(signBytes);
 
         ub.queryParam(SSOConstants.SIGNATURE, URLEncoder.encode(encodedSignature, StandardCharsets.UTF_8.name()));
 
