diff --git a/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/saml/LogoutTest.java b/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/saml/LogoutTest.java
index 24967ae..19881c5 100644
--- a/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/saml/LogoutTest.java
+++ b/testsuite/integration-arquillian/tests/base/src/test/java/org/keycloak/testsuite/saml/LogoutTest.java
@@ -369,7 +369,7 @@
         try (
           Closeable sales = new ClientAttributeUpdater(clients.get(salesRep.getId()))
           .setFrontchannelLogout(true)
-          .setAttribute(SamlProtocol.SAML_SINGLE_LOGOUT_SERVICE_URL_POST_ATTRIBUTE, "")
+          .removeAttribute(SamlProtocol.SAML_SINGLE_LOGOUT_SERVICE_URL_POST_ATTRIBUTE)
           .setAttribute(SamlProtocol.SAML_SINGLE_LOGOUT_SERVICE_URL_REDIRECT_ATTRIBUTE, "http://url")
           .update();
 
