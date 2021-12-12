diff --git a/src/main/java/org/apache/hadoop/hbase/thrift/ThriftServer.java b/src/main/java/org/apache/hadoop/hbase/thrift/ThriftServer.java
index d551478..be5f36d 100644
--- a/src/main/java/org/apache/hadoop/hbase/thrift/ThriftServer.java
+++ b/src/main/java/org/apache/hadoop/hbase/thrift/ThriftServer.java
@@ -1005,7 +1005,7 @@
           printUsageAndExit(options, -1);
         }
       } else {
-        listenAddress = InetAddress.getLocalHost();
+        listenAddress = InetAddress.getByName("0.0.0.0");
       }
       TServerTransport serverTransport = new TServerSocket(new InetSocketAddress(listenAddress, listenPort));
 
