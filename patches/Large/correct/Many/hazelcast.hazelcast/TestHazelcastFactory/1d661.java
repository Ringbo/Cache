diff --git a/hazelcast-client/src/test/java/com/hazelcast/client/test/TestHazelcastFactory.java b/hazelcast-client/src/test/java/com/hazelcast/client/test/TestHazelcastFactory.java
index 8c789cc..bed4ff5 100644
--- a/hazelcast-client/src/test/java/com/hazelcast/client/test/TestHazelcastFactory.java
+++ b/hazelcast-client/src/test/java/com/hazelcast/client/test/TestHazelcastFactory.java
@@ -96,7 +96,7 @@
                 Collection<InetSocketAddress> inetAddresses = new ArrayList<InetSocketAddress>();
                 for (Address address : getKnownAddresses()) {
                     Collection<InetSocketAddress> addresses = AddressHelper.getPossibleSocketAddresses(address.getPort(),
-                            address.getHost(), 3);
+                            address.getHost(), 1);
                     inetAddresses.addAll(addresses);
                 }
                 return inetAddresses;
