diff --git a/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/ShieldIndexSearcherWrapperUnitTests.java b/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/ShieldIndexSearcherWrapperUnitTests.java
index 24143f2..785b7e2 100644
--- a/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/ShieldIndexSearcherWrapperUnitTests.java
+++ b/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/ShieldIndexSearcherWrapperUnitTests.java
@@ -63,7 +63,7 @@
     @Before
     public void before() throws Exception {
         Index index = new Index("_index");
-        IndexSettings indexSettings = IndexSettingsModule.newIndexSettings(index, Settings.EMPTY, Collections.emptyList());
+        IndexSettings indexSettings = IndexSettingsModule.newIndexSettings(index, Settings.EMPTY);
         AnalysisService analysisService = new AnalysisService(indexSettings, Collections.emptyMap(), Collections.emptyMap(),
                 Collections.emptyMap(), Collections.emptyMap());
         SimilarityService similarityService = new SimilarityService(indexSettings, Collections.emptyMap());
@@ -224,7 +224,7 @@
 
     public void testDelegateSimilarity() throws Exception {
         ShardId shardId = new ShardId("_index", 0);
-        IndexSettings settings = IndexSettingsModule.newIndexSettings(new Index("_index"), Settings.EMPTY, Collections.emptyList());
+        IndexSettings settings = IndexSettingsModule.newIndexSettings(new Index("_index"), Settings.EMPTY);
         BitsetFilterCache bitsetFilterCache = new BitsetFilterCache(settings, new IndicesWarmer(settings.getSettings(), null), new BitsetFilterCache.Listener() {
             @Override
             public void onCache(ShardId shardId, Accountable accountable) {
