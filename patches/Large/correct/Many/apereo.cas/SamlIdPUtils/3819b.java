diff --git a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/SamlIdPUtils.java b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/SamlIdPUtils.java
index 300e092..7d35825 100644
--- a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/SamlIdPUtils.java
+++ b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/SamlIdPUtils.java
@@ -101,7 +101,7 @@
                     .map(SamlRegisteredServiceServiceProviderMetadataFacade::getMetadataResolver)
                     .collect(Collectors.toList());
             
-            LOGGER.debug("Located [{}] metadata resolvers to match against [{}]", entityID);
+            LOGGER.debug("Located [{}] metadata resolvers to match against [{}]", resolvers, entityID);
             chainingMetadataResolver.setResolvers(resolvers);
             chainingMetadataResolver.setId(entityID);
             chainingMetadataResolver.initialize();
