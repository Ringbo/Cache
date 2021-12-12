diff --git a/src/platform/src/main/java/org/geoserver/platform/GeoServerHttpSessionListenerProxy.java b/src/platform/src/main/java/org/geoserver/platform/GeoServerHttpSessionListenerProxy.java
index 594f159..a4cdcd0 100644
--- a/src/platform/src/main/java/org/geoserver/platform/GeoServerHttpSessionListenerProxy.java
+++ b/src/platform/src/main/java/org/geoserver/platform/GeoServerHttpSessionListenerProxy.java
@@ -52,7 +52,7 @@
 
     protected Set<HttpSessionListener> listeners() {
         if (listeners == null) {
-            synchronized (listeners) {
+            synchronized (this) {
                 if (listeners == null) {
                     listeners =
                             new LinkedHashSet<HttpSessionListener>(
