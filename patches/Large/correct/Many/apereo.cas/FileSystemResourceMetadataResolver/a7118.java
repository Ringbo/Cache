diff --git a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/FileSystemResourceMetadataResolver.java b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/FileSystemResourceMetadataResolver.java
index 59c846a..90ffb3d 100644
--- a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/FileSystemResourceMetadataResolver.java
+++ b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/FileSystemResourceMetadataResolver.java
@@ -53,7 +53,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     @Override
