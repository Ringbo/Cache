diff --git a/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java b/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java
index 5a5a7b3..8e6c7ca 100644
--- a/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java
+++ b/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java
@@ -88,7 +88,7 @@
         metaDateBuilder.put(IndexMetaData.builder(WatchStore.INDEX).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(WatchStore.INDEX);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0), false)
-                .addShard(new ImmutableShardRouting(WatchStore.INDEX, 0, "_node_id", null, null, true, ShardRoutingState.UNASSIGNED, 1, new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, "")))
+                .addShard(new ShardRouting(WatchStore.INDEX, 0, "_node_id", null, null, true, ShardRoutingState.UNASSIGNED, 1, new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, "")))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -113,7 +113,7 @@
         metaDateBuilder.put(IndexMetaData.builder(WatchStore.INDEX).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(WatchStore.INDEX);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0), false)
-                .addShard(new ImmutableShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(new ShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -149,7 +149,7 @@
         metaDateBuilder.put(IndexMetaData.builder(WatchStore.INDEX).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(WatchStore.INDEX);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0), false)
-                .addShard(new ImmutableShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(new ShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -189,7 +189,7 @@
         metaDateBuilder.put(IndexMetaData.builder(WatchStore.INDEX).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(WatchStore.INDEX);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0), false)
-                .addShard(new ImmutableShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(new ShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -227,7 +227,7 @@
         metaDateBuilder.put(IndexMetaData.builder(WatchStore.INDEX).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(WatchStore.INDEX);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0), false)
-                .addShard(new ImmutableShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(new ShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
