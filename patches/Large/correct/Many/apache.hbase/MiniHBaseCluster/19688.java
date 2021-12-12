diff --git a/core/src/test/java/org/apache/hadoop/hbase/MiniHBaseCluster.java b/core/src/test/java/org/apache/hadoop/hbase/MiniHBaseCluster.java
index b91c4e7..b80c8ec 100644
--- a/core/src/test/java/org/apache/hadoop/hbase/MiniHBaseCluster.java
+++ b/core/src/test/java/org/apache/hadoop/hbase/MiniHBaseCluster.java
@@ -113,7 +113,7 @@
    * Subclass so can get at protected methods (none at moment).
    */
   public static class MiniHBaseClusterRegionServer extends HRegionServer {
-    public MiniHBaseClusterRegionServer(HBaseConfiguration conf)
+    public MiniHBaseClusterRegionServer(Configuration conf)
         throws IOException {
       super(conf);
     }
