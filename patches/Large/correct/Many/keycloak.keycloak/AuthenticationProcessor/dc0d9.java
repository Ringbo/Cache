diff --git a/services/src/main/java/org/keycloak/authentication/AuthenticationProcessor.java b/services/src/main/java/org/keycloak/authentication/AuthenticationProcessor.java
index 36fcf35..c192a04 100755
--- a/services/src/main/java/org/keycloak/authentication/AuthenticationProcessor.java
+++ b/services/src/main/java/org/keycloak/authentication/AuthenticationProcessor.java
@@ -333,7 +333,7 @@
     }
 
     public Response authenticate() throws AuthException {
-        logger.info("AUTHENTICATE");
+        logger.debug("AUTHENTICATE");
         event.event(EventType.LOGIN);
         event.client(clientSession.getClient().getClientId())
                 .detail(Details.REDIRECT_URI, clientSession.getRedirectUri())
