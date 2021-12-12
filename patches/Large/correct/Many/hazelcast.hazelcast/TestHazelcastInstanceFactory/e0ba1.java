diff --git a/hazelcast/src/test/java/com/hazelcast/test/TestHazelcastInstanceFactory.java b/hazelcast/src/test/java/com/hazelcast/test/TestHazelcastInstanceFactory.java
index 6b5cc8e..1ad1645 100644
--- a/hazelcast/src/test/java/com/hazelcast/test/TestHazelcastInstanceFactory.java
+++ b/hazelcast/src/test/java/com/hazelcast/test/TestHazelcastInstanceFactory.java
@@ -81,7 +81,7 @@
     }
 
     public HazelcastInstance[] newInstances(Config config, int nodeCount) {
-        final HazelcastInstance[] instances = new HazelcastInstance[count];
+        final HazelcastInstance[] instances = new HazelcastInstance[nodeCount];
         for (int i = 0; i < nodeCount; i++) {
             instances[i] = newHazelcastInstance(config);
         }
