diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/batch/BatchReportReaderImplTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/batch/BatchReportReaderImplTest.java
index f09ed4b..ebcf74b 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/batch/BatchReportReaderImplTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/batch/BatchReportReaderImplTest.java
@@ -62,7 +62,7 @@
   private FileStructure fileStructure;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     BatchReportDirectoryHolder holder = new ImmutableBatchReportDirectoryHolder(tempFolder.newDir());
     underTest = new BatchReportReaderImpl(holder);
     writer = new BatchReportWriter(holder.getDirectory());
@@ -257,7 +257,7 @@
   }
 
   @Test
-  public void verify_readTests() throws IOException {
+  public void verify_readTests() {
     writer.writeTests(COMPONENT_REF, of(TEST_1, TEST_2));
 
     CloseableIterator<BatchReport.Test> res = underTest.readTests(COMPONENT_REF);
@@ -271,7 +271,7 @@
   }
 
   @Test
-  public void verify_readCoverageDetails() throws IOException {
+  public void verify_readCoverageDetails() {
     writer.writeCoverageDetails(COMPONENT_REF, of(COVERAGE_DETAIL_1, COVERAGE_DETAIL_2));
 
     CloseableIterator<BatchReport.CoverageDetail> res = underTest.readCoverageDetails(COMPONENT_REF);
