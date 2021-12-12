diff --git a/src/java/voldemort/server/http/VoldemortServletContextListener.java b/src/java/voldemort/server/http/VoldemortServletContextListener.java
index ffd25c1..ed0105b 100644
--- a/src/java/voldemort/server/http/VoldemortServletContextListener.java
+++ b/src/java/voldemort/server/http/VoldemortServletContextListener.java
@@ -45,7 +45,7 @@
     public void contextDestroyed(ServletContextEvent event) {
         logger.info("Calling application shutdown...");
         VoldemortServer server = (VoldemortServer) event.getServletContext()
-                                                        .getAttribute(SERVER_CONFIG_KEY);
+                                                        .getAttribute(SERVER_KEY);
         if(server != null)
             server.stop();
         logger.info("Destroying application...");
