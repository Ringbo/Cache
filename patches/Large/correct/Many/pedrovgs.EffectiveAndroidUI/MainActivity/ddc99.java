diff --git a/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/activity/MainActivity.java b/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/activity/MainActivity.java
index 6a4dabe..cd634ad 100644
--- a/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/activity/MainActivity.java
+++ b/app/src/main/java/com/github/pedrovgs/effectiveandroidui/ui/activity/MainActivity.java
@@ -31,7 +31,7 @@
         (TvShowDraggableFragment) getSupportFragmentManager().findFragmentById(
             R.id.f_tv_show_draggable);
     tvShowFragment = (TvShowFragment) getSupportFragmentManager().findFragmentById(R.id.f_tv_show);
-    if(tvShowFragment!=null){
+    if (tvShowFragment != null && tvShowDraggableFragment != null) {
       tvShowDraggableFragment.disableSaveInstanceState();
     }
   }
