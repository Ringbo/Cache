diff --git a/support/cas-server-support-couchbase-service-registry/src/main/java/org/apereo/cas/services/CouchbaseServiceRegistryDao.java b/support/cas-server-support-couchbase-service-registry/src/main/java/org/apereo/cas/services/CouchbaseServiceRegistryDao.java
index e220485..30efe0b 100644
--- a/support/cas-server-support-couchbase-service-registry/src/main/java/org/apereo/cas/services/CouchbaseServiceRegistryDao.java
+++ b/support/cas-server-support-couchbase-service-registry/src/main/java/org/apereo/cas/services/CouchbaseServiceRegistryDao.java
@@ -118,7 +118,7 @@
             return services;
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
-            return new LinkedList<>(0);
+            return new LinkedList<>();
         }
     }
 
