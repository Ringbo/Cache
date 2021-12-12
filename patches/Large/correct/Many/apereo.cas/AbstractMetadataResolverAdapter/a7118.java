diff --git a/support/cas-server-support-saml-mdui-core/src/main/java/org/apereo/cas/support/saml/mdui/AbstractMetadataResolverAdapter.java b/support/cas-server-support-saml-mdui-core/src/main/java/org/apereo/cas/support/saml/mdui/AbstractMetadataResolverAdapter.java
index 394ddff..3e57403 100644
--- a/support/cas-server-support-saml-mdui-core/src/main/java/org/apereo/cas/support/saml/mdui/AbstractMetadataResolverAdapter.java
+++ b/support/cas-server-support-saml-mdui-core/src/main/java/org/apereo/cas/support/saml/mdui/AbstractMetadataResolverAdapter.java
@@ -163,7 +163,7 @@
         } catch (final Exception e) {
             LOGGER.warn("Could not retrieve input stream from resource. Moving on...", e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     /**
@@ -197,7 +197,7 @@
         } catch (final Exception ex) {
             LOGGER.warn("Could not initialize metadata resolver. Resource will be ignored", ex);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     public void setMetadataResources(final Map<Resource, MetadataFilterChain> metadataResources) {
