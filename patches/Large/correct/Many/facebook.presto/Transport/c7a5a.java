diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/thrift/Transport.java b/presto-hive/src/main/java/com/facebook/presto/hive/thrift/Transport.java
index b9bdd52..a8ffe3d 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/thrift/Transport.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/thrift/Transport.java
@@ -82,7 +82,7 @@
 
     private static Socket createSocksSocket(HostAndPort proxy)
     {
-        SocketAddress address = InetSocketAddress.createUnresolved(proxy.getHostText(), proxy.getPort());
+        SocketAddress address = InetSocketAddress.createUnresolved(proxy.getHost(), proxy.getPort());
         return new Socket(new Proxy(Proxy.Type.SOCKS, address));
     }
 
