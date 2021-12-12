diff --git a/app/src/main/java/org/isoron/uhabits/ui/habits/list/ListHabitsScreen.java b/app/src/main/java/org/isoron/uhabits/ui/habits/list/ListHabitsScreen.java
index e34fd89..3e4b095 100644
--- a/app/src/main/java/org/isoron/uhabits/ui/habits/list/ListHabitsScreen.java
+++ b/app/src/main/java/org/isoron/uhabits/ui/habits/list/ListHabitsScreen.java
@@ -207,7 +207,7 @@
     private void refreshTheme()
     {
         new Handler().postDelayed(() -> {
-            Intent intent = new Intent(activity, ListHabitsActivity.class);
+            Intent intent = new Intent(activity, MainActivity.class);
 
             activity.finish();
             activity.overridePendingTransition(android.R.anim.fade_in,
