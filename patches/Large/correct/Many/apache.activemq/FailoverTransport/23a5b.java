diff --git a/activemq-client/src/main/java/org/apache/activemq/transport/failover/FailoverTransport.java b/activemq-client/src/main/java/org/apache/activemq/transport/failover/FailoverTransport.java
index c0bc9da..f502179 100755
--- a/activemq-client/src/main/java/org/apache/activemq/transport/failover/FailoverTransport.java
+++ b/activemq-client/src/main/java/org/apache/activemq/transport/failover/FailoverTransport.java
@@ -276,7 +276,7 @@
                 }
 
                 LOG.warn("Transport ({}) failed {} attempting to automatically reconnect: {}",
-                         connectedTransport, (reconnectOk ? "," : ", not"), e);
+                         connectedTransportURI, (reconnectOk ? "," : ", not"), e);
 
                 failedConnectTransportURI = connectedTransportURI;
                 connectedTransportURI = null;
