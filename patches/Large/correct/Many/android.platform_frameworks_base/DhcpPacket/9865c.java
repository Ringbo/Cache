diff --git a/services/net/java/android/net/dhcp/DhcpPacket.java b/services/net/java/android/net/dhcp/DhcpPacket.java
index 595a129..77a3e21 100644
--- a/services/net/java/android/net/dhcp/DhcpPacket.java
+++ b/services/net/java/android/net/dhcp/DhcpPacket.java
@@ -1281,12 +1281,12 @@
      */
     public static ByteBuffer buildAckPacket(int encap, int transactionId,
         boolean broadcast, Inet4Address serverIpAddr, Inet4Address relayIp, Inet4Address yourIp,
-        byte[] mac, Integer timeout, Inet4Address netMask, Inet4Address bcAddr,
-        List<Inet4Address> gateways, List<Inet4Address> dnsServers,
+        Inet4Address requestClientIp, byte[] mac, Integer timeout, Inet4Address netMask,
+        Inet4Address bcAddr, List<Inet4Address> gateways, List<Inet4Address> dnsServers,
         Inet4Address dhcpServerIdentifier, String domainName, boolean metered) {
         DhcpPacket pkt = new DhcpAckPacket(
-                transactionId, (short) 0, broadcast, serverIpAddr, relayIp,
-                INADDR_ANY /* clientIp */, yourIp, mac);
+                transactionId, (short) 0, broadcast, serverIpAddr, relayIp, requestClientIp, yourIp,
+                mac);
         pkt.mGateways = gateways;
         pkt.mDnsServers = dnsServers;
         pkt.mLeaseTime = timeout;
