diff --git a/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20AccessTokenController.java b/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20AccessTokenController.java
index b75bb13..fa42391 100644
--- a/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20AccessTokenController.java
+++ b/cas-server-support-oauth/src/main/java/org/jasig/cas/support/oauth/web/OAuth20AccessTokenController.java
@@ -81,7 +81,7 @@
         final ServiceTicket serviceTicket = (ServiceTicket) ticketRegistry.getTicket(code);
         // service ticket should be valid
         if (serviceTicket == null || serviceTicket.isExpired()) {
-            log.error("Code expired : {}", code);
+            LOGGER.error("Code expired : {}", code);
             return OAuthUtils.writeTextError(response, OAuthConstants.INVALID_GRANT, 400);
         }
         final TicketGrantingTicket ticketGrantingTicket = serviceTicket.getGrantingTicket();
@@ -94,7 +94,7 @@
 
         final String text = String.format("%s=%s&%s=%s", OAuthConstants.ACCESS_TOKEN, ticketGrantingTicket.getId(),
                                                     OAuthConstants.EXPIRES, expires);
-        log.debug("text : {}", text);
+        LOGGER.debug("text : {}", text);
         return OAuthUtils.writeText(response, text, 200);
     }
 
@@ -124,18 +124,18 @@
 
         final OAuthRegisteredService service = OAuthUtils.getRegisteredOAuthService(this.servicesManager, clientId);
         if (service == null) {
-            log.error("Unknown {} : {}", OAuthConstants.CLIENT_ID, clientId);
+            LOGGER.error("Unknown {} : {}", OAuthConstants.CLIENT_ID, clientId);
             return false;
         }
 
         final String serviceId = service.getServiceId();
         if (redirectUri.matches(serviceId)) {
-            log.error("Unsupported {} : {} for serviceId : {}", OAuthConstants.REDIRECT_URI, redirectUri, serviceId);
+            LOGGER.error("Unsupported {} : {} for serviceId : {}", OAuthConstants.REDIRECT_URI, redirectUri, serviceId);
             return false;
         }
 
         if (!StringUtils.equals(service.getClientSecret(), clientSecret)) {
-            log.error("Wrong client secret for service {}", service);
+            LOGGER.error("Wrong client secret for service {}", service);
             return false;
         }
         return true;
