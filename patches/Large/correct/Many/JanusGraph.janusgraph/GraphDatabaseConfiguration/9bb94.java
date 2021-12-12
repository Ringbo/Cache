diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/configuration/GraphDatabaseConfiguration.java b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/configuration/GraphDatabaseConfiguration.java
index b0be09e..c508cdf 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/configuration/GraphDatabaseConfiguration.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/configuration/GraphDatabaseConfiguration.java
@@ -154,7 +154,7 @@
 
     public static final ConfigOption<Timestamps> TIMESTAMP_PROVIDER = new ConfigOption<Timestamps>(ROOT_NS, "timestamps",
             "The timestamp resolution to use when writing to storage and indices",
-            ConfigOption.Type.FIXED, Timestamps.MICRO);
+            ConfigOption.Type.FIXED, Timestamps.class, Timestamps.MICRO);
 
 
     public static final ConfigOption<Boolean> SYSTEM_LOG_TRANSACTIONS = new ConfigOption<Boolean>(ROOT_NS,"log-tx",
