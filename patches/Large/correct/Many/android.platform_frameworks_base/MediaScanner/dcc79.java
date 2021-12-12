diff --git a/media/java/android/media/MediaScanner.java b/media/java/android/media/MediaScanner.java
index 9ea6722..f9465ed 100644
--- a/media/java/android/media/MediaScanner.java
+++ b/media/java/android/media/MediaScanner.java
@@ -1355,7 +1355,7 @@
             prescan(path, true);
 
             File file = new File(path);
-            if (!file.exists()) {
+            if (!file.exists() || !file.canRead()) {
                 return null;
             }
 
