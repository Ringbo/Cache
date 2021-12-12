diff --git a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestKeepDeletes.java b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestKeepDeletes.java
index f4f3b34..758ed86 100644
--- a/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestKeepDeletes.java
+++ b/hbase-server/src/test/java/org/apache/hadoop/hbase/regionserver/TestKeepDeletes.java
@@ -789,7 +789,8 @@
   private int countDeleteMarkers(HRegion region) throws IOException {
     Scan s = new Scan();
     s.setRaw(true);
-    s.setMaxVersions();
+    // use max versions from the store(s)
+    s.setMaxVersions(region.getStores().values().iterator().next().getScanInfo().getMaxVersions());
     InternalScanner scan = region.getScanner(s);
     List<KeyValue> kvs = new ArrayList<KeyValue>();
     int res = 0;
