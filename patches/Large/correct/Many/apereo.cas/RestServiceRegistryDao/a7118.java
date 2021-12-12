diff --git a/support/cas-server-support-rest-service-registry/src/main/java/org/apereo/cas/services/RestServiceRegistryDao.java b/support/cas-server-support-rest-service-registry/src/main/java/org/apereo/cas/services/RestServiceRegistryDao.java
index fa7de8d..fa026f4 100644
--- a/support/cas-server-support-rest-service-registry/src/main/java/org/apereo/cas/services/RestServiceRegistryDao.java
+++ b/support/cas-server-support-rest-service-registry/src/main/java/org/apereo/cas/services/RestServiceRegistryDao.java
@@ -54,7 +54,7 @@
             final RegisteredService[] results = responseEntity.getBody();
             return Stream.of(results).collect(Collectors.toList());
         }
-        return new ArrayList<>();
+        return new ArrayList<>(0);
     }
 
     @Override
