diff --git a/test/org/apache/catalina/startup/TestTomcat.java b/test/org/apache/catalina/startup/TestTomcat.java
index be3295d..667fa21 100644
--- a/test/org/apache/catalina/startup/TestTomcat.java
+++ b/test/org/apache/catalina/startup/TestTomcat.java
@@ -88,8 +88,7 @@
         // You can customize the context by calling 
         // its API
         
-        tomcat.addServlet(ctx, "myServlet", 
-                new HelloWorld());
+        Tomcat.addServlet(ctx, "myServlet", new HelloWorld());
         ctx.addServletMapping("/", "myServlet");
         
         tomcat.start();
@@ -103,9 +102,7 @@
         File appDir = 
             new File(base + "output/build/webapps/examples");
         // app dir is relative to server home
-        StandardContext ctx = 
-            tomcat.addWebapp(null, "/examples", 
-                    appDir.getAbsolutePath());
+        tomcat.addWebapp(null, "/examples", appDir.getAbsolutePath());
         
         tomcat.start();
 
