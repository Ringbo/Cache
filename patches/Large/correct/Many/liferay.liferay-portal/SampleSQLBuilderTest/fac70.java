diff --git a/modules/util/portal-tools-sample-sql-builder/test/unit/com/liferay/portal/tools/sample/sql/builder/SampleSQLBuilderTest.java b/modules/util/portal-tools-sample-sql-builder/test/unit/com/liferay/portal/tools/sample/sql/builder/SampleSQLBuilderTest.java
index 137e558..ebf9ece 100644
--- a/modules/util/portal-tools-sample-sql-builder/test/unit/com/liferay/portal/tools/sample/sql/builder/SampleSQLBuilderTest.java
+++ b/modules/util/portal-tools-sample-sql-builder/test/unit/com/liferay/portal/tools/sample/sql/builder/SampleSQLBuilderTest.java
@@ -52,7 +52,7 @@
 	public void testGenerateAndInsertSampleSQL() throws Exception {
 		ToolDependencies.wireBasic();
 
-		DBFactoryUtil.setDB(DB.TYPE_HYPERSONIC);
+		DBFactoryUtil.setDB(DB.TYPE_HYPERSONIC, null);
 
 		Properties properties = new SortedProperties();
 
@@ -174,7 +174,7 @@
 	private void _loadServiceComponentsSQL(Connection connection)
 		throws Exception {
 
-		DBFactoryUtil.setDB(DB.TYPE_HYPERSONIC);
+		DBFactoryUtil.setDB(DB.TYPE_HYPERSONIC, null);
 
 		Enumeration<URL> tablesURLs = _getServiceComponentsTablesSQLURLs();
 
