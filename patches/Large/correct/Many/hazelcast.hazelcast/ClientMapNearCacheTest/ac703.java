diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/map/impl/nearcache/ClientMapNearCacheTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/map/impl/nearcache/ClientMapNearCacheTest.java
index c907ba8..6c7dc17 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/map/impl/nearcache/ClientMapNearCacheTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/map/impl/nearcache/ClientMapNearCacheTest.java
@@ -997,7 +997,7 @@
         ((NearCachedClientMapProxy) clientMap).addNearCacheInvalidateListener(handler);
 
         // create a new client to send events
-        HazelcastInstance anotherClient = hazelcastFactory.newHazelcastClient();
+        HazelcastInstance anotherClient = hazelcastFactory.newHazelcastClient(newClientConfig());
         IMap<Object, Object> anotherClientMap = anotherClient.getMap(clientMap.getName());
         anotherClientMap.clear();
 
@@ -1019,7 +1019,7 @@
         populateNearCache(clientMap, 1000);
 
         // member comes
-        HazelcastInstance member = hazelcastFactory.newHazelcastInstance();
+        HazelcastInstance member = hazelcastFactory.newHazelcastInstance(newConfig());
 
         // add test listener to count clear events
         final ClearEventCounterEventHandler handler = new ClearEventCounterEventHandler();
@@ -1051,7 +1051,7 @@
         ((NearCachedClientMapProxy) clientMap).addNearCacheInvalidateListener(handler);
 
         // call evictAll
-        HazelcastInstance anotherClient = hazelcastFactory.newHazelcastClient();
+        HazelcastInstance anotherClient = hazelcastFactory.newHazelcastClient(newClientConfig());
         IMap<Object, Object> anotherClientMap = anotherClient.getMap(clientMap.getName());
         anotherClientMap.evictAll();
 
@@ -1073,7 +1073,7 @@
         populateNearCache(clientMap, 1000);
 
         // member comes
-        HazelcastInstance member = hazelcastFactory.newHazelcastInstance();
+        HazelcastInstance member = hazelcastFactory.newHazelcastInstance(newConfig());
 
         // add test listener to count clear events
         final ClearEventCounterEventHandler handler = new ClearEventCounterEventHandler();
@@ -1109,7 +1109,7 @@
         ((NearCachedClientMapProxy) clientMap).addNearCacheInvalidateListener(handler);
 
         // create a new client to send events
-        HazelcastInstance anotherClient = hazelcastFactory.newHazelcastClient();
+        HazelcastInstance anotherClient = hazelcastFactory.newHazelcastClient(newClientConfig());
         IMap<Object, Object> anotherClientMap = anotherClient.getMap(clientMap.getName());
         anotherClientMap.loadAll(true);
 
