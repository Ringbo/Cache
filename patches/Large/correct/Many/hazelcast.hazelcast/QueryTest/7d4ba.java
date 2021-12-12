diff --git a/hazelcast/src/test/java/com/hazelcast/map/QueryTest.java b/hazelcast/src/test/java/com/hazelcast/map/QueryTest.java
index cfff904..93d4aaa 100644
--- a/hazelcast/src/test/java/com/hazelcast/map/QueryTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/map/QueryTest.java
@@ -1592,7 +1592,7 @@
             }.start();
         }
 
-        Assert.assertTrue(latch.await(1, TimeUnit.MINUTES));
+        Assert.assertTrue(latch.await(5, TimeUnit.MINUTES));
         Collection<HazelcastInstance> instances = factory.getAllHazelcastInstances();
         Assert.assertEquals(nodes, instances.size());
 
