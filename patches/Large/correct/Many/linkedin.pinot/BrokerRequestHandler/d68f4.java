diff --git a/pinot-broker/src/main/java/com/linkedin/pinot/broker/requesthandler/BrokerRequestHandler.java b/pinot-broker/src/main/java/com/linkedin/pinot/broker/requesthandler/BrokerRequestHandler.java
index 9339da4..d0ccfd9 100644
--- a/pinot-broker/src/main/java/com/linkedin/pinot/broker/requesthandler/BrokerRequestHandler.java
+++ b/pinot-broker/src/main/java/com/linkedin/pinot/broker/requesthandler/BrokerRequestHandler.java
@@ -420,7 +420,7 @@
     if (offlineBrokerRequest != null) {
       offlineTableName = offlineBrokerRequest.getQuerySource().getTableName();
       offlineCompositeFuture =
-          routeAndScatterBrokerRequest(offlineBrokerRequest, phaseTimes, scatterGatherStats, bucketingSelection,
+          routeAndScatterBrokerRequest(offlineBrokerRequest, phaseTimes, scatterGatherStats, true, bucketingSelection,
               requestId);
     }
     String realtimeTableName = null;
@@ -428,7 +428,7 @@
     if (realtimeBrokerRequest != null) {
       realtimeTableName = realtimeBrokerRequest.getQuerySource().getTableName();
       realtimeCompositeFuture =
-          routeAndScatterBrokerRequest(realtimeBrokerRequest, phaseTimes, scatterGatherStats, bucketingSelection,
+          routeAndScatterBrokerRequest(realtimeBrokerRequest, phaseTimes, scatterGatherStats, false, bucketingSelection,
               requestId);
     }
     if ((offlineCompositeFuture == null) && (realtimeCompositeFuture == null)) {
@@ -451,7 +451,7 @@
     if (realtimeCompositeFuture != null) {
       numServersQueried += realtimeCompositeFuture.getNumFutures();
       realtimeServerResponseMap =
-          gatherServerResponses(realtimeCompositeFuture, scatterGatherStats, true, realtimeTableName,
+          gatherServerResponses(realtimeCompositeFuture, scatterGatherStats, false, realtimeTableName,
               processingExceptions);
     }
     phaseTimes.addToGatherTime(System.nanoTime() - gatherStartTime);
@@ -507,7 +507,7 @@
    */
   @Nullable
   private CompositeFuture<ServerInstance, ByteBuf> routeAndScatterBrokerRequest(@Nonnull BrokerRequest brokerRequest,
-      @Nonnull PhaseTimes phaseTimes, @Nonnull ScatterGatherStats scatterGatherStats,
+      @Nonnull PhaseTimes phaseTimes, @Nonnull ScatterGatherStats scatterGatherStats, boolean isOfflineTable,
       @Nullable BucketingSelection bucketingSelection, long requestId)
       throws InterruptedException {
     // Step 1: find the candidate servers to be queried for each set of segments from the routing table.
@@ -529,7 +529,7 @@
             ReplicaSelectionGranularity.SEGMENT_ID_SET, brokerRequest.getBucketHashKey(), 0, bucketingSelection,
             requestId, _brokerTimeOutMs, _brokerId);
     CompositeFuture<ServerInstance, ByteBuf> compositeFuture =
-        _scatterGatherer.scatterGather(scatterRequest, scatterGatherStats, true, _brokerMetrics);
+        _scatterGatherer.scatterGather(scatterRequest, scatterGatherStats, isOfflineTable, _brokerMetrics);
     phaseTimes.addToScatterTime(System.nanoTime() - scatterStartTime);
     return compositeFuture;
   }
