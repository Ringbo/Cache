diff --git a/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/SortProcessorTests.java b/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/SortProcessorTests.java
index 8fa3f90..5eca68f 100644
--- a/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/SortProcessorTests.java
+++ b/modules/ingest-common/src/test/java/org/elasticsearch/ingest/common/SortProcessorTests.java
@@ -276,7 +276,7 @@
     }
 
     public void testDescendingSortWithTargetField() throws Exception {
-        IngestDocument ingestDocument = RandomDocumentPicks.randomIngestDocument(random());
+        IngestDocument ingestDocument = RandomDocumentPicks.randomIngestDocument(random(), Collections.emptyMap());
         int numItems = randomIntBetween(1, 10);
         List<String> fieldValue = new ArrayList<>(numItems);
         List<String> expectedResult = new ArrayList<>(numItems);
@@ -289,7 +289,7 @@
         Collections.sort(expectedResult, Collections.reverseOrder());
 
         String fieldName = RandomDocumentPicks.addRandomField(random(), ingestDocument, fieldValue);
-        String targetFieldName = RandomDocumentPicks.randomFieldName(random());
+        String targetFieldName = fieldName + "foo";
         Processor processor = new SortProcessor(randomAlphaOfLength(10), fieldName,
             SortOrder.DESCENDING, targetFieldName);
         processor.execute(ingestDocument);
@@ -297,7 +297,7 @@
     }
 
     public void testAscendingSortWithTargetField() throws Exception {
-        IngestDocument ingestDocument = RandomDocumentPicks.randomIngestDocument(random());
+        IngestDocument ingestDocument = RandomDocumentPicks.randomIngestDocument(random(), Collections.emptyMap());
         int numItems = randomIntBetween(1, 10);
         List<String> fieldValue = new ArrayList<>(numItems);
         List<String> expectedResult = new ArrayList<>(numItems);
@@ -310,7 +310,7 @@
         Collections.sort(expectedResult);
 
         String fieldName = RandomDocumentPicks.addRandomField(random(), ingestDocument, fieldValue);
-        String targetFieldName = RandomDocumentPicks.randomFieldName(random());
+        String targetFieldName = fieldName + "foo";
         Processor processor = new SortProcessor(randomAlphaOfLength(10), fieldName,
             SortOrder.ASCENDING, targetFieldName);
         processor.execute(ingestDocument);
@@ -318,7 +318,7 @@
     }
 
     public void testSortWithTargetFieldLeavesOriginalUntouched() throws Exception {
-        IngestDocument ingestDocument = RandomDocumentPicks.randomIngestDocument(random());
+        IngestDocument ingestDocument = RandomDocumentPicks.randomIngestDocument(random(), Collections.emptyMap());
         List<Integer> fieldValue = Arrays.asList(1, 5, 4);
         List<Integer> expectedResult = new ArrayList<>(fieldValue);
         Collections.sort(expectedResult);
