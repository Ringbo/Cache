diff --git a/app/src/main/java/eu/faircode/netguard/ActivityMain.java b/app/src/main/java/eu/faircode/netguard/ActivityMain.java
index fc68ebc..acddb39 100644
--- a/app/src/main/java/eu/faircode/netguard/ActivityMain.java
+++ b/app/src/main/java/eu/faircode/netguard/ActivityMain.java
@@ -535,7 +535,7 @@
 
         if (prefs.getBoolean("manage_system", false)) {
             menu.findItem(R.id.menu_app_user).setChecked(prefs.getBoolean("show_user", true));
-            menu.findItem(R.id.menu_app_system).setChecked(prefs.getBoolean("show_system", true));
+            menu.findItem(R.id.menu_app_system).setChecked(prefs.getBoolean("show_system", false));
         } else {
             Menu submenu = menu.findItem(R.id.menu_filter).getSubMenu();
             submenu.removeItem(R.id.menu_app_user);
