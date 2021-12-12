diff --git a/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/SendDownstream.java b/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/SendDownstream.java
index eba54e3..3acfcb4 100644
--- a/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/SendDownstream.java
+++ b/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/SendDownstream.java
@@ -29,7 +29,7 @@
     private TicketedBatch head;
     private TicketedBatch tail;
 
-    public SendDownstream( long ticket, Object batch, LongAdder downstreamIdleTime )
+    SendDownstream( long ticket, Object batch, LongAdder downstreamIdleTime )
     {
         this.downstreamIdleTime = downstreamIdleTime;
         TicketedBatch b = new TicketedBatch( ticket, batch );
