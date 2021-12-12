diff --git a/rt/rs/description-swagger/src/main/java/org/apache/cxf/jaxrs/swagger/OsgiSwaggerUiResolver.java b/rt/rs/description-swagger/src/main/java/org/apache/cxf/jaxrs/swagger/OsgiSwaggerUiResolver.java
index 32493a1..b522f1b 100644
--- a/rt/rs/description-swagger/src/main/java/org/apache/cxf/jaxrs/swagger/OsgiSwaggerUiResolver.java
+++ b/rt/rs/description-swagger/src/main/java/org/apache/cxf/jaxrs/swagger/OsgiSwaggerUiResolver.java
@@ -45,7 +45,7 @@
                 return null;
             }
             String[] locations = swaggerUiMavenGroupAndArtifact == null ? DEFAULT_LOCATIONS
-                : new String[]{"mvn:" + DEFAULT_COORDINATES + "/",
+                : new String[]{"mvn:" + swaggerUiMavenGroupAndArtifact + "/",
                                "wrap:mvn:" + swaggerUiMavenGroupAndArtifact + "/"};
             for (Bundle b : bundle.getBundleContext().getBundles()) {
                 String location = b.getLocation();
