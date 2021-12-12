diff --git a/modules/cpr/src/main/java/org/atmosphere/interceptor/AtmosphereResourceLifecycleInterceptor.java b/modules/cpr/src/main/java/org/atmosphere/interceptor/AtmosphereResourceLifecycleInterceptor.java
index d37ba55..bfe703f 100644
--- a/modules/cpr/src/main/java/org/atmosphere/interceptor/AtmosphereResourceLifecycleInterceptor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/interceptor/AtmosphereResourceLifecycleInterceptor.java
@@ -57,7 +57,7 @@
 public class AtmosphereResourceLifecycleInterceptor implements AtmosphereInterceptor {
 
     private String method = "GET";
-    private static final Logger logger = LoggerFactory.getLogger(SSEAtmosphereInterceptor.class);
+    private static final Logger logger = LoggerFactory.getLogger(AtmosphereResourceLifecycleInterceptor.class);
 
     @Override
     public void configure(AtmosphereConfig config) {
