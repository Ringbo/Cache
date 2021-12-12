diff --git a/hazelcast/src/main/java/com/hazelcast/nio/tcp/SocketClientDataReaderNew.java b/hazelcast/src/main/java/com/hazelcast/nio/tcp/SocketClientDataReaderNew.java
index c359ca3..f165973 100644
--- a/hazelcast/src/main/java/com/hazelcast/nio/tcp/SocketClientDataReaderNew.java
+++ b/hazelcast/src/main/java/com/hazelcast/nio/tcp/SocketClientDataReaderNew.java
@@ -32,7 +32,6 @@
     final TcpIpConnection connection;
     final IOService ioService;
     Packet packet;
-//    boolean connectionTypeSet;
 
     public SocketClientDataReaderNew(TcpIpConnection connection) {
         this.connection = connection;
@@ -42,7 +41,7 @@
     public void read(ByteBuffer inBuffer) throws Exception {
         while (inBuffer.hasRemaining()) {
             if (packet == null) {
-                packet = new Packet(ioService.getPortableContext());
+                packet = new Packet();
             }
             boolean complete = packet.readFrom(inBuffer);
             if (complete) {
