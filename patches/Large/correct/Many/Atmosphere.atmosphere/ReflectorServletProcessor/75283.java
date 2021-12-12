diff --git a/modules/cpr/src/main/java/org/atmosphere/handler/ReflectorServletProcessor.java b/modules/cpr/src/main/java/org/atmosphere/handler/ReflectorServletProcessor.java
index a47d327..5f51c49 100644
--- a/modules/cpr/src/main/java/org/atmosphere/handler/ReflectorServletProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/handler/ReflectorServletProcessor.java
@@ -130,7 +130,7 @@
 
             fc.setFilterName(filterName);
             filterChain.addFilter(fc);
-            logger.info("Installing Filter {}", servletClassName);
+            logger.info("Installing Filter {}", filterName);
         }
 
     }
