diff --git a/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java b/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
index a1e4d37..ea801cf 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/DrawerBuilder.java
@@ -1301,7 +1301,7 @@
         }
 
         //set the shadow for the drawer
-        if (Build.VERSION.SDK_INT < 21) {
+        if (Build.VERSION.SDK_INT < 21 && mDrawerLayout != null) {
             mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, mDrawerGravity);
         }
 
