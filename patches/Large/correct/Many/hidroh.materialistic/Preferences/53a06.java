diff --git a/app/src/main/java/io/github/hidroh/materialistic/Preferences.java b/app/src/main/java/io/github/hidroh/materialistic/Preferences.java
index ede6e3d..dab778e 100644
--- a/app/src/main/java/io/github/hidroh/materialistic/Preferences.java
+++ b/app/src/main/java/io/github/hidroh/materialistic/Preferences.java
@@ -138,11 +138,11 @@
     }
 
     public static boolean autoMarkAsViewed(Context context) {
-        return get(context, R.string.pref_auto_viewed, true);
+        return get(context, R.string.pref_auto_viewed, false);
     }
 
     static boolean navigationEnabled(Context context) {
-        return get(context, R.string.pref_navigation, true);
+        return get(context, R.string.pref_navigation, false);
     }
 
     static boolean customChromeTabEnabled(Context context) {
