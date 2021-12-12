diff --git a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsActivity.java
index a062856..bb174d4 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/stats/StatsActivity.java
@@ -299,7 +299,6 @@
         }
         FragmentManager fm = getFragmentManager();
         FragmentTransaction ft = fm.beginTransaction();
-        //ft.setCustomAnimations(R.anim.stats_fragment_in, R.anim.stats_fragment_out);
 
         StatsAbstractFragment fragment;
 
@@ -362,7 +361,7 @@
             }
         }
 
-        ft.commit();
+        ft.commitAllowingStateLoss();
     }
 
     // AuthorsFragment should be dismissed when 0 or 1 author.
