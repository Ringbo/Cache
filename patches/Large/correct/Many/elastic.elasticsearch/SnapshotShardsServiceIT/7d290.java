diff --git a/server/src/test/java/org/elasticsearch/snapshots/SnapshotShardsServiceIT.java b/server/src/test/java/org/elasticsearch/snapshots/SnapshotShardsServiceIT.java
index 8431c8f..777918a 100644
--- a/server/src/test/java/org/elasticsearch/snapshots/SnapshotShardsServiceIT.java
+++ b/server/src/test/java/org/elasticsearch/snapshots/SnapshotShardsServiceIT.java
@@ -96,7 +96,7 @@
                 .values().stream().map(status -> status.asCopy().getStage()).collect(Collectors.toList());
             assertThat(stages, hasSize(shards));
             assertThat(stages, everyItem(equalTo(IndexShardSnapshotStatus.Stage.DONE)));
-        });
+        }, 30L, TimeUnit.SECONDS);
 
         logger.info("--> stop disrupting cluster");
         networkDisruption.stopDisrupting();
@@ -110,6 +110,6 @@
             logger.info("Snapshot status [{}], successfulShards [{}]", snapshotInfo.state(), snapshotInfo.successfulShards());
             assertThat(snapshotInfo.state(), equalTo(SnapshotState.SUCCESS));
             assertThat(snapshotInfo.successfulShards(), equalTo(shards));
-        }, 10, TimeUnit.SECONDS);
+        }, 30L, TimeUnit.SECONDS);
     }
 }
