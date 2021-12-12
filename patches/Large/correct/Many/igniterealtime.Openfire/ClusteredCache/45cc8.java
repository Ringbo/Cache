diff --git a/src/plugins/hazelcast/src/java/org/jivesoftware/openfire/plugin/util/cache/ClusteredCache.java b/src/plugins/hazelcast/src/java/org/jivesoftware/openfire/plugin/util/cache/ClusteredCache.java
index ed673c1..a5ea7d4 100644
--- a/src/plugins/hazelcast/src/java/org/jivesoftware/openfire/plugin/util/cache/ClusteredCache.java
+++ b/src/plugins/hazelcast/src/java/org/jivesoftware/openfire/plugin/util/cache/ClusteredCache.java
@@ -160,7 +160,7 @@
     }
 
     public void setMaxLifetime(long maxLifetime) {
-    	CacheFactory.setMaxSizeProperty(getName(), maxLifetime);
+    	CacheFactory.setMaxLifetimeProperty(getName(), maxLifetime);
     }
 
     public void destroy() {
