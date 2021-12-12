diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/handler/TestCloseRegionHandler.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/handler/TestCloseRegionHandler.java
index f864ec5..a86ff09 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/handler/TestCloseRegionHandler.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/handler/TestCloseRegionHandler.java
@@ -104,7 +104,7 @@
       HRegion spy = Mockito.spy(region);
       final boolean abort = false;
       Mockito.when(spy.close(abort)).
-      thenThrow(new RuntimeException("Mocked failed close!"));
+      thenThrow(new IOException("Mocked failed close!"));
       // The CloseRegionHandler will try to get an HRegion that corresponds
       // to the passed hri -- so insert the region into the online region Set.
       rss.addToOnlineRegions(spy);
