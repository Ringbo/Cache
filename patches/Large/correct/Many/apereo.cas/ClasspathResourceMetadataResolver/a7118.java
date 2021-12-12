diff --git a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/ClasspathResourceMetadataResolver.java b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/ClasspathResourceMetadataResolver.java
index 5abdf95..aefb866 100644
--- a/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/ClasspathResourceMetadataResolver.java
+++ b/support/cas-server-support-saml-idp/src/main/java/org/apereo/cas/support/saml/services/idp/metadata/cache/resolver/ClasspathResourceMetadataResolver.java
@@ -47,7 +47,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     @Override
