diff --git a/core/java/android/webkit/BrowserFrame.java b/core/java/android/webkit/BrowserFrame.java
index 97bbd5a..cdb6959 100644
--- a/core/java/android/webkit/BrowserFrame.java
+++ b/core/java/android/webkit/BrowserFrame.java
@@ -217,7 +217,7 @@
 
         if (sConfigCallback == null) {
             sConfigCallback = new ConfigCallback(
-                    (WindowManager) context.getSystemService(
+                    (WindowManager) appContext.getSystemService(
                             Context.WINDOW_SERVICE));
             ViewRoot.addConfigCallback(sConfigCallback);
         }
