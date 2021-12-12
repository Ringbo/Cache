diff --git a/src/java/org/apache/hadoop/hbase/regionserver/HRegionServer.java b/src/java/org/apache/hadoop/hbase/regionserver/HRegionServer.java
index 6fb327d..4e7f45a 100644
--- a/src/java/org/apache/hadoop/hbase/regionserver/HRegionServer.java
+++ b/src/java/org/apache/hadoop/hbase/regionserver/HRegionServer.java
@@ -1236,7 +1236,7 @@
   }
 
   /** @return the HLog */
-  HLog getLog() {
+  public HLog getLog() {
     return this.hlog;
   }
 
