diff --git a/hazelcast/src/test/java/com/hazelcast/test/TestHazelcastInstanceFactory.java b/hazelcast/src/test/java/com/hazelcast/test/TestHazelcastInstanceFactory.java
index 9ed4a22..6b5cc8e 100644
--- a/hazelcast/src/test/java/com/hazelcast/test/TestHazelcastInstanceFactory.java
+++ b/hazelcast/src/test/java/com/hazelcast/test/TestHazelcastInstanceFactory.java
@@ -82,7 +82,7 @@
 
     public HazelcastInstance[] newInstances(Config config, int nodeCount) {
         final HazelcastInstance[] instances = new HazelcastInstance[count];
-        for (int i = 0; i < count; i++) {
+        for (int i = 0; i < nodeCount; i++) {
             instances[i] = newHazelcastInstance(config);
         }
         return instances;
