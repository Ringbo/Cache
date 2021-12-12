diff --git a/exec/java-exec/src/test/java/org/apache/drill/TestCTASPartitionFilter.java b/exec/java-exec/src/test/java/org/apache/drill/TestCTASPartitionFilter.java
index 1f53a81..9886024 100644
--- a/exec/java-exec/src/test/java/org/apache/drill/TestCTASPartitionFilter.java
+++ b/exec/java-exec/src/test/java/org/apache/drill/TestCTASPartitionFilter.java
@@ -74,7 +74,7 @@
     test("use dfs_test.tmp");
     test(String.format("create table drill_3410 partition by (o_orderpriority) as select * from dfs_test.`%s/multilevel/parquet`", TEST_RES_PATH));
     String query = "select * from drill_3410 where (o_orderpriority = '1-URGENT' and o_orderkey = 10) or (o_orderpriority = '2-HIGH' or o_orderkey = 11)";
-    testIncludeFilter(query, 5, "Filter", 34);
+    testIncludeFilter(query, 1, "Filter", 34);
   }
 
   @Test
