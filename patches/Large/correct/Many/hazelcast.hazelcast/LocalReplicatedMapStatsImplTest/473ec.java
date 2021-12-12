diff --git a/hazelcast/src/test/java/com/hazelcast/monitor/impl/LocalReplicatedMapStatsImplTest.java b/hazelcast/src/test/java/com/hazelcast/monitor/impl/LocalReplicatedMapStatsImplTest.java
index c16f2f3..bd33bf5 100644
--- a/hazelcast/src/test/java/com/hazelcast/monitor/impl/LocalReplicatedMapStatsImplTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/monitor/impl/LocalReplicatedMapStatsImplTest.java
@@ -57,7 +57,7 @@
         assertEquals(5, localReplicatedMapStats.getOwnedEntryCount());
         assertEquals(0, localReplicatedMapStats.getBackupEntryCount());
         assertEquals(0, localReplicatedMapStats.getBackupCount());
-        assertEquals(0, localReplicatedMapStats.getOwnedEntryMemoryCost());
+        assertEquals(1234, localReplicatedMapStats.getOwnedEntryMemoryCost());
         assertEquals(0, localReplicatedMapStats.getBackupEntryMemoryCost());
         assertEquals(1231241512, localReplicatedMapStats.getLastAccessTime());
         assertEquals(1341412343, localReplicatedMapStats.getLastUpdateTime());
@@ -92,7 +92,7 @@
         assertEquals(5, deserialized.getOwnedEntryCount());
         assertEquals(0, deserialized.getBackupEntryCount());
         assertEquals(0, deserialized.getBackupCount());
-        assertEquals(0, deserialized.getOwnedEntryMemoryCost());
+        assertEquals(1234, deserialized.getOwnedEntryMemoryCost());
         assertEquals(0, deserialized.getBackupEntryMemoryCost());
         assertEquals(1231241512, deserialized.getLastAccessTime());
         assertEquals(1341412343, deserialized.getLastUpdateTime());
