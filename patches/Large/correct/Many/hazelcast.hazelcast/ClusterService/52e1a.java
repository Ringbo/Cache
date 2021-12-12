diff --git a/hazelcast/src/main/java/com/hazelcast/cluster/ClusterService.java b/hazelcast/src/main/java/com/hazelcast/cluster/ClusterService.java
index baddae0..0ef94a5 100644
--- a/hazelcast/src/main/java/com/hazelcast/cluster/ClusterService.java
+++ b/hazelcast/src/main/java/com/hazelcast/cluster/ClusterService.java
@@ -154,7 +154,7 @@
         unpark();
     }
 
-    void unpark() {
+    private void unpark() {
         LockSupport.unpark(serviceThread);
     }
 
