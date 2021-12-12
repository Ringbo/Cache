diff --git a/src/net/java/sip/communicator/impl/protocol/sip/SipStackSharing.java b/src/net/java/sip/communicator/impl/protocol/sip/SipStackSharing.java
index 884cc99..a3b75d4 100644
--- a/src/net/java/sip/communicator/impl/protocol/sip/SipStackSharing.java
+++ b/src/net/java/sip/communicator/impl/protocol/sip/SipStackSharing.java
@@ -1059,6 +1059,6 @@
 //                .getLocalTLSAddressForDestination(dst, dstPort, localAddress));
 //        else
             return (java.net.InetSocketAddress)(((SipStackImpl)this.stack)
-            .getLocalAddressForDestination(dst, dstPort, localAddress, 0));
+            .obtainLocalAddress(dst, dstPort, localAddress, 0));
     }
 }
