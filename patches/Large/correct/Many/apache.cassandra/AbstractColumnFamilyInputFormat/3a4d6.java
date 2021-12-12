diff --git a/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java b/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java
index 274e43f..7876b62 100644
--- a/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java
+++ b/src/java/org/apache/cassandra/hadoop/AbstractColumnFamilyInputFormat.java
@@ -95,9 +95,12 @@
     {
         logger.debug("Creating authenticated client for CF input format");
         TTransport transport;
-        try {
-            transport = ConfigHelper.getClientTransportFactory(conf).openTransport(location, port, conf);
-        } catch (Exception e) {
+        try
+        {
+            transport = ConfigHelper.getClientTransportFactory(conf).openTransport(location, port);
+        }
+        catch (Exception e)
+        {
             throw new TTransportException("Failed to open a transport to " + location + ":" + port + ".", e);
         }
         TProtocol binaryProtocol = new TBinaryProtocol(transport, true, true);
