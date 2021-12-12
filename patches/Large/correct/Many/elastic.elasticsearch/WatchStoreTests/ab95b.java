diff --git a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java
index 2143b8b..0e67875 100644
--- a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java
+++ b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/watch/WatchStoreTests.java
@@ -90,7 +90,7 @@
         final Index index = metaDateBuilder.get(WatchStore.INDEX).getIndex();
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(index);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(index, 0))
-                .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, null, true, ShardRoutingState.UNASSIGNED, 1, new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, "")))
+                .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, null, true, ShardRoutingState.UNASSIGNED, new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, "")))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -114,7 +114,7 @@
         final Index index = metaDateBuilder.get(WatchStore.INDEX).getIndex();
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(index);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(index, 0))
-                .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -149,7 +149,7 @@
         final Index index = metaDateBuilder.get(WatchStore.INDEX).getIndex();
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(index);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(index, 0))
-                .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -188,7 +188,7 @@
         final Index index = metaDateBuilder.get(WatchStore.INDEX).getIndex();
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(index);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(index, 0))
-                .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -225,7 +225,7 @@
         final Index index = metaDateBuilder.get(WatchStore.INDEX).getIndex();
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(index);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(index, 0))
-                .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(TestShardRouting.newShardRouting(WatchStore.INDEX, 0, "_node_id", null, true, ShardRoutingState.STARTED))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
