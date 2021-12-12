diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestHRegion.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestHRegion.java
index 7f03d85..e6d1708 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestHRegion.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestHRegion.java
@@ -1542,7 +1542,7 @@
       Delete delete = new Delete(row1);
       delete.deleteColumn(fam1, qf1);
       res = region.checkAndMutate(row1, fam1, qf1, CompareOp.EQUAL, new BinaryComparator(val1),
-          put, true);
+          delete, true);
       assertEquals(true, res);
     } finally {
       HRegion.closeHRegion(this.region);
