diff --git a/core/src/test/java/org/elasticsearch/snapshots/SharedClusterSnapshotRestoreIT.java b/core/src/test/java/org/elasticsearch/snapshots/SharedClusterSnapshotRestoreIT.java
index a8a45e6..4f47a2a 100644
--- a/core/src/test/java/org/elasticsearch/snapshots/SharedClusterSnapshotRestoreIT.java
+++ b/core/src/test/java/org/elasticsearch/snapshots/SharedClusterSnapshotRestoreIT.java
@@ -1448,7 +1448,7 @@
             }
         }
 
-        logger.info("--> checking snapshot status for all currently running and snapshot with empty repository", blockedNode);
+        logger.info("--> checking snapshot status for all currently running and snapshot with empty repository");
         response = client.admin().cluster().prepareSnapshotStatus().execute().actionGet();
         assertThat(response.getSnapshots().size(), equalTo(1));
         snapshotStatus = response.getSnapshots().get(0);
@@ -1461,7 +1461,7 @@
             }
         }
 
-        logger.info("--> checking that _current returns the currently running snapshot", blockedNode);
+        logger.info("--> checking that _current returns the currently running snapshot");
         GetSnapshotsResponse getResponse = client.admin().cluster().prepareGetSnapshots("test-repo").setCurrentSnapshot().execute().actionGet();
         assertThat(getResponse.getSnapshots().size(), equalTo(1));
         SnapshotInfo snapshotInfo = getResponse.getSnapshots().get(0);
@@ -1475,7 +1475,7 @@
         logger.info("--> done");
 
 
-        logger.info("--> checking snapshot status again after snapshot is done", blockedNode);
+        logger.info("--> checking snapshot status again after snapshot is done");
         response = client.admin().cluster().prepareSnapshotStatus("test-repo").addSnapshots("test-snap").execute().actionGet();
         snapshotStatus = response.getSnapshots().get(0);
         assertThat(snapshotStatus.getIndices().size(), equalTo(1));
@@ -1486,11 +1486,11 @@
         assertThat(indexStatus.getShardsStats().getDoneShards(), equalTo(snapshotInfo.successfulShards()));
         assertThat(indexStatus.getShards().size(), equalTo(snapshotInfo.totalShards()));
 
-        logger.info("--> checking snapshot status after it is done with empty repository", blockedNode);
+        logger.info("--> checking snapshot status after it is done with empty repository");
         response = client.admin().cluster().prepareSnapshotStatus().execute().actionGet();
         assertThat(response.getSnapshots().size(), equalTo(0));
 
-        logger.info("--> checking that _current no longer returns the snapshot", blockedNode);
+        logger.info("--> checking that _current no longer returns the snapshot");
         assertThat(client.admin().cluster().prepareGetSnapshots("test-repo").addSnapshots("_current").execute().actionGet().getSnapshots().isEmpty(), equalTo(true));
 
         try {
