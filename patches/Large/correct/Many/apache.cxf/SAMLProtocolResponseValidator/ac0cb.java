diff --git a/rt/rs/security/sso/saml/src/main/java/org/apache/cxf/rs/security/saml/sso/SAMLProtocolResponseValidator.java b/rt/rs/security/sso/saml/src/main/java/org/apache/cxf/rs/security/saml/sso/SAMLProtocolResponseValidator.java
index 978db52..08b906e 100644
--- a/rt/rs/security/sso/saml/src/main/java/org/apache/cxf/rs/security/saml/sso/SAMLProtocolResponseValidator.java
+++ b/rt/rs/security/sso/saml/src/main/java/org/apache/cxf/rs/security/saml/sso/SAMLProtocolResponseValidator.java
@@ -388,7 +388,7 @@
                 
                 assertion.verifySignature(samlKeyInfo);
                 
-                assertion.parseHOKSubject(
+                assertion.parseSubject(
                     new WSSSAMLKeyInfoProcessor(requestData, new WSDocInfo(doc)),
                     requestData.getSigVerCrypto(), 
                     requestData.getCallbackHandler()
