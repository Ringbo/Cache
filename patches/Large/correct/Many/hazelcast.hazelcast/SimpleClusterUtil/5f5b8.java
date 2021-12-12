diff --git a/hazelcast/src/test/java/com/hazelcast/test/modularhelpers/SimpleClusterUtil.java b/hazelcast/src/test/java/com/hazelcast/test/modularhelpers/SimpleClusterUtil.java
index 89cb7f4..61be69c 100644
--- a/hazelcast/src/test/java/com/hazelcast/test/modularhelpers/SimpleClusterUtil.java
+++ b/hazelcast/src/test/java/com/hazelcast/test/modularhelpers/SimpleClusterUtil.java
@@ -62,9 +62,9 @@
         return getNode(random.nextInt(cluster.size()));
     }
 
-    public void terminateRandomNode(){
+    public void shutdownRandomNode(){
         HazelcastInstance node = getRandomNode();
-        node.getLifecycleService().terminate();
+        node.getLifecycleService().shutdown();
         cluster.remove(node);
     }
 
