diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java b/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java
index e1e253f..20ca110 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientClusterServiceImpl.java
@@ -560,7 +560,7 @@
 
     private Collection<InetSocketAddress> getConfigAddresses() {
         final List<InetSocketAddress> socketAddresses = new LinkedList<InetSocketAddress>();
-        for (String address : getClientConfig().getAddressList()) {
+        for (String address : getClientConfig().getAddresses()) {
             socketAddresses.addAll(AddressHelper.getSocketAddresses(address));
         }
         Collections.shuffle(socketAddresses);
