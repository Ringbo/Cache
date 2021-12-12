diff --git a/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/DomainServicesManager.java b/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/DomainServicesManager.java
index 49fb9c8..de6ce3e 100644
--- a/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/DomainServicesManager.java
+++ b/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/DomainServicesManager.java
@@ -60,7 +60,7 @@
         final Collection<RegisteredService> registeredServices = getServicesForDomain(domain);
         if (registeredServices == null || registeredServices.isEmpty()) {
             LOGGER.debug("No services could be located for domain [{}]", domain);
-            return new ArrayList<>();
+            return new ArrayList<>(0);
         }
         return registeredServices;
     }
