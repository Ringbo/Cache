diff --git a/modules/cpr/src/main/java/org/atmosphere/interceptor/SSEAtmosphereInterceptor.java b/modules/cpr/src/main/java/org/atmosphere/interceptor/SSEAtmosphereInterceptor.java
index 6d34275..c404418 100644
--- a/modules/cpr/src/main/java/org/atmosphere/interceptor/SSEAtmosphereInterceptor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/interceptor/SSEAtmosphereInterceptor.java
@@ -88,7 +88,7 @@
                 logger.trace("", e);
             }
 
-            w.println(padding);
+            w.println(paddingText);
             w.flush();
         }
     }
