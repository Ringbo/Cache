diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
index 6b8488e..58b426e 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
@@ -201,19 +201,20 @@
     protected boolean executeFirstSet = false;
 
     protected final Class<? extends AtmosphereInterceptor>[] defaultInterceptors = new Class[]{
-            OnDisconnectInterceptor.class,
-            // ADD Tracking ID Handshake
-            JavaScriptProtocol.class,
-            // ADD JSONP support
-            JSONPAtmosphereInterceptor.class,
-            // Add SSE support
-            SSEAtmosphereInterceptor.class,
-            // Android 2.3.x streaming support
-            AndroidAtmosphereInterceptor.class,
+            // Default Interceptor
+            DefaultHeadersInterceptor.class,
             // WebKit & IE Padding
             PaddingAtmosphereInterceptor.class,
-            // Default Interceptor
-            DefaultHeadersInterceptor.class
+            // Android 2.3.x streaming support
+            AndroidAtmosphereInterceptor.class,
+            // Add SSE support
+            SSEAtmosphereInterceptor.class,
+            // ADD JSONP support
+            JSONPAtmosphereInterceptor.class,
+            // ADD Tracking ID Handshake
+            JavaScriptProtocol.class,
+            // OnDisconnect
+            OnDisconnectInterceptor.class
     };
 
     /**
@@ -786,7 +787,7 @@
         s = sc.getInitParameter(ApplicationConfig.DISABLE_ATMOSPHEREINTERCEPTOR);
         if (s == null) {
             for (Class<? extends AtmosphereInterceptor> a : defaultInterceptors) {
-                interceptors.addFirst(newAInterceptor(a));
+                interceptors.addLast(newAInterceptor(a));
             }
             logger.info("Set {} to disable them.", ApplicationConfig.DISABLE_ATMOSPHEREINTERCEPTOR, interceptors);
         }
