diff --git a/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginList.java b/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginList.java
index 5668313..3a1f53a 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginList.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginList.java
@@ -35,7 +35,7 @@
     }
 
     @Nullable Object getItem(int position) {
-        if (position < size()) {
+        if (position >= 0 && position < size()) {
             return get(position);
         }
         return null;
