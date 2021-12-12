diff --git a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
index 652b9d0..062ac89 100644
--- a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
+++ b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
@@ -58,7 +58,7 @@
     public static final String TABLE_NAME_DEFAULT = "titan";
 
     public static final String SHORT_CF_NAMES_KEY = "short-cf-names";
-    public static final boolean SHORT_CF_NAMES_DEFAULT = true;
+    public static final boolean SHORT_CF_NAMES_DEFAULT = false;
 
     public static final int PORT_DEFAULT = 9160;
 
