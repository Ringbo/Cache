diff --git a/src/main/java/org/apache/hadoop/hbase/ipc/HRegionInterface.java b/src/main/java/org/apache/hadoop/hbase/ipc/HRegionInterface.java
index bb35527..11d3e88 100644
--- a/src/main/java/org/apache/hadoop/hbase/ipc/HRegionInterface.java
+++ b/src/main/java/org/apache/hadoop/hbase/ipc/HRegionInterface.java
@@ -299,14 +299,18 @@
   /**
    * Opens the specified region.
    * @param region region to open
+   * @param RegionServerStoppedException
+   * @param IOException
    */
-  public void openRegion(final HRegionInfo region);
+  public void openRegion(final HRegionInfo region) throws IOException;
 
   /**
    * Opens the specified regions.
    * @param regions regions to open
+   * @param RegionServerStoppedException
+   * @param IOException
    */
-  public void openRegions(final List<HRegionInfo> regions);
+  public void openRegions(final List<HRegionInfo> regions) throws IOException;
 
   /**
    * Closes the specified region.
