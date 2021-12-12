diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/StaticHiveCluster.java b/presto-hive/src/main/java/com/facebook/presto/hive/StaticHiveCluster.java
index 3a37c83..4facd97 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/StaticHiveCluster.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/StaticHiveCluster.java
@@ -71,7 +71,7 @@
         TTransportException lastException = null;
         for (HostAndPort metastore : metastores) {
             try {
-                return clientFactory.create(metastore.getHostText(), metastore.getPort());
+                return clientFactory.create(metastore.getHost(), metastore.getPort());
             }
             catch (TTransportException e) {
                 lastException = e;
