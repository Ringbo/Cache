diff --git a/hazelcast/src/main/java/com/hazelcast/impl/MulticastService.java b/hazelcast/src/main/java/com/hazelcast/impl/MulticastService.java
index 089fc11..56ded15 100644
--- a/hazelcast/src/main/java/com/hazelcast/impl/MulticastService.java
+++ b/hazelcast/src/main/java/com/hazelcast/impl/MulticastService.java
@@ -51,7 +51,7 @@
         logger = node.getLogger(MulticastService.class.getName());
         Config config = node.getConfig();
         this.multicastSocket = multicastSocket;
-        int bufferSize = 1024 * 1024;
+        int bufferSize = 64 * 1024;
         this.datagramPacketReceive = new DatagramPacket(new byte[bufferSize], bufferSize);
         this.datagramPacketSend = new DatagramPacket(new byte[bufferSize], bufferSize, InetAddress
                 .getByName(config.getNetworkConfig().getJoin().getMulticastConfig().getMulticastGroup()),
@@ -127,7 +127,7 @@
                 joinInfo.writeToPacket(datagramPacketSend);
                 multicastSocket.send(datagramPacketSend);
             } catch (IOException e) {
-                logger.log(Level.WARNING, e.getMessage(), e);
+                logger.log(Level.WARNING, "You probably have too long Hazelcast configuration!", e);
             }
         }
     }
