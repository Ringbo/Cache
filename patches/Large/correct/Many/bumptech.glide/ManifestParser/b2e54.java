diff --git a/library/src/main/java/com/bumptech/glide/module/ManifestParser.java b/library/src/main/java/com/bumptech/glide/module/ManifestParser.java
index 4419e03..6b4fde3 100644
--- a/library/src/main/java/com/bumptech/glide/module/ManifestParser.java
+++ b/library/src/main/java/com/bumptech/glide/module/ManifestParser.java
@@ -26,7 +26,7 @@
                     context.getPackageName(), PackageManager.GET_META_DATA);
             if (appInfo.metaData != null) {
                 for (String key : appInfo.metaData.keySet()) {
-                    if (GLIDE_MODULE_VALUE.equals(appInfo.metaData.getString(key))) {
+                    if (GLIDE_MODULE_VALUE.equals(appInfo.metaData.get(key))) {
                         modules.add(parseModule(key));
                     }
                 }
