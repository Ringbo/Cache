diff --git a/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/DocumentSubsetReaderTests.java b/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/DocumentSubsetReaderTests.java
index 0149ff8..26ffdb7 100644
--- a/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/DocumentSubsetReaderTests.java
+++ b/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/DocumentSubsetReaderTests.java
@@ -42,7 +42,7 @@
     @Before
     public void before() {
         directory = newDirectory();
-        IndexSettings settings = IndexSettingsModule.newIndexSettings(new Index("_index"), Settings.EMPTY, Collections.EMPTY_LIST);
+        IndexSettings settings = IndexSettingsModule.newIndexSettings(new Index("_index"), Settings.EMPTY);
         bitsetFilterCache = new BitsetFilterCache(settings, new IndicesWarmer(settings.getSettings(), null), new BitsetFilterCache.Listener() {
             @Override
             public void onCache(ShardId shardId, Accountable accountable) {
@@ -157,7 +157,7 @@
         IndexWriterConfig iwc = new IndexWriterConfig(null);
         IndexWriter iw = new IndexWriter(dir, iwc);
         iw.close();
-        IndexSettings settings = IndexSettingsModule.newIndexSettings(new Index("_index"), Settings.EMPTY, Collections.EMPTY_LIST);
+        IndexSettings settings = IndexSettingsModule.newIndexSettings(new Index("_index"), Settings.EMPTY);
         BitsetFilterCache bitsetFilterCache = new BitsetFilterCache(settings, new IndicesWarmer(settings.getSettings(), null), new BitsetFilterCache.Listener() {
             @Override
             public void onCache(ShardId shardId, Accountable accountable) {
