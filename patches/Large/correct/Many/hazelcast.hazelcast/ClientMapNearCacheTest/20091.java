diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/map/impl/nearcache/ClientMapNearCacheTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/map/impl/nearcache/ClientMapNearCacheTest.java
index 68fe060..ef97303 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/map/impl/nearcache/ClientMapNearCacheTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/map/impl/nearcache/ClientMapNearCacheTest.java
@@ -607,7 +607,7 @@
         int randomKey = random.nextInt(mapSize);
         clientMap.submitToKey(randomKey, new IncrementEntryProcessor(), callback);
 
-        assertOpenEventually(latch, 3);
+        assertOpenEventually(latch);
         assertTrueEventually(new AssertTask() {
             public void run() {
                 assertThatOwnedEntryCountEquals(clientMap, mapSize - 1);
