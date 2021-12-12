diff --git a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPServerEngineFactory.java b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPServerEngineFactory.java
index 546487c..0f114b2 100644
--- a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPServerEngineFactory.java
+++ b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPServerEngineFactory.java
@@ -88,7 +88,7 @@
      */
     @Resource(name = "cxf")
     public void setBus(Bus bus) {
-        if (this.bus != null) {
+        if (this.bus == null) {
             this.bus = bus;
         }
     }
