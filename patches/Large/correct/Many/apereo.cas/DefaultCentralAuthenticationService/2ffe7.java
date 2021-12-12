diff --git a/core/cas-server-core/src/main/java/org/apereo/cas/DefaultCentralAuthenticationService.java b/core/cas-server-core/src/main/java/org/apereo/cas/DefaultCentralAuthenticationService.java
index 7453267..574d15a 100644
--- a/core/cas-server-core/src/main/java/org/apereo/cas/DefaultCentralAuthenticationService.java
+++ b/core/cas-server-core/src/main/java/org/apereo/cas/DefaultCentralAuthenticationService.java
@@ -300,7 +300,7 @@
             }
 
             final Service selectedService = resolveServiceFromAuthenticationRequest(service);
-            LOGGER.debug("Resolved service [{}] from the authentication request");
+            LOGGER.debug("Resolved service [{}] from the authentication request", selectedService);
             
             final RegisteredService registeredService = this.servicesManager.findServiceBy(selectedService);
             LOGGER.debug("Located registered service definition [{}] from [{}] to handle validation request",
