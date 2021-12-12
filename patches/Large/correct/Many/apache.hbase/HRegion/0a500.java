diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HRegion.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HRegion.java
index e390d6b..bd25a824 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HRegion.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/HRegion.java
@@ -5663,7 +5663,7 @@
 
       long size = 0;
       for (Cell c : results) {
-        size += CellUtil.estimatedHeapSizeOf(c);
+        size += CellUtil.estimatedHeapSizeOfWithoutTags(c);
       }
 
       return size;
