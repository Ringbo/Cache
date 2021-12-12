diff --git a/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/ForEachProcessorTests.java b/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/ForEachProcessorTests.java
index 3f9ee8b..524b131 100644
--- a/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/ForEachProcessorTests.java
+++ b/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/ForEachProcessorTests.java
@@ -203,7 +203,7 @@
         ));
         processor.execute(ingestDocument);
 
-        List<String> result = ingestDocument.getFieldValue("values", List.class);
+        List<Object> result = ingestDocument.getFieldValue("values", List.class);
         assertThat(result.get(0), equalTo("STRING"));
         assertThat(result.get(1), equalTo(1));
         assertThat(result.get(2), equalTo(null));
