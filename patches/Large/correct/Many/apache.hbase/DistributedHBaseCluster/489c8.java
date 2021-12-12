diff --git a/hbase-it/src/test/java/org/apache/hadoop/hbase/DistributedHBaseCluster.java b/hbase-it/src/test/java/org/apache/hadoop/hbase/DistributedHBaseCluster.java
index 16f1e71..d35ef84 100644
--- a/hbase-it/src/test/java/org/apache/hadoop/hbase/DistributedHBaseCluster.java
+++ b/hbase-it/src/test/java/org/apache/hadoop/hbase/DistributedHBaseCluster.java
@@ -269,7 +269,7 @@
   public ServerName getServerHoldingRegion(TableName tn, byte[] regionName) throws IOException {
     HRegionLocation regionLoc = null;
     try (RegionLocator locator = connection.getRegionLocator(tn)) {
-      regionLoc = locator.getRegionLocation(regionName);
+      regionLoc = locator.getRegionLocation(regionName, true);
     }
     if (regionLoc == null) {
       LOG.warn("Cannot find region server holding region " + Bytes.toString(regionName) +
