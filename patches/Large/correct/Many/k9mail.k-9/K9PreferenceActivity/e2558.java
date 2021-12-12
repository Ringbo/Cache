diff --git a/src/com/fsck/k9/activity/K9PreferenceActivity.java b/src/com/fsck/k9/activity/K9PreferenceActivity.java
index 5fa44cb..1b83b68 100644
--- a/src/com/fsck/k9/activity/K9PreferenceActivity.java
+++ b/src/com/fsck/k9/activity/K9PreferenceActivity.java
@@ -14,9 +14,9 @@
     public void onCreate(Bundle icicle) {
         K9Activity.setLanguage(this, K9.getK9Language());
 
-        if (Build.VERSION.SDK_INT >= 6 && Build.VERSION.SDK_INT < 11) {
-            // there's a display bug in 2.1, 2.2, 2.3 (unsure about 2.0)
-            // which causes PreferenceScreens to have a black background.
+        if (Build.VERSION.SDK_INT >= 6 && Build.VERSION.SDK_INT < 14) {
+            // There's a display bug in all supported Android versions before 4.0 (SDK 14) which
+            // causes PreferenceScreens to have a black background.
             // http://code.google.com/p/android/issues/detail?id=4611
             setTheme(K9.getK9ThemeResourceId(K9.THEME_DARK));
         } else {
