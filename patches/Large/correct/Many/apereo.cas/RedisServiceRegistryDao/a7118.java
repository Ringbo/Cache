diff --git a/support/cas-server-support-redis-service-registry/src/main/java/org/apereo/cas/adaptors/redis/services/RedisServiceRegistryDao.java b/support/cas-server-support-redis-service-registry/src/main/java/org/apereo/cas/adaptors/redis/services/RedisServiceRegistryDao.java
index ed7de14..63b65cb 100644
--- a/support/cas-server-support-redis-service-registry/src/main/java/org/apereo/cas/adaptors/redis/services/RedisServiceRegistryDao.java
+++ b/support/cas-server-support-redis-service-registry/src/main/java/org/apereo/cas/adaptors/redis/services/RedisServiceRegistryDao.java
@@ -72,7 +72,7 @@
         } catch (final Exception e) {
             LOGGER.error(e.getMessage(), e);
         }
-        return new LinkedList<>();
+        return new LinkedList<>(0);
     }
 
     @Override
