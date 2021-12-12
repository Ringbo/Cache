diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java
index eaaf479..58f9ee7 100755
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AsynchronousProcessor.java
@@ -232,7 +232,7 @@
      * @throws javax.servlet.ServletException
      */
     protected AtmosphereHandlerWrapper map(HttpServletRequest req) throws ServletException {
-        String path = req.getRequestURI();
+        String path = req.getServletPath() + req.getPathInfo();
         if (path == null || path.length() == 0) {
             path = "/*";
         }
@@ -242,7 +242,7 @@
             final Map<String, String> m = new HashMap<String, String>();
             for (Map.Entry<String,AtmosphereHandlerWrapper> e : config.handlers().entrySet()) {
                 UriTemplate t = new UriTemplate(e.getKey());
-                logger.trace("Trying to map {} to {}", t, path);
+                logger.debug("Trying to map {} to {}", t, path);
                 if (t.match(path, m)) {
                     atmosphereHandlerWrapper = e.getValue();
                     logger.trace("Mapped {} to {}", t, e.getValue());
