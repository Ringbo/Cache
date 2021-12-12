diff --git a/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/jwt/JAXRSJweJwsTest.java b/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/jwt/JAXRSJweJwsTest.java
index 61d67df..f5fb2c6 100644
--- a/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/jwt/JAXRSJweJwsTest.java
+++ b/systests/rs-security/src/test/java/org/apache/cxf/systest/jaxrs/security/jwt/JAXRSJweJwsTest.java
@@ -421,10 +421,10 @@
     
     private static class PrivateKeyPasswordProviderImpl implements PrivateKeyPasswordProvider {
         private String password = "password";
-        public PrivateKeyPasswordProviderImpl() {
+        PrivateKeyPasswordProviderImpl() {
             
         }
-        public PrivateKeyPasswordProviderImpl(String password) {
+        PrivateKeyPasswordProviderImpl(String password) {
             this.password = password;
         }
         @Override
