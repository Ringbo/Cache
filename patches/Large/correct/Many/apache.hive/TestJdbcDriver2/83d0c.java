diff --git a/jdbc/src/test/org/apache/hive/jdbc/TestJdbcDriver2.java b/jdbc/src/test/org/apache/hive/jdbc/TestJdbcDriver2.java
index c658dbd..bb36337 100644
--- a/jdbc/src/test/org/apache/hive/jdbc/TestJdbcDriver2.java
+++ b/jdbc/src/test/org/apache/hive/jdbc/TestJdbcDriver2.java
@@ -789,7 +789,7 @@
   }
 
   public void testMetaDataGetTables() throws SQLException {
-    getTablesTest(TableType.MANAGED_TABLE.toString(), TableType.VIRTUAL_VIEW.toString());
+    getTablesTest(ClassicTableTypes.TABLE.toString(), ClassicTableTypes.VIEW.toString());
   }
 
   public  void testMetaDataGetTablesHive() throws SQLException {
@@ -807,6 +807,13 @@
     getTablesTest(ClassicTableTypes.TABLE.toString(), ClassicTableTypes.VIEW.toString());
   }
 
+  /**
+   * Test the type returned for pre-created table type table and view type
+   * table
+   * @param tableTypeName expected table type
+   * @param viewTypeName expected view type
+   * @throws SQLException
+   */
   private void getTablesTest(String tableTypeName, String viewTypeName) throws SQLException {
     Map<String, Object[]> tests = new HashMap<String, Object[]>();
     tests.put("test%jdbc%", new Object[]{"testhivejdbcdriver_table"
@@ -887,10 +894,14 @@
     rs.close();
   }
 
+  //test default table types returned in
+  // Connection.getMetaData().getTableTypes()
   public void testMetaDataGetTableTypes() throws SQLException {
-    metaDataGetTableTypeTest(new HiveTableTypeMapping().getTableTypeNames());
+    metaDataGetTableTypeTest(new ClassicTableTypeMapping().getTableTypeNames());
   }
 
+  //test default table types returned in
+  // Connection.getMetaData().getTableTypes() when type config is set to "HIVE"
   public void testMetaDataGetHiveTableTypes() throws SQLException {
     Statement stmt = con.createStatement();
     stmt.execute("set " + HiveConf.ConfVars.HIVE_SERVER2_TABLE_TYPE_MAPPING.varname +
@@ -899,6 +910,8 @@
     metaDataGetTableTypeTest(new HiveTableTypeMapping().getTableTypeNames());
   }
 
+  //test default table types returned in
+  // Connection.getMetaData().getTableTypes() when type config is set to "CLASSIC"
   public void testMetaDataGetClassicTableTypes() throws SQLException {
     Statement stmt = con.createStatement();
     stmt.execute("set " + HiveConf.ConfVars.HIVE_SERVER2_TABLE_TYPE_MAPPING.varname +
@@ -907,6 +920,12 @@
     metaDataGetTableTypeTest(new ClassicTableTypeMapping().getTableTypeNames());
   }
 
+  /**
+   * Test if Connection.getMetaData().getTableTypes() returns expected
+   *  tabletypes
+   * @param tabletypes expected table types
+   * @throws SQLException
+   */
   private void metaDataGetTableTypeTest(Set<String> tabletypes)
       throws SQLException {
     ResultSet rs = (ResultSet)con.getMetaData().getTableTypes();
