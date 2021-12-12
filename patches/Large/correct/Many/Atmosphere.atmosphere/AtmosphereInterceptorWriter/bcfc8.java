diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereInterceptorWriter.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereInterceptorWriter.java
index 47cf31a..8150d3b 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereInterceptorWriter.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereInterceptorWriter.java
@@ -29,7 +29,7 @@
  */
 public class AtmosphereInterceptorWriter extends AsyncIOWriterAdapter {
 
-    private static final Logger logger = LoggerFactory.getLogger(AsyncIOWriterAdapter.class);
+    private static final Logger logger = LoggerFactory.getLogger(AtmosphereInterceptorWriter.class);
     private final AtmosphereResponse response;
 
     private final ArrayList<AsyncIOInterceptor> filters = new ArrayList<AsyncIOInterceptor>();
