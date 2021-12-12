diff --git a/sonar-core/src/test/java/org/sonar/core/persistence/DryRunDatabaseFactoryTest.java b/sonar-core/src/test/java/org/sonar/core/persistence/DryRunDatabaseFactoryTest.java
index f5cf58d..fda04be 100644
--- a/sonar-core/src/test/java/org/sonar/core/persistence/DryRunDatabaseFactoryTest.java
+++ b/sonar-core/src/test/java/org/sonar/core/persistence/DryRunDatabaseFactoryTest.java
@@ -62,7 +62,7 @@
   public void should_create_database_without_project() throws IOException, SQLException {
     setupData("should_create_database");
 
-    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.getRoot());
+    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.newFolder());
 
     byte[] database = localDatabaseFactory.createDatabaseForDryRun(null);
     dataSource = createDatabase(database);
@@ -75,7 +75,7 @@
   public void should_create_database_with_project() throws IOException, SQLException {
     setupData("should_create_database");
 
-    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.getRoot());
+    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.newFolder());
 
     byte[] database = localDatabaseFactory.createDatabaseForDryRun(123L);
     dataSource = createDatabase(database);
@@ -88,7 +88,7 @@
   public void should_create_database_with_issues() throws IOException, SQLException {
     setupData("should_create_database_with_issues");
 
-    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.getRoot());
+    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.newFolder());
 
     byte[] database = localDatabaseFactory.createDatabaseForDryRun(399L);
     dataSource = createDatabase(database);
@@ -100,7 +100,7 @@
   public void should_export_issues_of_project_tree() throws IOException, SQLException {
     setupData("multi-modules-with-issues");
 
-    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.getRoot());
+    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.newFolder());
 
     // 300 : root module -> export issues of all modules
     byte[] database = localDatabaseFactory.createDatabaseForDryRun(300L);
@@ -112,7 +112,7 @@
   public void should_export_issues_of_sub_module() throws IOException, SQLException {
     setupData("multi-modules-with-issues");
 
-    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.getRoot());
+    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.newFolder());
 
     // 301 : sub module with 1 closed issue and 1 open issue
     byte[] database = localDatabaseFactory.createDatabaseForDryRun(301L);
@@ -124,13 +124,13 @@
   public void should_export_issues_of_sub_module_2() throws IOException, SQLException {
     setupData("multi-modules-with-issues");
 
-    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.getRoot());
+    when(serverFileSystem.getTempDir()).thenReturn(temporaryFolder.newFolder());
 
     // 302 : sub module without any issues
     byte[] database = localDatabaseFactory.createDatabaseForDryRun(302L);
     dataSource = createDatabase(database);
     assertThat(rowCount("issues")).isEqualTo(0);
-    FileUtils.cleanDirectory(temporaryFolder.getRoot());
+    FileUtils.cleanDirectory(temporaryFolder.newFolder());
   }
 
   private BasicDataSource createDatabase(byte[] db) throws IOException {
