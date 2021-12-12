diff --git a/sdks/java/io/google-cloud-platform/src/test/java/org/apache/beam/sdk/io/gcp/bigquery/FakeDatasetService.java b/sdks/java/io/google-cloud-platform/src/test/java/org/apache/beam/sdk/io/gcp/bigquery/FakeDatasetService.java
index 33a24e7..9d0692a 100644
--- a/sdks/java/io/google-cloud-platform/src/test/java/org/apache/beam/sdk/io/gcp/bigquery/FakeDatasetService.java
+++ b/sdks/java/io/google-cloud-platform/src/test/java/org/apache/beam/sdk/io/gcp/bigquery/FakeDatasetService.java
@@ -46,7 +46,7 @@
 import org.apache.beam.sdk.values.ValueInSingleWindow;
 
 /** A fake dataset service that can be serialized, for use in testReadFromTable. */
-class FakeDatasetService implements DatasetService, Serializable {
+public class FakeDatasetService implements DatasetService, Serializable {
   // Table information must be static, as each ParDo will get a separate instance of
   // FakeDatasetServices, and they must all modify the same storage.
   static com.google.common.collect.Table<String, String, Map<String, TableContainer>> tables;
@@ -73,7 +73,7 @@
     }
   }
 
-  List<TableRow> getAllRows(String projectId, String datasetId, String tableId)
+  public List<TableRow> getAllRows(String projectId, String datasetId, String tableId)
       throws InterruptedException, IOException {
     synchronized (tables) {
       return getTableContainer(projectId, datasetId, tableId).getRows();
