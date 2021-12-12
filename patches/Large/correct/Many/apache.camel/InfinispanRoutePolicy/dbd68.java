diff --git a/components/camel-infinispan/src/main/java/org/apache/camel/component/infinispan/policy/InfinispanRoutePolicy.java b/components/camel-infinispan/src/main/java/org/apache/camel/component/infinispan/policy/InfinispanRoutePolicy.java
index 7103edf..7afc26a 100644
--- a/components/camel-infinispan/src/main/java/org/apache/camel/component/infinispan/policy/InfinispanRoutePolicy.java
+++ b/components/camel-infinispan/src/main/java/org/apache/camel/component/infinispan/policy/InfinispanRoutePolicy.java
@@ -356,7 +356,7 @@
         private Cache<String, String> cache;
         private ScheduledFuture<?> future;
 
-        public EmbeddedCacheService(Cache<String, String> cache) {
+        EmbeddedCacheService(Cache<String, String> cache) {
             this.cache = cache;
             this.future = null;
         }
@@ -427,7 +427,7 @@
         private ScheduledFuture<?> future;
         private Long version;
 
-        public RemoteCacheService(RemoteCache<String, String> cache) {
+        RemoteCacheService(RemoteCache<String, String> cache) {
             this.cache = cache;
             this.future = null;
             this.version = null;
