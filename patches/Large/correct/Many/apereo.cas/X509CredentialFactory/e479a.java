diff --git a/support/cas-server-support-rest-x509/src/main/java/org/apereo/cas/support/x509/rest/X509CredentialFactory.java b/support/cas-server-support-rest-x509/src/main/java/org/apereo/cas/support/x509/rest/X509CredentialFactory.java
index c66349c..51bb931 100644
--- a/support/cas-server-support-rest-x509/src/main/java/org/apereo/cas/support/x509/rest/X509CredentialFactory.java
+++ b/support/cas-server-support-rest-x509/src/main/java/org/apereo/cas/support/x509/rest/X509CredentialFactory.java
@@ -32,7 +32,7 @@
     public Credential fromRequestBody(final MultiValueMap<String, String> requestBody) {
         final String cert = requestBody.getFirst(CERTIFICATE);
         LOGGER.debug("Certificate in the request body: [{}]", cert);
-        if (StringUtils.isNotBlank(cert)) {
+        if (StringUtils.isBlank(cert)) {
             return super.fromRequestBody(requestBody);
         }
         final InputStream is = new ByteArrayInputStream(cert.getBytes());
