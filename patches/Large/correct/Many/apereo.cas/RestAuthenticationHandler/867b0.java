diff --git a/support/cas-server-support-rest-authentication/src/main/java/org/apereo/cas/adaptors/rest/RestAuthenticationHandler.java b/support/cas-server-support-rest-authentication/src/main/java/org/apereo/cas/adaptors/rest/RestAuthenticationHandler.java
index 04edd8e..b35c19e 100644
--- a/support/cas-server-support-rest-authentication/src/main/java/org/apereo/cas/adaptors/rest/RestAuthenticationHandler.java
+++ b/support/cas-server-support-rest-authentication/src/main/java/org/apereo/cas/adaptors/rest/RestAuthenticationHandler.java
@@ -44,7 +44,7 @@
                 if (principalFromRest == null || StringUtils.isBlank(principalFromRest.getId())) {
                     throw new FailedLoginException("Could not determine authentication response from rest endpoint for " + c.getUsername());
                 }
-                return createHandlerResult(c, this.principalFactory.createPrincipal(principalFromRest.getId()), new ArrayList<>());
+                return createHandlerResult(c, this.principalFactory.createPrincipal(principalFromRest.getId(), principalFromRest.getAttributes()), new ArrayList<>());
             }
         } catch (final HttpClientErrorException e) {
             if (e.getStatusCode() == HttpStatus.FORBIDDEN) {
