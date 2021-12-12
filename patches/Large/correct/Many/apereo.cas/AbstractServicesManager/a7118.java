diff --git a/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/AbstractServicesManager.java b/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/AbstractServicesManager.java
index 6a6773f..8f406bd 100644
--- a/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/AbstractServicesManager.java
+++ b/core/cas-server-core-services-registry/src/main/java/org/apereo/cas/services/AbstractServicesManager.java
@@ -64,7 +64,7 @@
     @Override
     public Collection<RegisteredService> findServiceBy(final Predicate<RegisteredService> predicate) {
         if (predicate == null) {
-            return new ArrayList<>();
+            return new ArrayList<>(0);
         }
         
         return getAllServices()
