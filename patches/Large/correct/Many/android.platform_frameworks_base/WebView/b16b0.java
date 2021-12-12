diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index 0d34ff6..eeb5b7b 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -6215,7 +6215,7 @@
                     if (hscroll != 0 || vscroll != 0) {
                         final int vdelta = (int) (vscroll * getVerticalScrollFactor());
                         final int hdelta = (int) (hscroll * getHorizontalScrollFactor());
-                        if (pinScrollBy(hdelta, vdelta, true, 0)) {
+                        if (pinScrollBy(hdelta, vdelta, false, 0)) {
                             return true;
                         }
                     }
