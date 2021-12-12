diff --git a/src/java/org/apache/hadoop/hbase/regionserver/HRegion.java b/src/java/org/apache/hadoop/hbase/regionserver/HRegion.java
index f985ef8..51e4612 100644
--- a/src/java/org/apache/hadoop/hbase/regionserver/HRegion.java
+++ b/src/java/org/apache/hadoop/hbase/regionserver/HRegion.java
@@ -1199,7 +1199,7 @@
    * @throws IOException
    */
   public void put(Put put) throws IOException {
-    this.put(put, null, put.writeToWAL());
+    this.put(put, null, put.getWriteToWAL());
   }
   
   /**
@@ -1217,7 +1217,7 @@
    * @throws IOException
    */
   public void put(Put put, Integer lockid) throws IOException {
-    this.put(put, lockid, put.writeToWAL());
+    this.put(put, lockid, put.getWriteToWAL());
   }
 
   /**
