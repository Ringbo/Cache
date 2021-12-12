diff --git a/sdks/java/io/google-cloud-platform/src/test/java/org/apache/beam/sdk/io/gcp/bigtable/BigtableServiceImplTest.java b/sdks/java/io/google-cloud-platform/src/test/java/org/apache/beam/sdk/io/gcp/bigtable/BigtableServiceImplTest.java
index a805cc7..2a19359 100644
--- a/sdks/java/io/google-cloud-platform/src/test/java/org/apache/beam/sdk/io/gcp/bigtable/BigtableServiceImplTest.java
+++ b/sdks/java/io/google-cloud-platform/src/test/java/org/apache/beam/sdk/io/gcp/bigtable/BigtableServiceImplTest.java
@@ -96,7 +96,7 @@
   public void testRead() throws IOException, InterruptedException {
     ByteKey start = ByteKey.copyFrom("a".getBytes());
     ByteKey end = ByteKey.copyFrom("b".getBytes());
-    when(mockBigtableSource.getRange()).thenReturn(ByteKeyRange.of(start, end));
+    when(mockBigtableSource.getRanges()).thenReturn(Arrays.asList(ByteKeyRange.of(start, end)));
     @SuppressWarnings("unchecked")
     ResultScanner<Row> mockResultScanner = Mockito.mock(ResultScanner.class);
     Row expectedRow = Row.newBuilder()
