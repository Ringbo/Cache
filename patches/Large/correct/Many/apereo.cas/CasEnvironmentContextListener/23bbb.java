diff --git a/cas-server-core/src/main/java/org/jasig/cas/CasEnvironmentContextListener.java b/cas-server-core/src/main/java/org/jasig/cas/CasEnvironmentContextListener.java
index c737f9b..a7d4ae3 100644
--- a/cas-server-core/src/main/java/org/jasig/cas/CasEnvironmentContextListener.java
+++ b/cas-server-core/src/main/java/org/jasig/cas/CasEnvironmentContextListener.java
@@ -91,7 +91,7 @@
 
     @Override
     public void contextInitialized(final ServletContextEvent event) {
-        LOGGER.info("[{}] has loaded the CAS application context",
+        LOGGER.debug("[{}] has loaded the CAS application context",
                 event.getServletContext().getServerInfo());
     }
 
