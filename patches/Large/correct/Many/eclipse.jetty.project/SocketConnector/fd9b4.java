diff --git a/jetty-server/src/main/java/org/eclipse/jetty/server/bio/SocketConnector.java b/jetty-server/src/main/java/org/eclipse/jetty/server/bio/SocketConnector.java
index 5a39e71..f414073 100644
--- a/jetty-server/src/main/java/org/eclipse/jetty/server/bio/SocketConnector.java
+++ b/jetty-server/src/main/java/org/eclipse/jetty/server/bio/SocketConnector.java
@@ -109,7 +109,7 @@
     /**
      * Allows subclass to override Conection if required.
      */
-    protected HttpConnection newHttpConnection(EndPoint endpoint) 
+    protected Connection newConnection(EndPoint endpoint)
     {
         return new HttpConnection(this, endpoint, getServer());
     }
@@ -179,7 +179,7 @@
         public ConnectorEndPoint(Socket socket) throws IOException
         {
             super(socket);
-            _connection = newHttpConnection(this);
+            _connection = newConnection(this);
             _sotimeout=socket.getSoTimeout();
             _socket=socket;
         }
