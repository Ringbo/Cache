diff --git a/src/it/feio/android/omninotes/MainActivity.java b/src/it/feio/android/omninotes/MainActivity.java
index b0048e3..6bb97f5 100644
--- a/src/it/feio/android/omninotes/MainActivity.java
+++ b/src/it/feio/android/omninotes/MainActivity.java
@@ -266,7 +266,7 @@
 
 	
 	public DrawerLayout getDrawerLayout() {
-		if (mFragmentManager.findFragmentById(R.id.navigation_drawer) != null) {
+		if (mFragmentManager!= null && mFragmentManager.findFragmentById(R.id.navigation_drawer) != null) {
 			return ((NavigationDrawerFragment)mFragmentManager.findFragmentById(R.id.navigation_drawer)).mDrawerLayout;
 		} else {
 			return null;
