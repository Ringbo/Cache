diff --git a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
index 521be6e..dc22823 100644
--- a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
+++ b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
@@ -230,7 +230,7 @@
                 throw new TemporaryStorageException(ee);
             }
         } else { // check if compression was enabled, if not - enable it
-            if (cf.getCompressionType() == null) {
+            if (cf.getCompressionType() == null || cf.getCompressionType() == Compression.Algorithm.NONE) {
                 try {
                     adm.disableTable(tableName);
 
