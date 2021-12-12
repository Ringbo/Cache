diff --git a/api/src/main/java/com/google/android/apps/muzei/api/MuzeiContract.java b/api/src/main/java/com/google/android/apps/muzei/api/MuzeiContract.java
index 5f10129..ce6edcb 100644
--- a/api/src/main/java/com/google/android/apps/muzei/api/MuzeiContract.java
+++ b/api/src/main/java/com/google/android/apps/muzei/api/MuzeiContract.java
@@ -554,7 +554,7 @@
                 }
 
                 InputStream in = null;
-                if ("content".equals(scheme)) {
+                if ("content".equals(scheme) || "android.resource".equals(scheme)) {
                     try {
                         in = contentResolver.openInputStream(uri);
                     } catch (SecurityException e) {
