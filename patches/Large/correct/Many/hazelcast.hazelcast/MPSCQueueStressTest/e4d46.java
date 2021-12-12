diff --git a/hazelcast/src/test/java/com/hazelcast/internal/util/collection/MPSCQueueStressTest.java b/hazelcast/src/test/java/com/hazelcast/internal/util/collection/MPSCQueueStressTest.java
index bcfea97..014774d 100644
--- a/hazelcast/src/test/java/com/hazelcast/internal/util/collection/MPSCQueueStressTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/internal/util/collection/MPSCQueueStressTest.java
@@ -107,7 +107,7 @@
                 itemCount++;
                 queue.offer(new Item(id, itemCount));
 
-                while (queue.size() < 100000) {
+                while (queue.size() > 100000) {
                     sleepMillis(random.nextInt(100));
                 }
 
