diff --git a/cas-server-integration-memcached/src/main/java/org/jasig/cas/ticket/registry/support/kryo/serial/RegisteredServiceSerializer.java b/cas-server-integration-memcached/src/main/java/org/jasig/cas/ticket/registry/support/kryo/serial/RegisteredServiceSerializer.java
index d345d25..cd1bd3d 100644
--- a/cas-server-integration-memcached/src/main/java/org/jasig/cas/ticket/registry/support/kryo/serial/RegisteredServiceSerializer.java
+++ b/cas-server-integration-memcached/src/main/java/org/jasig/cas/ticket/registry/support/kryo/serial/RegisteredServiceSerializer.java
@@ -36,7 +36,7 @@
      * we need to be able to return a default/mock url.
      * @return mock url
      */
-    private URL getEmptyUrl() {
+    private static URL getEmptyUrl() {
         try {
             return new URL("https://");
         } catch (final Exception e) {
