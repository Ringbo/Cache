diff --git a/src/org/wordpress/android/ui/stats/StatsAbsListViewFragment.java b/src/org/wordpress/android/ui/stats/StatsAbsListViewFragment.java
index e167ca9..5660d6b 100644
--- a/src/org/wordpress/android/ui/stats/StatsAbsListViewFragment.java
+++ b/src/org/wordpress/android/ui/stats/StatsAbsListViewFragment.java
@@ -81,7 +81,7 @@
         }
         
         Fragment fragment = getFragment(0);
-        getChildFragmentManager().beginTransaction().add(R.id.stats_pager_container, fragment).commit();
+        getChildFragmentManager().beginTransaction().replace(R.id.stats_pager_container, fragment).commit();
         
     }
 
