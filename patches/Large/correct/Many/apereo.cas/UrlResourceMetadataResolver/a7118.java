diff --git a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/UrlResourceMetadataResolver.java b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/UrlResourceMetadataResolver.java
index d65c78c..3077b81 100644
--- a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/UrlResourceMetadataResolver.java
+++ b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/UrlResourceMetadataResolver.java
@@ -60,7 +60,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     private File getMetadataBackupFile(final AbstractResource metadataResource,
