diff --git a/rt/transports/http/src/main/java/org/apache/cxf/transport/http/AbstractHTTPTransportFactory.java b/rt/transports/http/src/main/java/org/apache/cxf/transport/http/AbstractHTTPTransportFactory.java
index 08ca9a7..fe72d2e 100644
--- a/rt/transports/http/src/main/java/org/apache/cxf/transport/http/AbstractHTTPTransportFactory.java
+++ b/rt/transports/http/src/main/java/org/apache/cxf/transport/http/AbstractHTTPTransportFactory.java
@@ -160,7 +160,7 @@
             : new HTTPConduit(bus, endpointInfo, target);
         // Spring configure the conduit.  
         String address = conduit.getAddress();
-        if (address.indexOf('?') != -1) {
+        if (address != null && address.indexOf('?') != -1) {
             address = address.substring(0, address.indexOf('?'));
         }
         configure(conduit, conduit.getBeanName(), address);
