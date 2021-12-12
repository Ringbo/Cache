diff --git a/services/src/main/java/org/keycloak/services/resources/IdentityBrokerService.java b/services/src/main/java/org/keycloak/services/resources/IdentityBrokerService.java
index a94b8ea..0f3d307 100755
--- a/services/src/main/java/org/keycloak/services/resources/IdentityBrokerService.java
+++ b/services/src/main/java/org/keycloak/services/resources/IdentityBrokerService.java
@@ -1058,7 +1058,7 @@
     }
 
     private Response redirectToErrorPage(AuthenticationSessionModel authSession,String message, Object ... parameters) {
-        return redirectToErrorPage(authSession, message, null, parameters);
+        return redirectToErrorPage(authSession, Response.Status.INTERNAL_SERVER_ERROR, message, null, parameters);
     }
     
     private Response redirectToErrorPage(Response.Status status, String message, Object ... parameters) {
