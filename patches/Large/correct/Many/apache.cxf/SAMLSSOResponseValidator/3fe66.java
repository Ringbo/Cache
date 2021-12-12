diff --git a/rt/rs/security/xml/src/main/java/org/apache/cxf/rs/security/saml/sso/SAMLSSOResponseValidator.java b/rt/rs/security/xml/src/main/java/org/apache/cxf/rs/security/saml/sso/SAMLSSOResponseValidator.java
index f3370ce..483bf5b 100644
--- a/rt/rs/security/xml/src/main/java/org/apache/cxf/rs/security/saml/sso/SAMLSSOResponseValidator.java
+++ b/rt/rs/security/xml/src/main/java/org/apache/cxf/rs/security/saml/sso/SAMLSSOResponseValidator.java
@@ -165,10 +165,9 @@
             throw new WSSecurityException(WSSecurityException.FAILURE, "invalidSAMLsecurity");
         }
         
-        // TODO clock skew - future TTL required here.
         // We must have a NotOnOrAfter timestamp
         if (subjectConfData.getNotOnOrAfter() == null
-            || subjectConfData.getNotOnOrAfter().isAfterNow()) {
+            || subjectConfData.getNotOnOrAfter().isBeforeNow()) {
             LOG.fine("Subject Conf Data does not contain NotOnOrAfter or it has expired");
             throw new WSSecurityException(WSSecurityException.FAILURE, "invalidSAMLsecurity");
         }
