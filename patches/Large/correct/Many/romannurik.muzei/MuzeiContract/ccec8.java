diff --git a/api/src/main/java/com/google/android/apps/muzei/api/MuzeiContract.java b/api/src/main/java/com/google/android/apps/muzei/api/MuzeiContract.java
index 5f10129..aae1b6d 100644
--- a/api/src/main/java/com/google/android/apps/muzei/api/MuzeiContract.java
+++ b/api/src/main/java/com/google/android/apps/muzei/api/MuzeiContract.java
@@ -453,6 +453,7 @@
              *
              * <ul>
              * <li><code>content://...</code>.</li>
+             * <li><code>android.resource://...</code>.</li>
              * <li><code>file://...</code>.</li>
              * <li><code>file:///android_asset/...</code>.</li>
              * <li><code>http://...</code> or <code>https://...</code>.</li>
@@ -554,7 +555,7 @@
                 }
 
                 InputStream in = null;
-                if ("content".equals(scheme)) {
+                if ("content".equals(scheme) || "android.resource".equals(scheme)) {
                     try {
                         in = contentResolver.openInputStream(uri);
                     } catch (SecurityException e) {
