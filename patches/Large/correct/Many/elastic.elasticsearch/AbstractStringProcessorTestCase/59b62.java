diff --git a/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/AbstractStringProcessorTestCase.java b/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/AbstractStringProcessorTestCase.java
index d48c795..9d37f27 100644
--- a/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/AbstractStringProcessorTestCase.java
+++ b/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/AbstractStringProcessorTestCase.java
@@ -103,10 +103,10 @@
     }
 
     public void testTargetField() throws Exception {
-        IngestDocument ingestDocument = RandomDocumentPicks.randomIngestDocument(random());
+        IngestDocument ingestDocument = RandomDocumentPicks.randomIngestDocument(random(), Collections.emptyMap());
         String fieldValue = RandomDocumentPicks.randomString(random());
         String fieldName = RandomDocumentPicks.addRandomField(random(), ingestDocument, modifyInput(fieldValue));
-        String targetFieldName = RandomDocumentPicks.randomFieldName(random());
+        String targetFieldName = fieldName + "foo";
         Processor processor = newProcessor(fieldName, randomBoolean(), targetFieldName);
         processor.execute(ingestDocument);
         assertThat(ingestDocument.getFieldValue(targetFieldName, String.class), equalTo(expectedResult(fieldValue)));
