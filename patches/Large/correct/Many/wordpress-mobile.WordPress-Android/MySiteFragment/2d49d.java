diff --git a/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
index a2e473d..9d73c36 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
@@ -280,7 +280,7 @@
         });
 
 
-        mPluginsContainer.setOnClickListener(new OnClickListener() {
+        mActivityLogContainer.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View view) {
                 ActivityLauncher.viewActivityLogList(getActivity(), getSelectedSite());
