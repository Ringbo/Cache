diff --git a/presto-hive/src/test/java/com/facebook/presto/hive/TestHiveClientConfig.java b/presto-hive/src/test/java/com/facebook/presto/hive/TestHiveClientConfig.java
index 0e7b4d7..c4e7291 100644
--- a/presto-hive/src/test/java/com/facebook/presto/hive/TestHiveClientConfig.java
+++ b/presto-hive/src/test/java/com/facebook/presto/hive/TestHiveClientConfig.java
@@ -58,7 +58,7 @@
                 .setForceLocalScheduling(false)
                 .setMaxConcurrentFileRenames(20)
                 .setRecursiveDirWalkerEnabled(false)
-                .setDfsTimeout(new Duration(10, TimeUnit.SECONDS))
+                .setDfsTimeout(new Duration(60, TimeUnit.SECONDS))
                 .setIpcPingInterval(new Duration(10, TimeUnit.SECONDS))
                 .setDfsConnectTimeout(new Duration(500, TimeUnit.MILLISECONDS))
                 .setDfsConnectMaxRetries(5)
