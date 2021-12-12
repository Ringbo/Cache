diff --git a/sql/src/test/java/org/cratedb/integrationtests/TransportSQLActionTest.java b/sql/src/test/java/org/cratedb/integrationtests/TransportSQLActionTest.java
index 16072c3..07b2504 100644
--- a/sql/src/test/java/org/cratedb/integrationtests/TransportSQLActionTest.java
+++ b/sql/src/test/java/org/cratedb/integrationtests/TransportSQLActionTest.java
@@ -355,10 +355,10 @@
     @Test
     public void testSelectObject() throws Exception {
         createIndex("test");
-        client().prepareIndex("test", "default", "id1").setRefresh(true)
+        client().prepareIndex("test", "default", "id1")
                 .setSource("{\"a\":{\"nested\":2}}")
                 .execute().actionGet();
-        ensureGreen();
+        refresh();
 
         execute("select a from test");
         assertArrayEquals(new String[]{"a"}, response.cols());
