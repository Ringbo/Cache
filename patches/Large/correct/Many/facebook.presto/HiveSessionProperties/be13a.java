diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/HiveSessionProperties.java b/presto-hive/src/main/java/com/facebook/presto/hive/HiveSessionProperties.java
index 833afdd..b780e41 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/HiveSessionProperties.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/HiveSessionProperties.java
@@ -59,7 +59,7 @@
                 dataSizeSessionProperty(
                         ORC_STREAM_BUFFER_SIZE,
                         "ORC: Size of buffer for streaming reads",
-                        config.getOrcMaxBufferSize(),
+                        config.getOrcStreamBufferSize(),
                         false),
                 booleanSessionProperty(
                         PARQUET_OPTIMIZED_READER_ENABLED,
