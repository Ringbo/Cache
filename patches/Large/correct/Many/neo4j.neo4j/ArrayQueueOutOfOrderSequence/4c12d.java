diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/ArrayQueueOutOfOrderSequence.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/ArrayQueueOutOfOrderSequence.java
index 94b6d41..b51a192 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/ArrayQueueOutOfOrderSequence.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/nioneo/store/ArrayQueueOutOfOrderSequence.java
@@ -56,7 +56,7 @@
     }
 
     @Override
-    public void set( long number )
+    public synchronized void set( long number )
     {
         highestGapFreeNumber = number;
         outOfOrderQueue.clear();
