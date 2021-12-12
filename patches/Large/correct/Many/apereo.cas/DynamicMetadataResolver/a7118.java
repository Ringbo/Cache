diff --git a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/DynamicMetadataResolver.java b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/DynamicMetadataResolver.java
index 3a3a90d..d810974 100644
--- a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/DynamicMetadataResolver.java
+++ b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/DynamicMetadataResolver.java
@@ -79,7 +79,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     /**
