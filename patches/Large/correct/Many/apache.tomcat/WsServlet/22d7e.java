diff --git a/java/org/apache/tomcat/websocket/server/WsServlet.java b/java/org/apache/tomcat/websocket/server/WsServlet.java
index 00896c9..72d5bed 100644
--- a/java/org/apache/tomcat/websocket/server/WsServlet.java
+++ b/java/org/apache/tomcat/websocket/server/WsServlet.java
@@ -135,11 +135,12 @@
         try {
             Class<?> clazz = sec.getEndpointClass();
             if (Endpoint.class.isAssignableFrom(clazz)) {
-                ep = (Endpoint) sec.getEndpointClass().newInstance();
+                ep = (Endpoint) sec.getConfigurator().getEndpointInstance(
+                        sec.getEndpointClass());
             } else {
                 ep = new PojoEndpointServer();
             }
-        } catch (InstantiationException | IllegalAccessException e) {
+        } catch (InstantiationException e) {
             throw new ServletException(e);
         }
 
