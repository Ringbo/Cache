diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/TestIOFencing.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/TestIOFencing.java
index 5856b19..eeb4ebf 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/TestIOFencing.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/TestIOFencing.java
@@ -241,7 +241,7 @@
     // Insert our custom region
     c.setClass(HConstants.REGION_IMPL, regionClass, HRegion.class);
     // Encourage plenty of flushes
-    c.setLong("hbase.hregion.memstore.flush.size", 100000);
+    c.setLong("hbase.hregion.memstore.flush.size", 25000);
     c.set(HConstants.HBASE_REGION_SPLIT_POLICY_KEY, ConstantSizeRegionSplitPolicy.class.getName());
     // Only run compaction when we tell it to
     c.setInt("hbase.hstore.compaction.min",1);
