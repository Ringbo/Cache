diff --git a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java
index 3830967..6175b69 100644
--- a/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java
+++ b/rt/transports/http-jetty/src/main/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestination.java
@@ -226,7 +226,7 @@
     private void setHeadFalse(AbstractConnection con) {
         try {
             Generator gen = (Generator)con.getClass().getMethod("getGenerator").invoke(con);
-            gen.setHead(true);
+            gen.setHead(false);
         } catch (Exception ex) {
             //ignore - can continue
         }
