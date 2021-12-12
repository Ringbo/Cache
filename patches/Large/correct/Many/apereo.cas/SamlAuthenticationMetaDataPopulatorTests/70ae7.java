diff --git a/support/cas-server-support-saml/src/test/java/org/apereo/cas/support/saml/authentication/SamlAuthenticationMetaDataPopulatorTests.java b/support/cas-server-support-saml/src/test/java/org/apereo/cas/support/saml/authentication/SamlAuthenticationMetaDataPopulatorTests.java
index ad7cab5..7f71fdb 100644
--- a/support/cas-server-support-saml/src/test/java/org/apereo/cas/support/saml/authentication/SamlAuthenticationMetaDataPopulatorTests.java
+++ b/support/cas-server-support-saml/src/test/java/org/apereo/cas/support/saml/authentication/SamlAuthenticationMetaDataPopulatorTests.java
@@ -41,13 +41,12 @@
     }
 
     @Test
-    public void verifyAuthenticationTypeNotFound() {
+    public void verifyAuthenticationTypeFoundByDefault() {
         final CustomCredential credentials = new CustomCredential();
         final AuthenticationBuilder builder = CoreAuthenticationTestUtils.getAuthenticationBuilder();
         this.populator.populateAttributes(builder, DefaultAuthenticationTransaction.of(credentials));
         final Authentication auth = builder.build();
-
-        assertNull(auth.getAttributes().get(SamlAuthenticationMetaDataPopulator.ATTRIBUTE_AUTHENTICATION_METHOD));
+        assertNotNull(auth.getAttributes().get(SamlAuthenticationMetaDataPopulator.ATTRIBUTE_AUTHENTICATION_METHOD));
     }
 
     @Test
