diff --git a/sql/src/test/java/io/crate/integrationtests/InformationSchemaTest.java b/sql/src/test/java/io/crate/integrationtests/InformationSchemaTest.java
index dbc50b8..42f4f60 100644
--- a/sql/src/test/java/io/crate/integrationtests/InformationSchemaTest.java
+++ b/sql/src/test/java/io/crate/integrationtests/InformationSchemaTest.java
@@ -437,7 +437,7 @@
     @Test
     public void testDefaultColumns() throws Exception {
         execute("select * from information_schema.columns order by schema_name, table_name");
-        assertEquals(258L, response.rowCount());
+        assertEquals(265L, response.rowCount());
     }
 
     @Test
@@ -557,7 +557,7 @@
         execute("select max(ordinal_position) from information_schema.columns");
         assertEquals(1, response.rowCount());
 
-        short max_ordinal = 79;
+        short max_ordinal = 85;
         assertEquals(max_ordinal, response.rows()[0][0]);
 
         execute("create table t1 (id integer, col1 string)");
