diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/quorum/cache/ClientCacheReadQuorumTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/quorum/cache/ClientCacheReadQuorumTest.java
index 0bfc801..35f21b7 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/quorum/cache/ClientCacheReadQuorumTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/quorum/cache/ClientCacheReadQuorumTest.java
@@ -126,7 +126,7 @@
 
     @AfterClass
     public static void killAllHazelcastInstances() throws IOException {
-        HazelcastInstanceFactory.terminateAll();
+        factory.terminateAll();
     }
 
     @Test
