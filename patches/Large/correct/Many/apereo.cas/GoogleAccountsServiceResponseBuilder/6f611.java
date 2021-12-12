diff --git a/cas-server-support-saml-googleapps/src/main/java/org/jasig/cas/support/saml/authentication/principal/GoogleAccountsServiceResponseBuilder.java b/cas-server-support-saml-googleapps/src/main/java/org/jasig/cas/support/saml/authentication/principal/GoogleAccountsServiceResponseBuilder.java
index 0f17943..7db9040 100644
--- a/cas-server-support-saml-googleapps/src/main/java/org/jasig/cas/support/saml/authentication/principal/GoogleAccountsServiceResponseBuilder.java
+++ b/cas-server-support-saml-googleapps/src/main/java/org/jasig/cas/support/saml/authentication/principal/GoogleAccountsServiceResponseBuilder.java
@@ -104,11 +104,11 @@
             notBeforeIssueInstant, samlObjectBuilder.generateSecureRandomId());
 
         final Conditions conditions = samlObjectBuilder.newConditions(notBeforeIssueInstant,
-                currentDateTime.minusSeconds(this.skewAllowance), service.getId());
+                currentDateTime.plusSeconds(this.skewAllowance), service.getId());
         assertion.setConditions(conditions);
 
         final Subject subject = samlObjectBuilder.newSubject(NameID.EMAIL, userId,
-            service.getId(), currentDateTime, service.getRequestId());
+            service.getId(), currentDateTime.plusSeconds(this.skewAllowance), service.getRequestId());
         assertion.setSubject(subject);
 
         response.getAssertions().add(assertion);
