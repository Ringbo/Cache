diff --git a/src/test/java/org/apache/hadoop/hbase/client/TestHTablePool.java b/src/test/java/org/apache/hadoop/hbase/client/TestHTablePool.java
index a55935b..d01043c 100644
--- a/src/test/java/org/apache/hadoop/hbase/client/TestHTablePool.java
+++ b/src/test/java/org/apache/hadoop/hbase/client/TestHTablePool.java
@@ -52,7 +52,7 @@
   }
 
   @Test
-  public void testTableWithStringName() {
+  public void testTableWithStringName() throws Exception {
     HTablePool pool =
       new HTablePool(TEST_UTIL.getConfiguration(), Integer.MAX_VALUE);
     String tableName = Bytes.toString(TABLENAME);
@@ -86,7 +86,7 @@
   }
 
   @Test
-  public void testTableWithMaxSize() {
+  public void testTableWithMaxSize() throws Exception {
     HTablePool pool = new HTablePool(TEST_UTIL.getConfiguration(), 2);
 
     // Request tables from an empty pool
