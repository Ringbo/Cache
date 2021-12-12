diff --git a/main/src/main/java/org/pdown/gui/DownApplication.java b/main/src/main/java/org/pdown/gui/DownApplication.java
index d483a93..352d742 100644
--- a/main/src/main/java/org/pdown/gui/DownApplication.java
+++ b/main/src/main/java/org/pdown/gui/DownApplication.java
@@ -91,7 +91,7 @@
     initTray();
     initWindow();
     initBrowser();
-    loadUri("", true);
+    loadUri(null, true);
   }
 
 
@@ -307,7 +307,7 @@
     } else {
       Platform.runLater(() -> {
         show(isTray);
-        if (!browser.isLoad()) {
+        if (uri != null || !browser.isLoad()) {
           browser.load(url);
         }
       });
