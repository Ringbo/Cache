diff --git a/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java b/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
index 4269eb7..a4b8441 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
@@ -1024,7 +1024,7 @@
             //if it was not shown yet
             if (!preferences.getBoolean(Drawer.PREF_USER_LEARNED_DRAWER, false)) {
                 //open the drawer
-                mDrawerLayout.openDrawer(mDrawerGravity);
+                mDrawerLayout.openDrawer(mSliderLayout);
 
                 //save that it showed up once ;)
                 SharedPreferences.Editor editor = preferences.edit();
