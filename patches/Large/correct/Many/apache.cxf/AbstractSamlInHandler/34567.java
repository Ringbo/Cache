diff --git a/rt/rs/security/xml/src/main/java/org/apache/cxf/rs/security/saml/AbstractSamlInHandler.java b/rt/rs/security/xml/src/main/java/org/apache/cxf/rs/security/saml/AbstractSamlInHandler.java
index 6f29829..720376a 100644
--- a/rt/rs/security/xml/src/main/java/org/apache/cxf/rs/security/saml/AbstractSamlInHandler.java
+++ b/rt/rs/security/xml/src/main/java/org/apache/cxf/rs/security/saml/AbstractSamlInHandler.java
@@ -153,7 +153,7 @@
                 }
                 
                 assertion.verifySignature(samlKeyInfo);
-                assertion.parseHOKSubject(
+                assertion.parseSubject(
                     new WSSSAMLKeyInfoProcessor(data, null), data.getSigVerCrypto(), 
                     data.getCallbackHandler()
                 );
