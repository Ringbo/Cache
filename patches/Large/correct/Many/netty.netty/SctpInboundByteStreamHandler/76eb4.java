diff --git a/transport-sctp/src/main/java/io/netty/handler/codec/sctp/SctpInboundByteStreamHandler.java b/transport-sctp/src/main/java/io/netty/handler/codec/sctp/SctpInboundByteStreamHandler.java
index a770988..f6a3ad1 100644
--- a/transport-sctp/src/main/java/io/netty/handler/codec/sctp/SctpInboundByteStreamHandler.java
+++ b/transport-sctp/src/main/java/io/netty/handler/codec/sctp/SctpInboundByteStreamHandler.java
@@ -40,14 +40,14 @@
     }
 
     @Override
-    public boolean acceptInboundMessage(Object msg) throws Exception {
+    public final boolean acceptInboundMessage(Object msg) throws Exception {
         if (super.acceptInboundMessage(msg)) {
-            return isDecodable((SctpMessage) msg);
+            return acceptInboundMessage((SctpMessage) msg);
         }
         return false;
     }
 
-    protected boolean isDecodable(SctpMessage msg) {
+    protected boolean acceptInboundMessage(SctpMessage msg) {
         return msg.protocolIdentifier() == protocolIdentifier && msg.streamIdentifier() == streamIdentifier;
     }
 
