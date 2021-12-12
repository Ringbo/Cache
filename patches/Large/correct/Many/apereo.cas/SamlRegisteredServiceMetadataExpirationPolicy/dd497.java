diff --git a/support/cas-server-support-saml-idp-metadata/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/SamlRegisteredServiceMetadataExpirationPolicy.java b/support/cas-server-support-saml-idp-metadata/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/SamlRegisteredServiceMetadataExpirationPolicy.java
index 1c300f7..dff02e81 100644
--- a/support/cas-server-support-saml-idp-metadata/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/SamlRegisteredServiceMetadataExpirationPolicy.java
+++ b/support/cas-server-support-saml-idp-metadata/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/SamlRegisteredServiceMetadataExpirationPolicy.java
@@ -53,7 +53,7 @@
     public long expireAfterUpdate(@Nonnull final SamlRegisteredServiceCacheKey cacheKey,
                                   @Nonnull final MetadataResolver chainingMetadataResolver,
                                   final long currentTime, final long currentDuration) {
-        LOGGER.debug("Cache expiration duration after updates is set to [{}]", currentDuration);
+        LOGGER.trace("Cache expiration duration after updates is set to [{}]", currentDuration);
         return currentDuration;
     }
 
@@ -61,7 +61,7 @@
     public long expireAfterRead(@Nonnull final SamlRegisteredServiceCacheKey cacheKey,
                                 @Nonnull final MetadataResolver chainingMetadataResolver,
                                 final long currentTime, final long currentDuration) {
-        LOGGER.debug("Cache expiration duration after reads is set to [{}]", currentDuration);
+        LOGGER.trace("Cache expiration duration after reads is set to [{}]", currentDuration);
         return currentDuration;
     }
 
