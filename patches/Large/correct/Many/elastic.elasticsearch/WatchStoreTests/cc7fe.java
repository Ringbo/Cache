diff --git a/watcher/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java b/watcher/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java
index 1720a0f..cfe0684 100644
--- a/watcher/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java
+++ b/watcher/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java
@@ -80,7 +80,7 @@
                 .build();
         metaDateBuilder.put(IndexMetaData.builder(WatchStore.INDEX).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(WatchStore.INDEX);
-        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0), false)
+        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0))
                 .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, null, true, ShardRoutingState.UNASSIGNED, 1, new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, "")))
                 .build());
         indexRoutingTableBuilder.addReplica();
@@ -104,7 +104,7 @@
                 .build();
         metaDateBuilder.put(IndexMetaData.builder(WatchStore.INDEX).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(WatchStore.INDEX);
-        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0), false)
+        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0))
                 .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
@@ -139,7 +139,7 @@
                 .build();
         metaDateBuilder.put(IndexMetaData.builder(WatchStore.INDEX).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(WatchStore.INDEX);
-        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0), false)
+        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0))
                 .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
@@ -178,7 +178,7 @@
                 .build();
         metaDateBuilder.put(IndexMetaData.builder(WatchStore.INDEX).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(WatchStore.INDEX);
-        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0), false)
+        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0))
                 .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
@@ -215,7 +215,7 @@
                 .build();
         metaDateBuilder.put(IndexMetaData.builder(WatchStore.INDEX).settings(settings).numberOfShards(1).numberOfReplicas(1));
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(WatchStore.INDEX);
-        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0), false)
+        indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(WatchStore.INDEX, 0))
                 .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
                 .build());
         indexRoutingTableBuilder.addReplica();
