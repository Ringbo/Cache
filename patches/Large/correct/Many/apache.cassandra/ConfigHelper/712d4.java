diff --git a/src/java/org/apache/cassandra/hadoop/ConfigHelper.java b/src/java/org/apache/cassandra/hadoop/ConfigHelper.java
index ad29903..9adc545 100644
--- a/src/java/org/apache/cassandra/hadoop/ConfigHelper.java
+++ b/src/java/org/apache/cassandra/hadoop/ConfigHelper.java
@@ -493,7 +493,7 @@
      */
     public static int getThriftMaxMessageLength(Configuration conf)
     {
-        return conf.getInt(THRIFT_FRAMED_TRANSPORT_SIZE_IN_MB, 16) * 1024 * 1024; // 16MB is default in Cassandra
+        return conf.getInt(THRIFT_MAX_MESSAGE_LENGTH_IN_MB, 16) * 1024 * 1024; // 16MB is default in Cassandra
     }
 
     public static CompressionParameters getOutputCompressionParamaters(Configuration conf)
