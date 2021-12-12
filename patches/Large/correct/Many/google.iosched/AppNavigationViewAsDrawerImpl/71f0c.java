diff --git a/android/src/main/java/com/google/samples/apps/iosched/navigation/AppNavigationViewAsDrawerImpl.java b/android/src/main/java/com/google/samples/apps/iosched/navigation/AppNavigationViewAsDrawerImpl.java
index d0067e0..8bd8c16 100644
--- a/android/src/main/java/com/google/samples/apps/iosched/navigation/AppNavigationViewAsDrawerImpl.java
+++ b/android/src/main/java/com/google/samples/apps/iosched/navigation/AppNavigationViewAsDrawerImpl.java
@@ -211,7 +211,7 @@
      * accomplished (perhaps more cleanly) with state-based layouts.
      */
     private void setSelectedNavDrawerItem(NavigationItemEnum item) {
-        if (mNavigationView != null) {
+        if (mNavigationView != null && item != NavigationItemEnum.INVALID) {
             mNavigationView.getMenu().findItem(item.getId()).setChecked(true);
         }
     }
