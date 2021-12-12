diff --git a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
index 31a65a4..e5cf4ad 100644
--- a/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
+++ b/elasticsearch/x-pack/watcher/src/test/java/org/elasticsearch/watcher/execution/TriggeredWatchStoreTests.java
@@ -101,7 +101,7 @@
                 state = ShardRoutingState.UNASSIGNED;
             }
             indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(index, 0))
-                    .addShard(TestShardRouting.newShardRouting(index, 0, "_node_id", null, null, true, state, 1, new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, "")))
+                    .addShard(TestShardRouting.newShardRouting(index, 0, "_node_id", null, null, true, state, new UnassignedInfo(UnassignedInfo.Reason.INDEX_CREATED, "")))
                     .build());
             indexRoutingTableBuilder.addReplica();
         }
@@ -135,7 +135,7 @@
         final Index index = metaDateBuilder.get(TriggeredWatchStore.INDEX_NAME).getIndex();
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(index);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(index, 0))
-                .addShard(TestShardRouting.newShardRouting(index, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(TestShardRouting.newShardRouting(index, 0, "_node_id", null, true, ShardRoutingState.STARTED))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -169,7 +169,7 @@
         final Index index = metaDateBuilder.get(TriggeredWatchStore.INDEX_NAME).getIndex();
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(index);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(index, 0))
-                .addShard(TestShardRouting.newShardRouting(index, 0, "_node_name", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(TestShardRouting.newShardRouting(index, 0, "_node_name", null, true, ShardRoutingState.STARTED))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -212,7 +212,7 @@
         final Index index = metaDateBuilder.get(TriggeredWatchStore.INDEX_NAME).getIndex();
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(index);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(index, 0))
-                .addShard(TestShardRouting.newShardRouting(index, 0, "_node_name", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(TestShardRouting.newShardRouting(index, 0, "_node_name", null, true, ShardRoutingState.STARTED))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
@@ -254,7 +254,7 @@
         final Index index = metaDateBuilder.get(TriggeredWatchStore.INDEX_NAME).getIndex();
         IndexRoutingTable.Builder indexRoutingTableBuilder = IndexRoutingTable.builder(index);
         indexRoutingTableBuilder.addIndexShard(new IndexShardRoutingTable.Builder(new ShardId(index, 0))
-                .addShard(TestShardRouting.newShardRouting(index, 0, "_node_id", null, true, ShardRoutingState.STARTED, 1))
+                .addShard(TestShardRouting.newShardRouting(index, 0, "_node_id", null, true, ShardRoutingState.STARTED))
                 .build());
         indexRoutingTableBuilder.addReplica();
         routingTableBuilder.add(indexRoutingTableBuilder.build());
