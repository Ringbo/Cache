diff --git a/test/unit/org/apache/cassandra/service/QueryPagerTest.java b/test/unit/org/apache/cassandra/service/QueryPagerTest.java
index c78412f..1939c4a 100644
--- a/test/unit/org/apache/cassandra/service/QueryPagerTest.java
+++ b/test/unit/org/apache/cassandra/service/QueryPagerTest.java
@@ -146,7 +146,7 @@
     private static RangeSliceCommand rangeSliceQuery(AbstractBounds<RowPosition> range, int count, String start, String end)
     {
         SliceQueryFilter filter = new SliceQueryFilter(CellNames.simpleDense(bytes(start)), CellNames.simpleDense(bytes(end)), false, Integer.MAX_VALUE);
-        return new RangeSliceCommand(KS, CF, System.currentTimeMillis(), filter, range, count);
+        return new RangeSliceCommand(KS, CF, System.currentTimeMillis(), filter, range, null, count, true, false);
     }
 
     private static void assertRow(Row r, String key, String... names)
