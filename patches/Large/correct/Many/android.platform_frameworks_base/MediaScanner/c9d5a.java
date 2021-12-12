diff --git a/media/java/android/media/MediaScanner.java b/media/java/android/media/MediaScanner.java
index 01485b8..72f3e1a 100644
--- a/media/java/android/media/MediaScanner.java
+++ b/media/java/android/media/MediaScanner.java
@@ -1426,7 +1426,7 @@
         }
 
         int firstSlash = path.lastIndexOf('/');
-        if (firstSlash == 0) {
+        if (firstSlash <= 0) {
             return false;
         }
         String parent = path.substring(0,  firstSlash);
