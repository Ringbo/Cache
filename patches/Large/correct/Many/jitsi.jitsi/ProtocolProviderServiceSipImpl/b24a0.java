diff --git a/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java b/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
index f2116f6..37ed5a4 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/ProtocolProviderServiceSipImpl.java
@@ -841,7 +841,7 @@
         // especially for ending SIMPLE
         Thread t = new Thread(new ShutdownThread());
         t.setDaemon(false);
-        t.run();
+        t.start();
 
     }
 
