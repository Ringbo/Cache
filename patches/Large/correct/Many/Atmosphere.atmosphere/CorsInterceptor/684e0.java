diff --git a/modules/cpr/src/main/java/org/atmosphere/interceptor/CorsInterceptor.java b/modules/cpr/src/main/java/org/atmosphere/interceptor/CorsInterceptor.java
index 898484d..fc3b389 100644
--- a/modules/cpr/src/main/java/org/atmosphere/interceptor/CorsInterceptor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/interceptor/CorsInterceptor.java
@@ -40,7 +40,7 @@
     public void configure(AtmosphereConfig config) {
         String ac = config.getInitParameter(ApplicationConfig.DROP_ACCESS_CONTROL_ALLOW_ORIGIN_HEADER);
         if (ac != null) {
-            enableAccessControl = Boolean.parseBoolean(ac);
+            enableAccessControl = !Boolean.parseBoolean(ac);
         }
     }
 
