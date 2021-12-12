diff --git a/core/java/android/webkit/WebView.java b/core/java/android/webkit/WebView.java
index a11f12a..5403bf7 100644
--- a/core/java/android/webkit/WebView.java
+++ b/core/java/android/webkit/WebView.java
@@ -4955,7 +4955,7 @@
     public boolean copySelection() {
         boolean copiedSomething = false;
         String selection = getSelection();
-        if (selection != "") {
+        if (selection != null && selection != "") {
             if (DebugFlags.WEB_VIEW) {
                 Log.v(LOGTAG, "copySelection \"" + selection + "\"");
             }
