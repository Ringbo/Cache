diff --git a/subprojects/dependency-management/src/main/java/org/gradle/internal/resource/transfer/DefaultCacheAwareExternalResourceAccessor.java b/subprojects/dependency-management/src/main/java/org/gradle/internal/resource/transfer/DefaultCacheAwareExternalResourceAccessor.java
index d4eae0a..3238ada 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/internal/resource/transfer/DefaultCacheAwareExternalResourceAccessor.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/internal/resource/transfer/DefaultCacheAwareExternalResourceAccessor.java
@@ -99,7 +99,7 @@
             );
 
             if (isUnchanged) {
-                LOGGER.info("Cached resource {} is up-to-date (lastModified: {}).", cached.getExternalLastModified(), location);
+                LOGGER.info("Cached resource {} is up-to-date (lastModified: {}).", location, cached.getExternalLastModified());
                 // TODO - update the index with the new remote meta-data
                 return new DefaultLocallyAvailableExternalResource(location, new DefaultLocallyAvailableResource(cached.getCachedFile()), cached.getExternalResourceMetaData());
             }
