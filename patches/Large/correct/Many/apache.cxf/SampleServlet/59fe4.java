diff --git a/distribution/src/main/release/samples/jax_rs/minimal_osgi/src/main/java/minimalosgi/SampleServlet.java b/distribution/src/main/release/samples/jax_rs/minimal_osgi/src/main/java/minimalosgi/SampleServlet.java
index aa517d1..a75274c 100644
--- a/distribution/src/main/release/samples/jax_rs/minimal_osgi/src/main/java/minimalosgi/SampleServlet.java
+++ b/distribution/src/main/release/samples/jax_rs/minimal_osgi/src/main/java/minimalosgi/SampleServlet.java
@@ -29,7 +29,8 @@
     private static final long serialVersionUID = -1531317723099896635L;
 
     @Override
-    protected Application createApplicationInstance(String appClassName, ServletConfig servletConfig) {
+    protected Application createApplicationInstance(String appClassName, ServletConfig servletConfig) 
+        throws ServletException {
         return new SampleApplication();
     }
 
