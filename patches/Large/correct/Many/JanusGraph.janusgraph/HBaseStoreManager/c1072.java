diff --git a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
index 71df4e6..5393681 100644
--- a/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
+++ b/titan-hbase/src/main/java/com/thinkaurelius/titan/diskstorage/hbase/HBaseStoreManager.java
@@ -64,7 +64,7 @@
 
     public static final ConfigOption<Boolean> SHORT_CF_NAMES = new ConfigOption<Boolean>(STORAGE_NS,"short-cf-names",
             "Whether to automatically shorten the names of frequently used column families to preserve space",
-            ConfigOption.Type.FIXED, false);
+            ConfigOption.Type.FIXED, true);
 
 //    public static final String SHORT_CF_NAMES_KEY = "short-cf-names";
 //    public static final boolean SHORT_CF_NAMES_DEFAULT = false;
