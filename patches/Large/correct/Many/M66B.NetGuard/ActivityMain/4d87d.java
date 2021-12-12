diff --git a/app/src/main/java/eu/faircode/netguard/ActivityMain.java b/app/src/main/java/eu/faircode/netguard/ActivityMain.java
index a251857..dfffd67 100644
--- a/app/src/main/java/eu/faircode/netguard/ActivityMain.java
+++ b/app/src/main/java/eu/faircode/netguard/ActivityMain.java
@@ -420,7 +420,7 @@
     }
 
     private void menu_system(SharedPreferences prefs) {
-        prefs.edit().putBoolean("manage_system", !prefs.getBoolean("manage_system", true)).apply();
+        prefs.edit().putBoolean("manage_system", !prefs.getBoolean("manage_system", false)).apply();
         updateApplicationList();
         SinkholeService.reload(null, this);
     }
