diff --git a/rt/transports/http/src/main/java/org/apache/cxf/transport/http/HTTPConduit.java b/rt/transports/http/src/main/java/org/apache/cxf/transport/http/HTTPConduit.java
index a3b1650..c68aec5 100644
--- a/rt/transports/http/src/main/java/org/apache/cxf/transport/http/HTTPConduit.java
+++ b/rt/transports/http/src/main/java/org/apache/cxf/transport/http/HTTPConduit.java
@@ -694,7 +694,7 @@
             message.put(Message.ENDPOINT_ADDRESS, result);
         } else {
             if (connectionFactory == null 
-                || result.startsWith(connectionFactory.getProtocol() + ":/")) {
+                || !result.startsWith(connectionFactory.getProtocol() + ":/")) {
             
                 connectionFactory = null;
                 retrieveConnectionFactory(result);
