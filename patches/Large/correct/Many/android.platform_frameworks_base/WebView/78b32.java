diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index 3102ee9..f78eb1f 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -4101,7 +4101,9 @@
                 df = mScrollFilter;
             }
             canvas.setDrawFilter(df);
-            int content = nativeDraw(canvas, color, extras, true);
+            // XXX: Revisit splitting content.  Right now it causes a
+            // synchronization problem with layers.
+            int content = nativeDraw(canvas, color, extras, false);
             canvas.setDrawFilter(null);
             if (content != 0) {
                 mWebViewCore.sendMessage(EventHub.SPLIT_PICTURE_SET, content, 0);
