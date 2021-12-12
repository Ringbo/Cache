diff --git a/hazelcast/src/test/java/com/hazelcast/map/impl/mapstore/MapStoreWriteBehindTest.java b/hazelcast/src/test/java/com/hazelcast/map/impl/mapstore/MapStoreWriteBehindTest.java
index c2f55a6..e92c5ce 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/impl/mapstore/MapStoreWriteBehindTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/impl/mapstore/MapStoreWriteBehindTest.java
@@ -245,7 +245,7 @@
     public void testOneMemberWriteBehindFlush() {
         TestMapStore testMapStore = new TestMapStore(1, 1, 1);
         testMapStore.setLoadAllKeys(false);
-        int writeDelaySeconds = 2;
+        int writeDelaySeconds = 10;
         Config config = newConfig(testMapStore, writeDelaySeconds);
         TestHazelcastInstanceFactory nodeFactory = createHazelcastInstanceFactory(3);
         HazelcastInstance instance = nodeFactory.newHazelcastInstance(config);
