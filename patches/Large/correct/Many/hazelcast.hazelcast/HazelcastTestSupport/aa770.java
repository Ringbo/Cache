diff --git a/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java b/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java
index db424b0..b72fcb9 100644
--- a/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java
+++ b/hazelcast/src/test/java/com/hazelcast/test/HazelcastTestSupport.java
@@ -209,7 +209,7 @@
         for (; ; ) {
             String id = prefix + randomString();
             Partition partition = partitionService.getPartition(id);
-            if (comparePartitionOwnership(true, localMember, partition)) {
+            if (comparePartitionOwnership(false, localMember, partition)) {
                 return id;
             }
         }
