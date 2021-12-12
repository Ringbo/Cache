diff --git a/sonar-batch/src/main/java/org/sonar/batch/index/DefaultResourcePersister.java b/sonar-batch/src/main/java/org/sonar/batch/index/DefaultResourcePersister.java
index 625d648..e6a9734 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/index/DefaultResourcePersister.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/index/DefaultResourcePersister.java
@@ -67,7 +67,7 @@
   }
 
   private void addToCache(Resource resource, Snapshot snapshot) {
-    if (snapshot != null) {
+    if (snapshot != null && !ResourceUtils.isLibrary(resource)) {
       snapshotsByResource.put(resource, snapshot);
       resourceCache.add(resource);
       snapshotCache.put(resource.getEffectiveKey(), snapshot);
