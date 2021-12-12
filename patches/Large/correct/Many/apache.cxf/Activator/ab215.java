diff --git a/distribution/src/main/release/samples/jax_rs/minimal_osgi/src/main/java/minimalosgi/Activator.java b/distribution/src/main/release/samples/jax_rs/minimal_osgi/src/main/java/minimalosgi/Activator.java
index c1a223a..337a9bf 100644
--- a/distribution/src/main/release/samples/jax_rs/minimal_osgi/src/main/java/minimalosgi/Activator.java
+++ b/distribution/src/main/release/samples/jax_rs/minimal_osgi/src/main/java/minimalosgi/Activator.java
@@ -51,7 +51,7 @@
                 public Object addingService(ServiceReference serviceReference) {
                     try {
                         HttpService service = (HttpService)_context.getService(serviceReference);
-                        Map<String, String> initParams = new Hashtable<String, String>();
+                        Hashtable<String, String> initParams = new Hashtable<String, String>();
                         initParams.put("javax.ws.rs.Application", SampleApplication.class.getName());
                         service.registerServlet(_path, new SampleServlet(), initParams, null);
                         return service;
