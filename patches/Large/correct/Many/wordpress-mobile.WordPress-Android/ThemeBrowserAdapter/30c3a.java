diff --git a/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserAdapter.java b/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserAdapter.java
index cff0ce3..0b2ed97 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserAdapter.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserAdapter.java
@@ -103,7 +103,7 @@
         return position;
     }
 
-    public void setThemeList(@NonNull List<ThemeModel> themes) {
+    void setThemeList(@NonNull List<ThemeModel> themes) {
         mThemes.clear();
         mThemes.addAll(themes);
 
@@ -187,7 +187,7 @@
         if (header != null) {
             holder.headerView.setVisibility(View.VISIBLE);
             holder.headerText.setText(header.text);
-            holder.headerCount.setText(Integer.toString(header.count));
+            holder.headerCount.setText(String.valueOf(header.count));
         } else {
             holder.headerView.setVisibility(View.GONE);
         }
