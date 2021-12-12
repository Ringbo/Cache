diff --git a/src/test/java/com/alibaba/druid/bvt/sql/db2/DB2InsertTest_1.java b/src/test/java/com/alibaba/druid/bvt/sql/db2/DB2InsertTest_1.java
index 6648239..7743aa5 100644
--- a/src/test/java/com/alibaba/druid/bvt/sql/db2/DB2InsertTest_1.java
+++ b/src/test/java/com/alibaba/druid/bvt/sql/db2/DB2InsertTest_1.java
@@ -93,7 +93,7 @@
 
         Assert.assertEquals(2, visitor.getTables().size());
         Assert.assertEquals(11, visitor.getColumns().size());
-        Assert.assertEquals(3, visitor.getConditions().size());
+        Assert.assertEquals(4, visitor.getConditions().size());
 
         Assert.assertTrue(visitor.getTables().containsKey(new TableStat.Name("MK.KPI_AREA_SORT_FACT_LATN_ID_MID")));
 
