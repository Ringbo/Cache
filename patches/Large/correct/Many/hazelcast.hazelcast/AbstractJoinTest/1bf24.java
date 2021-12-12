diff --git a/hazelcast/src/test/java/com/hazelcast/cluster/AbstractJoinTest.java b/hazelcast/src/test/java/com/hazelcast/cluster/AbstractJoinTest.java
index fcccd09..0832f3a 100644
--- a/hazelcast/src/test/java/com/hazelcast/cluster/AbstractJoinTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/cluster/AbstractJoinTest.java
@@ -24,8 +24,10 @@
 
         h1.shutdown();
         h1 = Hazelcast.newHazelcastInstance(config);
+        // when h1 is returned, it's guaranteed that it should see 2 members
         assertClusterSize(2, h1);
-        assertClusterSize(2, h2);
+        // but h2 will report newly joining member eventually
+        assertClusterSizeEventually(2, h2);
     }
 
     protected void testJoin_With_DifferentBuildNumber(Config config) {
