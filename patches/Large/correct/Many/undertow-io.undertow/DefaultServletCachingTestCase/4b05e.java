diff --git a/servlet/src/test/java/io/undertow/servlet/test/defaultservlet/DefaultServletCachingTestCase.java b/servlet/src/test/java/io/undertow/servlet/test/defaultservlet/DefaultServletCachingTestCase.java
index 37e72cd..25090e9 100644
--- a/servlet/src/test/java/io/undertow/servlet/test/defaultservlet/DefaultServletCachingTestCase.java
+++ b/servlet/src/test/java/io/undertow/servlet/test/defaultservlet/DefaultServletCachingTestCase.java
@@ -86,7 +86,7 @@
                 .setClassLoader(ServletPathMappingTestCase.class.getClassLoader())
                 .setContextPath("/servletContext")
                 .setDeploymentName("servletContext.war")
-                .setResourceManager(new CachingResourceManager(100, 10000, dataCache, new PathResourceManager(tmpDir, 10485760), METADATA_MAX_AGE));
+                .setResourceManager(new CachingResourceManager(100, 10000, dataCache, new PathResourceManager(tmpDir, 10485760, false, false, false), METADATA_MAX_AGE));
 
         builder.addServlet(new ServletInfo("DefaultTestServlet", PathTestServlet.class)
                 .addMapping("/path/default"))
