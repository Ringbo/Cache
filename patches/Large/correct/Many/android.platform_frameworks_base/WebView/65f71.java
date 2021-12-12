diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index fd0780f..03382c3b 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -4590,7 +4590,7 @@
         // user has touched a layer.
         float gestureX = x;
         float gestureY = y;
-        if (!detector.isInProgress()) {
+        if (detector == null || !detector.isInProgress()) {
             // The gesture for scrolling a layer is two fingers close together.
             // FIXME: we may consider giving WebKit an option to handle
             // multi-touch events later.
