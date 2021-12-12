diff --git a/rt/rs/description/src/main/java/org/apache/cxf/jaxrs/swagger/SwaggerFeature.java b/rt/rs/description/src/main/java/org/apache/cxf/jaxrs/swagger/SwaggerFeature.java
index 8900ba1..85ef7a8 100644
--- a/rt/rs/description/src/main/java/org/apache/cxf/jaxrs/swagger/SwaggerFeature.java
+++ b/rt/rs/description/src/main/java/org/apache/cxf/jaxrs/swagger/SwaggerFeature.java
@@ -96,7 +96,7 @@
         
         if ((resourceInfo != null) 
             && (getResourcePackage() == null || getResourcePackage().length() == 0)) {
-            setResourcePackage(resourceInfo.getResourceClass().getPackage().getName());
+            setResourcePackage(resourceInfo.getServiceClass().getPackage().getName());
         }
     }
     
