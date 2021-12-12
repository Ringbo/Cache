diff --git a/src/java/org/apache/cassandra/service/StorageProxy.java b/src/java/org/apache/cassandra/service/StorageProxy.java
index 9eae17a..65ce413 100644
--- a/src/java/org/apache/cassandra/service/StorageProxy.java
+++ b/src/java/org/apache/cassandra/service/StorageProxy.java
@@ -1405,7 +1405,7 @@
 
         LocalRangeSliceRunnable(AbstractRangeCommand command, ReadCallback<RangeSliceReply, Iterable<Row>> handler)
         {
-            super(MessagingService.Verb.READ);
+            super(MessagingService.Verb.RANGE_SLICE);
             this.command = command;
             this.handler = handler;
         }
@@ -1590,7 +1590,7 @@
                         && filteredEndpoints.get(0).equals(FBUtilities.getBroadcastAddress())
                         && OPTIMIZE_LOCAL_REQUESTS)
                     {
-                        StageManager.getStage(Stage.READ).execute(new LocalRangeSliceRunnable(nodeCmd, handler));
+                        StageManager.getStage(Stage.READ).execute(new LocalRangeSliceRunnable(nodeCmd, handler), Tracing.instance.get());
                     }
                     else
                     {
