diff --git a/engine/src/test/jme3test/network/TestThroughput.java b/engine/src/test/jme3test/network/TestThroughput.java
index d35ea7f..05b78e9 100644
--- a/engine/src/test/jme3test/network/TestThroughput.java
+++ b/engine/src/test/jme3test/network/TestThroughput.java
@@ -50,7 +50,7 @@
     private static Client client;
 
     // Change this flag to test UDP instead of TCP
-    private static boolean testReliable = true;
+    private static boolean testReliable = false;
     
     private boolean isOnServer;
 
@@ -94,10 +94,12 @@
     
         Serializer.registerClass(TestMessage.class);
 
-        Server server = Network.createServer( 5110 );
+        // Use this to test the client/server name version check
+        //Server server = Network.createServer( "bad name", 42, 5110, 5110 );
+        Server server = Network.createServer( 5110, 5110 );
         server.start();
 
-        Client client = Network.connectToServer( "localhost", 5110, 5000 );
+        Client client = Network.connectToServer( "localhost", 5110 );
         client.start();
 
         client.addMessageListener(new TestThroughput(false), TestMessage.class);
