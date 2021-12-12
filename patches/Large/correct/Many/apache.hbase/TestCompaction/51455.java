diff --git a/src/test/java/org/apache/hadoop/hbase/regionserver/TestCompaction.java b/src/test/java/org/apache/hadoop/hbase/regionserver/TestCompaction.java
index 34b8044..2c3747d 100644
--- a/src/test/java/org/apache/hadoop/hbase/regionserver/TestCompaction.java
+++ b/src/test/java/org/apache/hadoop/hbase/regionserver/TestCompaction.java
@@ -61,7 +61,7 @@
 
     // Set cache flush size to 1MB
     conf.setInt("hbase.hregion.memstore.flush.size", 1024*1024);
-    conf.setInt("hbase.hregion.memstore.block.multiplier", 10);
+    conf.setInt("hbase.hregion.memstore.block.multiplier", 100);
     this.cluster = null;
   }
 
