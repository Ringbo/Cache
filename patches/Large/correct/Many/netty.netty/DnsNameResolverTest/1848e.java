diff --git a/resolver-dns/src/test/java/io/netty/resolver/dns/DnsNameResolverTest.java b/resolver-dns/src/test/java/io/netty/resolver/dns/DnsNameResolverTest.java
index 8738969..9218a0c 100644
--- a/resolver-dns/src/test/java/io/netty/resolver/dns/DnsNameResolverTest.java
+++ b/resolver-dns/src/test/java/io/netty/resolver/dns/DnsNameResolverTest.java
@@ -499,7 +499,7 @@
         try {
             InetAddress address = resolver.resolve("10.0.0.1").syncUninterruptibly().getNow();
 
-            assertEquals("10.0.0.1", address.getHostName());
+            assertEquals("10.0.0.1", address.getHostAddress());
         } finally {
             resolver.close();
         }
