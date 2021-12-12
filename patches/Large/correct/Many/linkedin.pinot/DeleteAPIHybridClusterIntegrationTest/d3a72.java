diff --git a/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/DeleteAPIHybridClusterIntegrationTest.java b/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/DeleteAPIHybridClusterIntegrationTest.java
index 606a9ad..3e8aace 100644
--- a/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/DeleteAPIHybridClusterIntegrationTest.java
+++ b/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/DeleteAPIHybridClusterIntegrationTest.java
@@ -77,7 +77,7 @@
   // TODO: Find ways to refactor waitForNumRows and waitForSegmentsToBeInDeleteDirectory
   private void waitForNumRows(long numRows, CommonConstants.Helix.TableType tableType) throws Exception {
     long start = System.currentTimeMillis();
-    long end = start + 600 * 1000;
+    long end = start + 60 * 1000;
     while (System.currentTimeMillis() < end) {
       if (numRowsReturned(tableType) == numRows) {
         return;
