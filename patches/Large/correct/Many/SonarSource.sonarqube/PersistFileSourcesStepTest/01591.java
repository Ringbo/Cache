diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistFileSourcesStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistFileSourcesStepTest.java
index 6c7c7dc..e17ae72 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistFileSourcesStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistFileSourcesStepTest.java
@@ -81,7 +81,7 @@
   long now = 123456789L;
 
   @Before
-  public void setup() throws Exception {
+  public void setup() {
     dbTester.truncateTables();
     session = dbTester.myBatis().openSession(false);
     dbClient = new DbClient(dbTester.database(), dbTester.myBatis(), new FileSourceDao(dbTester.myBatis()));
@@ -102,7 +102,7 @@
   }
 
   @Test
-  public void persist_sources() throws Exception {
+  public void persist_sources() {
     initBasicReport(2);
 
     sut.execute();
@@ -126,7 +126,7 @@
   }
 
   @Test
-  public void persist_last_line() throws Exception {
+  public void persist_last_line() {
     treeRootHolder.setRoot(DumbComponent.builder(Component.Type.PROJECT, 1).setUuid(PROJECT_UUID).setKey(PROJECT_KEY).addChildren(
       DumbComponent.builder(Component.Type.FILE, FILE_REF).setUuid(FILE_UUID).setKey("PROJECT_KEY:file").build())
       .build());
@@ -155,7 +155,7 @@
   }
 
   @Test
-  public void persist_source_hashes() throws Exception {
+  public void persist_source_hashes() {
     initBasicReport(2);
 
     sut.execute();
@@ -167,7 +167,7 @@
   }
 
   @Test
-  public void persist_coverage() throws Exception {
+  public void persist_coverage() {
     initBasicReport(1);
 
     reportReader.putCoverage(FILE_REF, newArrayList(BatchReport.Coverage.newBuilder()
@@ -200,7 +200,7 @@
   }
 
   @Test
-  public void persist_scm() throws Exception {
+  public void persist_scm() {
     initBasicReport(1);
 
     reportReader.putChangesets(BatchReport.Changesets.newBuilder()
@@ -227,7 +227,7 @@
   }
 
   @Test
-  public void persist_highlighting() throws Exception {
+  public void persist_highlighting() {
     initBasicReport(1);
 
     reportReader.putSyntaxHighlighting(FILE_REF, newArrayList(BatchReport.SyntaxHighlighting.newBuilder()
@@ -251,7 +251,7 @@
   }
 
   @Test
-  public void persist_symbols() throws Exception {
+  public void persist_symbols() {
     initBasicReport(3);
 
     reportReader.putSymbols(FILE_REF, newArrayList(
@@ -279,7 +279,7 @@
   }
 
   @Test
-  public void persist_duplication() throws Exception {
+  public void persist_duplication() {
     initBasicReport(1);
 
     reportReader.putDuplications(FILE_REF, newArrayList(
@@ -309,7 +309,7 @@
   }
 
   @Test
-  public void not_update_sources_when_nothing_has_changed() throws Exception {
+  public void not_update_sources_when_nothing_has_changed() {
     // Existing sources
     long past = 150000L;
     String srcHash = "137f72c3708c6bd0de00a0e5a69c699b";
@@ -347,7 +347,7 @@
   }
 
   @Test
-  public void update_sources_when_source_updated() throws Exception {
+  public void update_sources_when_source_updated() {
     // Existing sources
     long past = 150000L;
     dbClient.fileSourceDao().insert(session, new FileSourceDto()
@@ -378,7 +378,7 @@
   }
 
   @Test
-  public void update_sources_when_src_hash_is_missing() throws Exception {
+  public void update_sources_when_src_hash_is_missing() {
     // Existing sources
     long past = 150000L;
     dbClient.fileSourceDao().insert(session, new FileSourceDto()
@@ -411,7 +411,7 @@
   }
 
   @Test
-  public void display_file_path_when_exception_is_generated() throws Exception {
+  public void display_file_path_when_exception_is_generated() {
     initBasicReport(1);
 
     reportReader.putSyntaxHighlighting(FILE_REF, newArrayList(BatchReport.SyntaxHighlighting.newBuilder()
@@ -432,7 +432,7 @@
     }
   }
 
-  private void initBasicReport(int numberOfLines) throws IOException {
+  private void initBasicReport(int numberOfLines) {
     treeRootHolder.setRoot(DumbComponent.builder(Component.Type.PROJECT, 1).setUuid(PROJECT_UUID).setKey(PROJECT_KEY).addChildren(
       DumbComponent.builder(Component.Type.MODULE, 2).setUuid("MODULE").setKey("MODULE_KEY").addChildren(
         DumbComponent.builder(Component.Type.FILE, FILE_REF).setUuid(FILE_UUID).setKey("MODULE_KEY:src/Foo.java").build())
