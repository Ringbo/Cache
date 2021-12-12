diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/StoreScanner.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/StoreScanner.java
index 7ce4e0b..298d5bc 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/StoreScanner.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/StoreScanner.java
@@ -544,7 +544,7 @@
             outResult.add(cell);
             count++;
             totalBytesRead += CellUtil.estimatedSerializedSizeOf(cell);
-            totalHeapSize += CellUtil.estimatedHeapSizeOf(cell);
+            totalHeapSize += CellUtil.estimatedHeapSizeOfWithoutTags(cell);
             if (totalBytesRead > maxRowSize) {
               throw new RowTooBigException("Max row size allowed: " + maxRowSize
               + ", but the row is bigger than that.");
