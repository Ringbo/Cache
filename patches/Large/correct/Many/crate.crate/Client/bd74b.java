diff --git a/enterprise/mqtt/src/test/java/io/crate/mqtt/netty/Client.java b/enterprise/mqtt/src/test/java/io/crate/mqtt/netty/Client.java
index e10cebc..b748462 100644
--- a/enterprise/mqtt/src/test/java/io/crate/mqtt/netty/Client.java
+++ b/enterprise/mqtt/src/test/java/io/crate/mqtt/netty/Client.java
@@ -63,7 +63,7 @@
     public void connect() {
         LOGGER.debug("[mqtt-client] connect");
         handler = new ClientNettyMQTTHandler();
-        workerGroup = new NioEventLoopGroup();
+        workerGroup = new NioEventLoopGroup(1);
         try {
             Bootstrap b = new Bootstrap();
             b.group(workerGroup);
