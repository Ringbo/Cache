diff --git a/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDao.java b/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDao.java
index 1d4bbe3..69d3086 100644
--- a/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDao.java
+++ b/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDao.java
@@ -301,7 +301,7 @@
         } catch (final Exception e) {
             LOGGER.error("Error reading configuration file [{}]", file.getName(), e);
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     @Override
