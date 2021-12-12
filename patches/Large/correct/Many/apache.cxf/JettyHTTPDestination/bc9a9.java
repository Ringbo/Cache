diff --git a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java
index 10342c1..27c3152 100644
--- a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java
+++ b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java
@@ -162,8 +162,7 @@
         try {
             url = new URL(endpointInfo.getAddress());
         } catch (Exception e) {
-            throw new Fault(new org.apache.cxf.common.i18n.Message("START_UP_SERVER_FAILED_MSG",
-                                                                   LOG, e.getMessage()), e);
+            throw new Fault(e);
         }
         engine.addServant(url, 
                           new JettyHTTPHandler(this, contextMatchOnExact()));
