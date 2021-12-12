diff --git a/services/src/main/java/org/keycloak/authorization/entitlement/EntitlementService.java b/services/src/main/java/org/keycloak/authorization/entitlement/EntitlementService.java
index b7a327f..cf7c57e 100644
--- a/services/src/main/java/org/keycloak/authorization/entitlement/EntitlementService.java
+++ b/services/src/main/java/org/keycloak/authorization/entitlement/EntitlementService.java
@@ -170,7 +170,7 @@
                 return Cors.add(request, Response.ok().entity(new EntitlementResponse(createRequestingPartyToken(entitlements, identity.getAccessToken(), resourceServer)))).allowedOrigins(identity.getAccessToken()).allowedMethods("GET").exposedHeaders(Cors.ACCESS_CONTROL_ALLOW_METHODS).build();
             }
         } catch (Exception cause) {
-            logger.error(cause);
+            logger.error("Failed to evaluate permissions", cause);
             throw new ErrorResponseException(OAuthErrorException.SERVER_ERROR, "Error while evaluating permissions.", Status.INTERNAL_SERVER_ERROR);
         }
 
