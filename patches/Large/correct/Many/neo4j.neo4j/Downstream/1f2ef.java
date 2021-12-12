diff --git a/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/Downstream.java b/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/Downstream.java
index 01a89d9..f911d84 100644
--- a/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/Downstream.java
+++ b/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/Downstream.java
@@ -32,14 +32,14 @@
     private final ArrayList<TicketedBatch> batches;
     private long lastSendTicket = -1;
 
-    public Downstream( Step<Object> downstream, AtomicLong doneBatches )
+    Downstream( Step<Object> downstream, AtomicLong doneBatches )
     {
         this.downstream = downstream;
         this.doneBatches = doneBatches;
         batches = new ArrayList<>();
     }
 
-    public long send()
+    long send()
     {
         // Sort in reverse, so the elements we want to send first are at the end.
         batches.sort( TICKETED_BATCH_COMPARATOR );
@@ -66,7 +66,7 @@
         return idleTimeSum;
     }
 
-    public void queue( TicketedBatch batch )
+    void queue( TicketedBatch batch )
     {
         // Check that this is not a marker to flush the downstream.
         if ( batch.ticket != -1 && batch.batch != null )
