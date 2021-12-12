diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/HiveMetastoreClient.java b/presto-hive/src/main/java/com/facebook/presto/hive/HiveMetastoreClient.java
index c85424d..8c27e99 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/HiveMetastoreClient.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/HiveMetastoreClient.java
@@ -19,13 +19,13 @@
 
 import java.io.Closeable;
 
-class HiveMetastoreClient
+public class HiveMetastoreClient
         extends ThriftHiveMetastore.Client
         implements Closeable
 {
     private final TTransport transport;
 
-    HiveMetastoreClient(TTransport transport)
+    public HiveMetastoreClient(TTransport transport)
     {
         super(new TBinaryProtocol(transport));
         this.transport = transport;
