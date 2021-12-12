diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/compactions/CompactionRequest.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/compactions/CompactionRequest.java
index 76085fa..01bf414 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/compactions/CompactionRequest.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/compactions/CompactionRequest.java
@@ -216,7 +216,7 @@
    */
   public boolean isRetainDeleteMarkers() {
     return (this.retainDeleteMarkers != null) ? this.retainDeleteMarkers.booleanValue()
-        : isAllFiles();
+        : !isAllFiles();
   }
 
   @Override
