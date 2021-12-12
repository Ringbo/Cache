diff --git a/modules/cpr/src/main/java/org/atmosphere/interceptor/SSEAtmosphereInterceptor.java b/modules/cpr/src/main/java/org/atmosphere/interceptor/SSEAtmosphereInterceptor.java
index 7b49748..0f36cb2 100644
--- a/modules/cpr/src/main/java/org/atmosphere/interceptor/SSEAtmosphereInterceptor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/interceptor/SSEAtmosphereInterceptor.java
@@ -75,7 +75,7 @@
                 logger.trace("", e);
             }
 
-            w.println(padding);
+            w.println(paddingText);
             w.flush();
         }
     }
