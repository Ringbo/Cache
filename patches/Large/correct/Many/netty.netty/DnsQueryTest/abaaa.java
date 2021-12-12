diff --git a/codec-dns/src/test/java/io/netty/handler/codec/dns/DnsQueryTest.java b/codec-dns/src/test/java/io/netty/handler/codec/dns/DnsQueryTest.java
index 35cfd0f..44802c1 100644
--- a/codec-dns/src/test/java/io/netty/handler/codec/dns/DnsQueryTest.java
+++ b/codec-dns/src/test/java/io/netty/handler/codec/dns/DnsQueryTest.java
@@ -32,22 +32,22 @@
 
     @Test
     public void writeQueryTest() throws Exception {
-        InetSocketAddress addr = new InetSocketAddress(0);
+        InetSocketAddress addr = new InetSocketAddress("8.8.8.8", 53);
         EmbeddedChannel embedder = new EmbeddedChannel(new DatagramDnsQueryEncoder());
         List<DnsQuery> queries = new ArrayList<DnsQuery>(5);
-        queries.add(new DatagramDnsQuery(addr, null, 1).setRecord(
+        queries.add(new DatagramDnsQuery(null, addr, 1).setRecord(
                 DnsSection.QUESTION,
                 new DefaultDnsQuestion("1.0.0.127.in-addr.arpa", DnsRecordType.PTR)));
-        queries.add(new DatagramDnsQuery(addr, null, 1).setRecord(
+        queries.add(new DatagramDnsQuery(null, addr, 1).setRecord(
                 DnsSection.QUESTION,
                 new DefaultDnsQuestion("www.example.com", DnsRecordType.A)));
-        queries.add(new DatagramDnsQuery(addr, null, 1).setRecord(
+        queries.add(new DatagramDnsQuery(null, addr, 1).setRecord(
                 DnsSection.QUESTION,
                 new DefaultDnsQuestion("example.com", DnsRecordType.AAAA)));
-        queries.add(new DatagramDnsQuery(addr, null, 1).setRecord(
+        queries.add(new DatagramDnsQuery(null, addr, 1).setRecord(
                 DnsSection.QUESTION,
                 new DefaultDnsQuestion("example.com", DnsRecordType.MX)));
-        queries.add(new DatagramDnsQuery(addr, null, 1).setRecord(
+        queries.add(new DatagramDnsQuery(null, addr, 1).setRecord(
                 DnsSection.QUESTION,
                 new DefaultDnsQuestion("example.com", DnsRecordType.CNAME)));
 
