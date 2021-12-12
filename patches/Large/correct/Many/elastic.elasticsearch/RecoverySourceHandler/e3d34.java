diff --git a/src/main/java/org/elasticsearch/indices/recovery/RecoverySourceHandler.java b/src/main/java/org/elasticsearch/indices/recovery/RecoverySourceHandler.java
index 8eb73e4..93b6e5f 100644
--- a/src/main/java/org/elasticsearch/indices/recovery/RecoverySourceHandler.java
+++ b/src/main/java/org/elasticsearch/indices/recovery/RecoverySourceHandler.java
@@ -417,7 +417,7 @@
                     try {
                         final Store.MetadataSnapshot remainingFilesAfterCleanup = recoverWithSyncId? request.metadataSnapshot(): recoverySourceMetadata;
                         transportService.submitRequest(request.targetNode(), RecoveryTarget.Actions.CLEAN_FILES,
-                                new RecoveryCleanFilesRequest(request.recoveryId(), shard.shardId(), recoverySourceMetadata, translogView.totalOperations()),
+                                new RecoveryCleanFilesRequest(request.recoveryId(), shard.shardId(), remainingFilesAfterCleanup, translogView.totalOperations()),
                                 TransportRequestOptions.options().withTimeout(recoverySettings.internalActionTimeout()),
                                 EmptyTransportResponseHandler.INSTANCE_SAME).txGet();
                     } catch (RemoteTransportException remoteException) {
