diff --git a/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/ShieldIndexSearcherWrapperIntegrationTests.java b/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/ShieldIndexSearcherWrapperIntegrationTests.java
index f1ecc74..001cb71 100644
--- a/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/ShieldIndexSearcherWrapperIntegrationTests.java
+++ b/shield/src/test/java/org/elasticsearch/shield/authz/accesscontrol/ShieldIndexSearcherWrapperIntegrationTests.java
@@ -80,9 +80,9 @@
         RequestContext.setCurrent(new RequestContext(request));
         IndicesAccessControl.IndexAccessControl indexAccessControl = new IndicesAccessControl.IndexAccessControl(true, null, singleton(new BytesArray("{}")));
         request.putInContext(InternalAuthorizationService.INDICES_PERMISSIONS_KEY, new IndicesAccessControl(true, singletonMap("_index", indexAccessControl)));
-        IndexSettings indexSettings = IndexSettingsModule.newIndexSettings(shardId.index(), Settings.EMPTY, Collections.EMPTY_LIST);
+        IndexSettings indexSettings = IndexSettingsModule.newIndexSettings(shardId.index(), Settings.EMPTY);
         QueryShardContext queryShardContext = mock(QueryShardContext.class);
-        IndexSettings settings = IndexSettingsModule.newIndexSettings(new Index("_index"), Settings.EMPTY, Collections.EMPTY_LIST);
+        IndexSettings settings = IndexSettingsModule.newIndexSettings(new Index("_index"), Settings.EMPTY);
         BitsetFilterCache bitsetFilterCache = new BitsetFilterCache(settings, new IndicesWarmer(settings.getSettings(), null), new BitsetFilterCache.Listener() {
             @Override
             public void onCache(ShardId shardId, Accountable accountable) {
