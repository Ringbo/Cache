diff --git a/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
index 05e140c..6ddf745 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserActivity.java
@@ -205,7 +205,7 @@
                         int count = array.length();
                         for (int i = 0; i < count; i++) {
                             JSONObject object = array.getJSONObject(i);
-                            Theme theme = Theme.fromJSON(object);
+                            Theme theme = Theme.fromJSONV1_2(object);
                             if (theme != null) {
                                 theme.save();
                                 themes.add(theme);
