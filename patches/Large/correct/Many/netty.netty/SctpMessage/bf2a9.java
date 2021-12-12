diff --git a/transport-sctp/src/main/java/io/netty/channel/sctp/SctpMessage.java b/transport-sctp/src/main/java/io/netty/channel/sctp/SctpMessage.java
index f809999..d535fc9 100644
--- a/transport-sctp/src/main/java/io/netty/channel/sctp/SctpMessage.java
+++ b/transport-sctp/src/main/java/io/netty/channel/sctp/SctpMessage.java
@@ -160,7 +160,7 @@
         if (msgInfo == null) {
             return new SctpMessage(protocolIdentifier, streamIdentifier, unordered, content().duplicate());
         } else {
-            return new SctpMessage(msgInfo, content().copy());
+            return new SctpMessage(msgInfo, content().duplicate());
         }
     }
 
