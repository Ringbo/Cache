diff --git a/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserFragment.java
index 31467c7..5c7cffe 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/themes/ThemeBrowserFragment.java
@@ -72,7 +72,7 @@
         mEmptyView = (TextView) view.findViewById(R.id.text_empty);
 
         configureGridView(inflater, view);
-        configureSwipeToRefresh(savedInstanceState, view);
+        configureSwipeToRefresh(view);
         restoreState(savedInstanceState);
 
         return view;
