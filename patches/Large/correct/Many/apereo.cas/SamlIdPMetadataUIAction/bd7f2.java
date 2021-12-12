diff --git a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/web/flow/SamlIdPMetadataUIAction.java b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/web/flow/SamlIdPMetadataUIAction.java
index 88d281f..dc8375e 100644
--- a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/web/flow/SamlIdPMetadataUIAction.java
+++ b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/web/flow/SamlIdPMetadataUIAction.java
@@ -39,7 +39,7 @@
     @Override
     protected Event doExecute(final RequestContext requestContext) throws Exception {
         Service service = WebUtils.getService(requestContext);
-        if (service != null) {
+        if (service != null && serviceSelectionStrategy.supports(service)) {
             service = serviceSelectionStrategy.resolveServiceFrom(service);
             final RegisteredService registeredService = this.servicesManager.findServiceBy(service);
             RegisteredServiceAccessStrategyUtils.ensureServiceAccessIsAllowed(service, registeredService);
