diff --git a/hazelcast/src/main/java/com/hazelcast/queue/QueueContainer.java b/hazelcast/src/main/java/com/hazelcast/queue/QueueContainer.java
index 7cb4aab..87f500e 100644
--- a/hazelcast/src/main/java/com/hazelcast/queue/QueueContainer.java
+++ b/hazelcast/src/main/java/com/hazelcast/queue/QueueContainer.java
@@ -292,7 +292,7 @@
                 throw new HazelcastException(e);
             }
         }
-        if (list.isEmpty()){
+        if (!list.isEmpty()){
             getItemQueue().addAll(list);
             cancelEvictionIfExists();
         }
