diff --git a/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java b/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java
index b72fcb9..db424b0 100644
--- a/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java
+++ b/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java
@@ -209,7 +209,7 @@
         for (; ; ) {
             String id = prefix + randomString();
             Partition partition = partitionService.getPartition(id);
-            if (comparePartitionOwnership(false, localMember, partition)) {
+            if (comparePartitionOwnership(true, localMember, partition)) {
                 return id;
             }
         }
