diff --git a/saml-core/src/test/java/org/keycloak/saml/processing/core/parsers/saml/SAMLParserTest.java b/saml-core/src/test/java/org/keycloak/saml/processing/core/parsers/saml/SAMLParserTest.java
index 52dd7ba..713a5bd 100644
--- a/saml-core/src/test/java/org/keycloak/saml/processing/core/parsers/saml/SAMLParserTest.java
+++ b/saml-core/src/test/java/org/keycloak/saml/processing/core/parsers/saml/SAMLParserTest.java
@@ -103,9 +103,9 @@
             assertNotNull(rtChoiceType.getEncryptedAssertion());
 
             PrivateKey privateKey = DerUtils.decodePrivateKey(Base64.decode(PRIVATE_KEY));
-            ResponseType rtWithDecryptedAssertion = AssertionUtil.decryptAssertion(resp, privateKey);
+            AssertionUtil.decryptAssertion(resp, privateKey);
 
-            rtChoiceType = rtWithDecryptedAssertion.getAssertions().get(0);
+            rtChoiceType = resp.getAssertions().get(0);
             assertNotNull(rtChoiceType.getAssertion());
             assertNull(rtChoiceType.getEncryptedAssertion());
         }
