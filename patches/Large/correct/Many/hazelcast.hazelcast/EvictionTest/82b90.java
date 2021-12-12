diff --git a/hazelcast/src/test/java/com/hazelcast/map/EvictionTest.java b/hazelcast/src/test/java/com/hazelcast/map/EvictionTest.java
index 3b91208..bdde1fc 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/EvictionTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/EvictionTest.java
@@ -183,7 +183,7 @@
 
         final String key = "key";
 
-        map.set(key, "value", 1, TimeUnit.SECONDS);
+        map.set(key, "value", 5, TimeUnit.SECONDS);
         // this `set` operation should not affect existing ttl.
         // so "key" should be expired after 1 seconds.
         map.set(key, "value2");
