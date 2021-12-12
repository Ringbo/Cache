diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
index e1420f9..935f9e7 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
@@ -878,7 +878,7 @@
             }
 
             for (Class<? extends AtmosphereInterceptor> a : defaultInterceptors) {
-                if (!s.contains(a.getName())) {
+                if (!disables.contains(a.getName())) {
                     interceptors.addFirst(newAInterceptor(a));
                 } else {
                     logger.info("Dropping Interceptor {}", a.getName());
