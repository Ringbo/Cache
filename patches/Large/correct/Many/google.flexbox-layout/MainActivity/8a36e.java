diff --git a/app/src/main/java/com/google/android/apps/flexbox/MainActivity.java b/app/src/main/java/com/google/android/apps/flexbox/MainActivity.java
index eacd64e..e609bb2 100644
--- a/app/src/main/java/com/google/android/apps/flexbox/MainActivity.java
+++ b/app/src/main/java/com/google/android/apps/flexbox/MainActivity.java
@@ -82,7 +82,7 @@
                 this, drawer, toolbar, R.string.navigation_drawer_open,
                 R.string.navigation_drawer_close);
         if (drawer != null) {
-            drawer.setDrawerListener(toggle);
+            drawer.addDrawerListener(toggle);
         }
         toggle.syncState();
 
