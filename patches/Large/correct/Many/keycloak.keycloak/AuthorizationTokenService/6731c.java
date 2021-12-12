diff --git a/services/src/main/java/org/keycloak/authorization/authorization/AuthorizationTokenService.java b/services/src/main/java/org/keycloak/authorization/authorization/AuthorizationTokenService.java
index 3f9fb06..c86dd45 100644
--- a/services/src/main/java/org/keycloak/authorization/authorization/AuthorizationTokenService.java
+++ b/services/src/main/java/org/keycloak/authorization/authorization/AuthorizationTokenService.java
@@ -125,7 +125,7 @@
                         .exposedHeaders(Cors.ACCESS_CONTROL_ALLOW_METHODS).build();
             }
         } catch (Exception cause) {
-            logger.error(cause);
+            logger.error("Failed to evaluate permissions", cause);
             throw new ErrorResponseException(OAuthErrorException.SERVER_ERROR, "Error while evaluating permissions.", Status.INTERNAL_SERVER_ERROR);
         }
 
