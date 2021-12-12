diff --git a/hazelcast-spring/src/main/java/com/hazelcast/spring/cache/HazelcastCache.java b/hazelcast-spring/src/main/java/com/hazelcast/spring/cache/HazelcastCache.java
index f532ab8..619f181 100644
--- a/hazelcast-spring/src/main/java/com/hazelcast/spring/cache/HazelcastCache.java
+++ b/hazelcast-spring/src/main/java/com/hazelcast/spring/cache/HazelcastCache.java
@@ -57,7 +57,7 @@
 
     public void put(final Object key, final Object value) {
         if (key != null) {
-            map.set(key, toStoreValue(value), 0, TimeUnit.SECONDS);
+            map.set(key, toStoreValue(value));
         }
     }
 
