diff --git a/test/unit/org/apache/cassandra/hadoop/ColumnFamilyOutputFormatTest.java b/test/unit/org/apache/cassandra/hadoop/ColumnFamilyOutputFormatTest.java
index 2ce44bd..2a747ff 100644
--- a/test/unit/org/apache/cassandra/hadoop/ColumnFamilyOutputFormatTest.java
+++ b/test/unit/org/apache/cassandra/hadoop/ColumnFamilyOutputFormatTest.java
@@ -127,7 +127,7 @@
         /* Establish a thrift connection to the cassandra instance */
         TSocket socket = new TSocket(DatabaseDescriptor.getListenAddress().getHostName(), DatabaseDescriptor.getRpcPort());
         TTransport transport = new TFramedTransport(socket);
-        TBinaryProtocol binaryProtocol = new TBinaryProtocol(transport, false, false);
+        TBinaryProtocol binaryProtocol = new TBinaryProtocol(transport);
         Cassandra.Client cassandraClient = new Cassandra.Client(binaryProtocol);
         transport.open();
         thriftClient = cassandraClient;
