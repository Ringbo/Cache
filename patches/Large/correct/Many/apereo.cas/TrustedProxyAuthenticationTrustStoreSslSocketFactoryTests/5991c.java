diff --git a/core/cas-server-core-authentication/src/test/java/org/apereo/cas/util/TrustedProxyAuthenticationTrustStoreSslSocketFactoryTests.java b/core/cas-server-core-authentication/src/test/java/org/apereo/cas/util/TrustedProxyAuthenticationTrustStoreSslSocketFactoryTests.java
index b8621c1..df71fe7 100644
--- a/core/cas-server-core-authentication/src/test/java/org/apereo/cas/util/TrustedProxyAuthenticationTrustStoreSslSocketFactoryTests.java
+++ b/core/cas-server-core-authentication/src/test/java/org/apereo/cas/util/TrustedProxyAuthenticationTrustStoreSslSocketFactoryTests.java
@@ -30,7 +30,7 @@
         this.client = clientFactory.getObject();
     }
 
-    @Ignore
+    @Test
     public void verifySuccessfulConnection() {
         final boolean valid = client.isValidEndPoint("https://www.github.com");
         assertTrue(valid);
@@ -38,7 +38,7 @@
 
     @Test
     public void verifySuccessfulConnectionWithCustomSSLCert() {
-        final boolean valid = client.isValidEndPoint("https://www.cacert.org");
+        final boolean valid = client.isValidEndPoint("https://self-signed.badssl.com");
         assertTrue(valid);
     }
 
