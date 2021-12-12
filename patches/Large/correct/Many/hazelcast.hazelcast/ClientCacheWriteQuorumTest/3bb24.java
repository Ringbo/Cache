diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/quorum/cache/ClientCacheWriteQuorumTest.java b/hazelcast-client/src/test/java/com/hazelcast/client/quorum/cache/ClientCacheWriteQuorumTest.java
index d343f43..049869d 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/quorum/cache/ClientCacheWriteQuorumTest.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/quorum/cache/ClientCacheWriteQuorumTest.java
@@ -131,7 +131,7 @@
 
     @AfterClass
     public static void killAllHazelcastInstances() throws IOException {
-        HazelcastInstanceFactory.terminateAll();
+        factory.terminateAll();
     }
 
     @Test
