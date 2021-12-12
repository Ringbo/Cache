diff --git a/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/oauth2/OAuthDataProviderImpl.java b/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/oauth2/OAuthDataProviderImpl.java
index 8652dd7..23b681d 100644
--- a/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/oauth2/OAuthDataProviderImpl.java
+++ b/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/oauth2/OAuthDataProviderImpl.java
@@ -63,7 +63,7 @@
 
     private Certificate loadCert() throws Exception {
         InputStream is = this.getClass().getResourceAsStream("/org/apache/cxf/systest/http/resources/Truststore.jks");
-        return CryptoUtils.loadCertificate(is, new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'}, "morpit");
+        return CryptoUtils.loadCertificate(is, new char[]{'p', 'a', 's', 's', 'w', 'o', 'r', 'd'}, "morpit", null);
     }
 
     
