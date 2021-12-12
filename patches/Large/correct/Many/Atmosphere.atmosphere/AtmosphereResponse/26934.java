diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java
index cb71799..fb06219 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereResponse.java
@@ -827,7 +827,7 @@
      * Close the associated {@link PrintWriter} or {@link java.io.OutputStream}
      */
     public void closeStreamOrWriter() {
-        if (resource().transport() != AtmosphereResource.TRANSPORT.WEBSOCKET) {
+        if (resource() != null && resource().transport() != AtmosphereResource.TRANSPORT.WEBSOCKET) {
             try {
                 boolean isUsingStream = (Boolean) request().getAttribute(PROPERTY_USE_STREAM);
                 if (isUsingStream) {
