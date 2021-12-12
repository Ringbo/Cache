diff --git a/engine/src/networking/com/jme3/network/Network.java b/engine/src/networking/com/jme3/network/Network.java
index a5f6586..5f492a9 100644
--- a/engine/src/networking/com/jme3/network/Network.java
+++ b/engine/src/networking/com/jme3/network/Network.java
@@ -164,7 +164,7 @@
                                           int localUdpPort ) throws IOException
     {
         InetAddress remoteAddress = InetAddress.getByName(host);   
-        UdpConnector fast = new UdpConnector( localUdpPort, remoteAddress, hostPort ); 
+        UdpConnector fast = new UdpConnector( localUdpPort, remoteAddress, remoteUdpPort ); 
         SocketConnector reliable = new SocketConnector( remoteAddress, hostPort );        
        
         return new DefaultClient( gameName, version, reliable, fast );
@@ -187,7 +187,7 @@
         public void connectToServer( InetAddress address, int port, int remoteUdpPort, 
                                      int localUdpPort ) throws IOException
         {
-            UdpConnector fast = new UdpConnector( localUdpPort, address, port ); 
+            UdpConnector fast = new UdpConnector( localUdpPort, address, remoteUdpPort ); 
             SocketConnector reliable = new SocketConnector( address, port );        
             
             setConnectors( reliable, fast );
