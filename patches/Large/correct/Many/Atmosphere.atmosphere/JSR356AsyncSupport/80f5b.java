diff --git a/modules/cpr/src/main/java/org/atmosphere/container/JSR356AsyncSupport.java b/modules/cpr/src/main/java/org/atmosphere/container/JSR356AsyncSupport.java
index 6d2c0ce..b7a1aa2 100644
--- a/modules/cpr/src/main/java/org/atmosphere/container/JSR356AsyncSupport.java
+++ b/modules/cpr/src/main/java/org/atmosphere/container/JSR356AsyncSupport.java
@@ -53,7 +53,7 @@
         String servletPath = config.getInitParameter(ApplicationConfig.JSR356_MAPPING_PATH);
         if (servletPath == null) {
             servletPath = IOUtils.guestServletPath(config);
-            if (servletPath.equals("/")) {
+            if (servletPath.equals("/") || servletPath.equals("/*")) {
                 servletPath = PATH +"}";
             }
         }
