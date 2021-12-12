diff --git a/processing/src/main/java/io/druid/query/groupby/GroupByQueryEngine.java b/processing/src/main/java/io/druid/query/groupby/GroupByQueryEngine.java
index ea58501..b8f63a5 100644
--- a/processing/src/main/java/io/druid/query/groupby/GroupByQueryEngine.java
+++ b/processing/src/main/java/io/druid/query/groupby/GroupByQueryEngine.java
@@ -182,7 +182,7 @@
 
         final DimensionSelector dimSelector = dims.get(0);
         final IndexedInts row = dimSelector.getRow();
-        if (row.size() == 0) {
+        if (row == null || row.size() == 0) {
           ByteBuffer newKey = key.duplicate();
           newKey.putInt(dimSelector.getValueCardinality());
           unaggregatedBuffers = updateValues(newKey, dims.subList(1, dims.size()));
