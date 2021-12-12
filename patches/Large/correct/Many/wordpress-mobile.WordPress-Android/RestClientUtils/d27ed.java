diff --git a/libs/networking/WordPressNetworking/src/main/java/org/wordpress/android/networking/RestClientUtils.java b/libs/networking/WordPressNetworking/src/main/java/org/wordpress/android/networking/RestClientUtils.java
index 0574e3c..0865e7d 100644
--- a/libs/networking/WordPressNetworking/src/main/java/org/wordpress/android/networking/RestClientUtils.java
+++ b/libs/networking/WordPressNetworking/src/main/java/org/wordpress/android/networking/RestClientUtils.java
@@ -320,7 +320,7 @@
         }
 
         String realPath = getSanitizedPath(path);
-        if (!TextUtils.isEmpty(realPath)) {
+        if (TextUtils.isEmpty(realPath)) {
             realPath = path;
         }
         paramsWithLocale.putAll(getSanitizedParameters(path));
@@ -365,7 +365,7 @@
         }
 
         String realPath = getSanitizedPath(path);
-        if (!TextUtils.isEmpty(realPath)) {
+        if (TextUtils.isEmpty(realPath)) {
             realPath = path;
         }
         paramsWithLocale.putAll(getSanitizedParameters(path));
