diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
index 68011cf..9ba341e 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
@@ -1771,9 +1771,9 @@
 
     protected void loadMetaService() {
         try {
-            final Map<String, MetaServiceAction> config = (Map<String, MetaServiceAction>) servletConfig.getServletContext().getAttribute(AtmosphereFramework.MetaServiceAction.class.getName());
+            Map<String, MetaServiceAction> config = (Map<String, MetaServiceAction>) servletConfig.getServletContext().getAttribute(AtmosphereFramework.MetaServiceAction.class.getName());
             if (config == null) {
-                IOUtils.readServiceFile(AtmosphereFramework.class.getName());
+                config = IOUtils.readServiceFile(AtmosphereFramework.class.getName());
             }
 
             for (final Map.Entry<String, MetaServiceAction> action : config.entrySet()) {
