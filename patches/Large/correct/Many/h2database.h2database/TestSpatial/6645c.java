diff --git a/h2/src/test/org/h2/test/db/TestSpatial.java b/h2/src/test/org/h2/test/db/TestSpatial.java
index 9b43f6f..6277e41 100644
--- a/h2/src/test/org/h2/test/db/TestSpatial.java
+++ b/h2/src/test/org/h2/test/db/TestSpatial.java
@@ -1081,7 +1081,7 @@
 
     public void testIndexUpdateNullGeometry() throws SQLException {
         deleteDb("spatial");
-        Connection conn = getConnection(url);
+        Connection conn = getConnection(URL);
         Statement stat = conn.createStatement();
         stat.execute("drop table if exists DUMMY_11;");
         stat.execute("CREATE TABLE PUBLIC.DUMMY_11 (fid serial,  GEOM GEOMETRY);");
@@ -1119,7 +1119,7 @@
 
     public void testInsertNull() throws SQLException {
         deleteDb("spatial");
-        Connection conn = getConnection(url);
+        Connection conn = getConnection(URL);
         Statement stat = conn.createStatement();
         stat.execute("\n" +
                 "drop table if exists PUBLIC.DUMMY_12;\n" +
