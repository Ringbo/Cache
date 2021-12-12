diff --git a/app/src/main/java/com/naman14/timber/activities/MainActivity.java b/app/src/main/java/com/naman14/timber/activities/MainActivity.java
index 80069c2..20a9d4b 100644
--- a/app/src/main/java/com/naman14/timber/activities/MainActivity.java
+++ b/app/src/main/java/com/naman14/timber/activities/MainActivity.java
@@ -472,7 +472,7 @@
             QuickControlsFragment fragment1 = new QuickControlsFragment();
             FragmentManager fragmentManager1 = getSupportFragmentManager();
             fragmentManager1.beginTransaction()
-                    .replace(R.id.quickcontrols_container, fragment1).commit();
+                    .replace(R.id.quickcontrols_container, fragment1).commitAllowingStateLoss();
             return "Executed";
         }
 
