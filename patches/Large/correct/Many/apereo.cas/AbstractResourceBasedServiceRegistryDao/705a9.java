diff --git a/core/cas-server-core-services/src/main/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDao.java b/core/cas-server-core-services/src/main/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDao.java
index 9c4f9b2..5582e68 100644
--- a/core/cas-server-core-services/src/main/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDao.java
+++ b/core/cas-server-core-services/src/main/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDao.java
@@ -229,7 +229,7 @@
     public RegisteredService save(final RegisteredService service) {
         if (service.getId() == RegisteredService.INITIAL_IDENTIFIER_VALUE && service instanceof AbstractRegisteredService) {
             LOGGER.debug("Service id not set. Calculating id based on system time...");
-            ((AbstractRegisteredService) service).setId(System.nanoTime());
+            ((AbstractRegisteredService) service).setId(System.currentTimeMillis());
         }
         final File f = makeFile(service);
         try (LockedOutputStream out = new LockedOutputStream(new FileOutputStream(f))) {
