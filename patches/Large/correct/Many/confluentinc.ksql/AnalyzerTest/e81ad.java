diff --git a/ksql-engine/src/test/java/io/confluent/ksql/analyzer/AnalyzerTest.java b/ksql-engine/src/test/java/io/confluent/ksql/analyzer/AnalyzerTest.java
index 4e6cdf6..dc7ef85 100644
--- a/ksql-engine/src/test/java/io/confluent/ksql/analyzer/AnalyzerTest.java
+++ b/ksql-engine/src/test/java/io/confluent/ksql/analyzer/AnalyzerTest.java
@@ -208,7 +208,7 @@
     final String simpleQuery = "CREATE STREAM FOO WITH (KAFKA_TOPIC='TEST_TOPIC1') AS SELECT col0, col2, col3 FROM test1 WHERE col0 > 100;";
     // The following few lines are only needed for this test
     final MetaStore testMetastore = metaStore.clone();
-    final KsqlTopic ksqlTopic = new KsqlTopic("FOO", "TEST_TOPIC1", new KsqlJsonTopicSerDe());
+    final KsqlTopic ksqlTopic = new KsqlTopic("FOO", "TEST_TOPIC1", new KsqlJsonTopicSerDe(), true);
     testMetastore.putTopic(ksqlTopic);
     final List<Statement> statements = getPreparedStatements(simpleQuery, testMetastore)
         .stream()
