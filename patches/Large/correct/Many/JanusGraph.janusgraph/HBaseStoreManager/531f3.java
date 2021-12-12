diff --git a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
index 9217cbb..15087fd 100644
--- a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
+++ b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
@@ -231,7 +231,7 @@
                 throw new TemporaryStorageException(ee);
             }
         } else { // check if compression was enabled, if not - enable it
-            if (cf.getCompressionType() == null) {
+            if (cf.getCompressionType() == null || cf.getCompressionType() == Compression.Algorithm.NONE) {
                 try {
                     adm.disableTable(tableName);
 
