diff --git a/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java b/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java
index 09f3440..e1c7cad 100644
--- a/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java
+++ b/core/src/test/java/org/elasticsearch/index/shard/IndexShardTests.java
@@ -697,7 +697,7 @@
         IndexService test = indicesService.indexService("test");
         IndexShard shard = test.getShardOrNull(0);
         assertFalse(shard.shouldFlush());
-        client().admin().indices().prepareUpdateSettings("test").setSettings(settingsBuilder().put(IndexShard.INDEX_TRANSLOG_FLUSH_THRESHOLD_SIZE, new ByteSizeValue(1, ByteSizeUnit.BYTES)).build()).get();
+        client().admin().indices().prepareUpdateSettings("test").setSettings(settingsBuilder().put(IndexShard.INDEX_TRANSLOG_FLUSH_THRESHOLD_SIZE, new ByteSizeValue(133 /* size of the operation + header&footer*/, ByteSizeUnit.BYTES)).build()).get();
         client().prepareIndex("test", "test", "0").setSource("{}").setRefresh(randomBoolean()).get();
         assertFalse(shard.shouldFlush());
         ParsedDocument doc = testParsedDocument("1", "1", "test", null, -1, -1, new ParseContext.Document(), new BytesArray(new byte[]{1}), null);
@@ -731,7 +731,7 @@
         IndexService test = indicesService.indexService("test");
         final IndexShard shard = test.getShardOrNull(0);
         assertFalse(shard.shouldFlush());
-        client().admin().indices().prepareUpdateSettings("test").setSettings(settingsBuilder().put(IndexShard.INDEX_TRANSLOG_FLUSH_THRESHOLD_SIZE, new ByteSizeValue(1, ByteSizeUnit.BYTES)).build()).get();
+        client().admin().indices().prepareUpdateSettings("test").setSettings(settingsBuilder().put(IndexShard.INDEX_TRANSLOG_FLUSH_THRESHOLD_SIZE, new ByteSizeValue(133/* size of the operation + header&footer*/, ByteSizeUnit.BYTES)).build()).get();
         client().prepareIndex("test", "test", "0").setSource("{}").setRefresh(randomBoolean()).get();
         assertFalse(shard.shouldFlush());
         final AtomicBoolean running = new AtomicBoolean(true);
