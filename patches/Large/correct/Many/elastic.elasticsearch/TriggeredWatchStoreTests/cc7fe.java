diff --git a/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java b/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
index 7d88921..5e061d5 100644
--- a/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
+++ b/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
@@ -92,7 +92,7 @@
             } else {
                 state = ShardRoutingState.UNASSIGNED;
             }
-            indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0), false)
+            indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0))
                     .addShard(TestShardRouting.newShardRouting(indexName, 0, "_node_id", null, null, true, state, 1, new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, "")))
                     .build());
             indexRoutingTableBuilder.addReplica();
@@ -127,7 +127,7 @@
                 .build();
         metaDateBuilder.put(IndexMetaData.builder(indexName).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(indexName);
-        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0), false)
+        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0))
                 .addShard(TestShardRouting.newShardRouting(indexName, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
@@ -162,7 +162,7 @@
                 .build();
         metaDateBuilder.put(IndexMetaData.builder(indexName).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(indexName);
-        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0), false)
+        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0))
                 .addShard(TestShardRouting.newShardRouting(indexName, 0, "_node_name", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
@@ -206,7 +206,7 @@
                 .build();
         metaDateBuilder.put(IndexMetaData.builder(indexName).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(indexName);
-        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0), false)
+        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0))
                 .addShard(TestShardRouting.newShardRouting(indexName, 0, "_node_name", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
@@ -249,7 +249,7 @@
                 .build();
         metaDateBuilder.put(IndexMetaData.builder(indexName).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(indexName);
-        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0), false)
+        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0))
                 .addShard(TestShardRouting.newShardRouting(indexName, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
