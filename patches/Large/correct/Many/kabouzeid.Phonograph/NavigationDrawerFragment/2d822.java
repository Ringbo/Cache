diff --git a/app/src/main/java/com/kabouzeid/gramophone/ui/fragments/NavigationDrawerFragment.java b/app/src/main/java/com/kabouzeid/gramophone/ui/fragments/NavigationDrawerFragment.java
index 5c8ec9a..d340b74 100644
--- a/app/src/main/java/com/kabouzeid/gramophone/ui/fragments/NavigationDrawerFragment.java
+++ b/app/src/main/java/com/kabouzeid/gramophone/ui/fragments/NavigationDrawerFragment.java
@@ -158,7 +158,7 @@
                 new Handler().postDelayed(new Runnable() {
                     @Override
                     public void run() {
-                        drawerLayout.closeDrawer(fragmentContainerView);
+                        drawerLayout.closeDrawers();
                     }
                 }, 200);
             }
