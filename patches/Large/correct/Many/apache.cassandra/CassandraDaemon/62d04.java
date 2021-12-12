diff --git a/src/java/org/apache/cassandra/thrift/CassandraDaemon.java b/src/java/org/apache/cassandra/thrift/CassandraDaemon.java
index ede1b22..60d9753 100644
--- a/src/java/org/apache/cassandra/thrift/CassandraDaemon.java
+++ b/src/java/org/apache/cassandra/thrift/CassandraDaemon.java
@@ -153,7 +153,7 @@
         logger.info(String.format("Binding thrift service to %s:%s", listenAddr, listenPort));
 
         // Protocol factory
-        TProtocolFactory tProtocolFactory = new TBinaryProtocol.Factory(false, 
+        TProtocolFactory tProtocolFactory = new TBinaryProtocol.Factory(true, 
                                                                         true, 
                                                                         DatabaseDescriptor.getThriftMaxMessageLength());
         
