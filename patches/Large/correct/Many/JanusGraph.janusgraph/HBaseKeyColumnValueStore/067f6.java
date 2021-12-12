diff --git a/titan-hbase-parent/titan-hbase-core/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java b/titan-hbase-parent/titan-hbase-core/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java
index e65ab06..c2d7a0b 100644
--- a/titan-hbase-parent/titan-hbase-core/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java
+++ b/titan-hbase-parent/titan-hbase-core/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseKeyColumnValueStore.java
@@ -115,7 +115,7 @@
     }
 
     public static Filter getFilter(SliceQuery query) {
-        byte[] colStartBytes = query.getSliceEnd().length() > 0 ? query.getSliceStart().as(StaticBuffer.ARRAY_FACTORY) : null;
+        byte[] colStartBytes = query.getSliceStart().length() > 0 ? query.getSliceStart().as(StaticBuffer.ARRAY_FACTORY) : null;
         byte[] colEndBytes = query.getSliceEnd().length() > 0 ? query.getSliceEnd().as(StaticBuffer.ARRAY_FACTORY) : null;
 
         Filter filter = new ColumnRangeFilter(colStartBytes, true, colEndBytes, false);
