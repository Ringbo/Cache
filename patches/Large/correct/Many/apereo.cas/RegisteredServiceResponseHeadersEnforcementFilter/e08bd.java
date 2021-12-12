diff --git a/core/cas-server-core-web-api/src/main/java/org/apereo/cas/services/web/support/RegisteredServiceResponseHeadersEnforcementFilter.java b/core/cas-server-core-web-api/src/main/java/org/apereo/cas/services/web/support/RegisteredServiceResponseHeadersEnforcementFilter.java
index 84c09c9..c2cac29 100644
--- a/core/cas-server-core-web-api/src/main/java/org/apereo/cas/services/web/support/RegisteredServiceResponseHeadersEnforcementFilter.java
+++ b/core/cas-server-core-web-api/src/main/java/org/apereo/cas/services/web/support/RegisteredServiceResponseHeadersEnforcementFilter.java
@@ -104,7 +104,7 @@
     private Optional<RegisteredService> getRegisteredServiceFromRequest(final HttpServletRequest request) {
         final WebApplicationService service = this.argumentExtractor.extractService(request);
         if (service != null) {
-            return Optional.of(this.servicesManager.findServiceBy(service));
+            return Optional.ofNullable(this.servicesManager.findServiceBy(service));
         }
         return Optional.empty();
     }
