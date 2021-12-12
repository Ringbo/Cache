diff --git a/codec-dns/src/main/java/io/netty/handler/codec/dns/DnsResource.java b/codec-dns/src/main/java/io/netty/handler/codec/dns/DnsResource.java
index a6aa310..968a149 100644
--- a/codec-dns/src/main/java/io/netty/handler/codec/dns/DnsResource.java
+++ b/codec-dns/src/main/java/io/netty/handler/codec/dns/DnsResource.java
@@ -74,7 +74,7 @@
      * Returns a duplicate of this resource record.
      */
     @Override
-    public ByteBufHolder duplicate() {
+    public DnsResource duplicate() {
         return new DnsResource(name(), type(), dnsClass(), ttl, content.duplicate());
     }
 
