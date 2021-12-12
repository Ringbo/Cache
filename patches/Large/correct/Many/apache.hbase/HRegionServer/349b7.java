diff --git a/src/main/java/org/apache/hadoop/hbase/regionserver/HRegionServer.java b/src/main/java/org/apache/hadoop/hbase/regionserver/HRegionServer.java
index 692e657..fab65c7 100644
--- a/src/main/java/org/apache/hadoop/hbase/regionserver/HRegionServer.java
+++ b/src/main/java/org/apache/hadoop/hbase/regionserver/HRegionServer.java
@@ -1929,7 +1929,8 @@
   // Region open/close direct RPCs
 
   @Override
-  public void openRegion(HRegionInfo region) {
+  public void openRegion(HRegionInfo region)
+  throws RegionServerStoppedException {
     LOG.info("Received request to open region: " +
       region.getRegionNameAsString());
     if (this.stopped) throw new RegionServerStoppedException();
@@ -1943,7 +1944,8 @@
   }
 
   @Override
-  public void openRegions(List<HRegionInfo> regions) {
+  public void openRegions(List<HRegionInfo> regions)
+  throws RegionServerStoppedException {
     LOG.info("Received request to open " + regions.size() + " region(s)");
     for (HRegionInfo region: regions) openRegion(region);
   }
