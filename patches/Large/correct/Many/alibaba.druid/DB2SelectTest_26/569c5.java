diff --git a/src/test/java/com/alibaba/druid/bvt/sql/db2/DB2SelectTest_26.java b/src/test/java/com/alibaba/druid/bvt/sql/db2/DB2SelectTest_26.java
index a82e382..74ab58d 100644
--- a/src/test/java/com/alibaba/druid/bvt/sql/db2/DB2SelectTest_26.java
+++ b/src/test/java/com/alibaba/druid/bvt/sql/db2/DB2SelectTest_26.java
@@ -77,7 +77,7 @@
 
         Assert.assertEquals(1, visitor.getTables().size());
         Assert.assertEquals(5, visitor.getColumns().size());
-        Assert.assertEquals(2, visitor.getConditions().size());
+        Assert.assertEquals(3, visitor.getConditions().size());
 
         Assert.assertTrue(visitor.getTables().containsKey(new TableStat.Name("MK.M_BROAD_BAND_USER_FACT")));
 
