diff --git a/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java b/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
index 77789fb..b5e0322 100644
--- a/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
+++ b/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
@@ -98,7 +98,7 @@
                 state = ShardRoutingState.UNASSIGNED;
             }
             indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0), false)
-                    .addShard(new ImmutableShardRouting(indexName, 0, "_node_id", null, null, true, state, 1, new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, "")))
+                    .addShard(new ShardRouting(indexName, 0, "_node_id", null, null, true, state, 1, new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, "")))
                     .build());
             indexRoutingTableBuilder.addReplica();
         }
@@ -133,7 +133,7 @@
         metaDateBuilder.put(IndexMetaData.builder(indexName).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(indexName);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0), false)
-                .addShard(new ImmutableShardRouting(indexName, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(new ShardRouting(indexName, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -168,7 +168,7 @@
         metaDateBuilder.put(IndexMetaData.builder(indexName).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(indexName);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0), false)
-                .addShard(new ImmutableShardRouting(indexName, 0, "_node_name", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(new ShardRouting(indexName, 0, "_node_name", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -212,7 +212,7 @@
         metaDateBuilder.put(IndexMetaData.builder(indexName).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(indexName);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0), false)
-                .addShard(new ImmutableShardRouting(indexName, 0, "_node_name", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(new ShardRouting(indexName, 0, "_node_name", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -255,7 +255,7 @@
         metaDateBuilder.put(IndexMetaData.builder(indexName).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(indexName);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(indexName, 0), false)
-                .addShard(new ImmutableShardRouting(indexName, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(new ShardRouting(indexName, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
