diff --git a/engine/src/test/jme3test/network/TestChatClient.java b/engine/src/test/jme3test/network/TestChatClient.java
index de644e1..d7bfcd6 100644
--- a/engine/src/test/jme3test/network/TestChatClient.java
+++ b/engine/src/test/jme3test/network/TestChatClient.java
@@ -98,7 +98,7 @@
         getContentPane().add( p, "South" );
         
         client = Network.connectToServer( TestChatServer.NAME, TestChatServer.VERSION,
-                                          host, TestChatServer.PORT, TestChatServer.PORT + 1 );                                          
+                                          host, TestChatServer.PORT );                                          
         client.addMessageListener( new ChatHandler(), ChatMessage.class );                                             
         client.start();                                                                               
     }
