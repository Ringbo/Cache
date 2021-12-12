diff --git a/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClient.java b/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClient.java
index 84c40e6..f5df5e6 100644
--- a/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClient.java
+++ b/presto-hive/src/test/java/com/facebook/presto/hive/AbstractTestHiveClient.java
@@ -403,12 +403,12 @@
         timeZone = DateTimeZone.forTimeZone(TimeZone.getTimeZone(timeZoneId));
     }
 
-    protected void setup(String host, int port, String databaseName, String timeZone)
+    protected final void setup(String host, int port, String databaseName, String timeZone)
     {
         setup(host, port, databaseName, timeZone, "hive-test", 100, 50);
     }
 
-    protected void setup(String host, int port, String databaseName, String timeZoneId, String connectorName, int maxOutstandingSplits, int maxThreads)
+    protected final void setup(String host, int port, String databaseName, String timeZoneId, String connectorName, int maxOutstandingSplits, int maxThreads)
     {
         setupHive(connectorName, databaseName, timeZoneId);
 
