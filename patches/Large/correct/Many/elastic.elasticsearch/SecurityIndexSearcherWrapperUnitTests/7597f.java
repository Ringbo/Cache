diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/security/authz/accesscontrol/SecurityIndexSearcherWrapperUnitTests.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/security/authz/accesscontrol/SecurityIndexSearcherWrapperUnitTests.java
index 75847ed..82fbd64 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/security/authz/accesscontrol/SecurityIndexSearcherWrapperUnitTests.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/security/authz/accesscontrol/SecurityIndexSearcherWrapperUnitTests.java
@@ -128,7 +128,7 @@
         indexSettings = IndexSettingsModule.newIndexSettings(index, Settings.EMPTY);
         NamedAnalyzer namedAnalyzer = new NamedAnalyzer("default", AnalyzerScope.INDEX, new StandardAnalyzer());
         IndexAnalyzers indexAnalyzers = new IndexAnalyzers(indexSettings, namedAnalyzer, namedAnalyzer, namedAnalyzer,
-                Collections.emptyMap());
+                Collections.emptyMap(), Collections.emptyMap());
         SimilarityService similarityService = new SimilarityService(indexSettings, Collections.emptyMap());
         mapperService = new MapperService(indexSettings, indexAnalyzers, xContentRegistry(), similarityService,
                 new IndicesModule(emptyList()).getMapperRegistry(), () -> null);
