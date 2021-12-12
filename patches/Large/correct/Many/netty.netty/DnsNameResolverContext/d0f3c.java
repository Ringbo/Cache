diff --git a/resolver-dns/src/main/java/io/netty/resolver/dns/DnsNameResolverContext.java b/resolver-dns/src/main/java/io/netty/resolver/dns/DnsNameResolverContext.java
index 6ca2801..0e193f7 100644
--- a/resolver-dns/src/main/java/io/netty/resolver/dns/DnsNameResolverContext.java
+++ b/resolver-dns/src/main/java/io/netty/resolver/dns/DnsNameResolverContext.java
@@ -133,7 +133,7 @@
             public void operationComplete(Future<AddressedEnvelope<DnsResponse, InetSocketAddress>> future) {
                 queriesInProgress.remove(future);
 
-                if (promise.isDone()) {
+                if (promise.isDone() || future.isCancelled()) {
                     return;
                 }
 
