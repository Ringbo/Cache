diff --git a/src/org/wordpress/android/ViewPosts.java b/src/org/wordpress/android/ViewPosts.java
index 502f395..5677717 100644
--- a/src/org/wordpress/android/ViewPosts.java
+++ b/src/org/wordpress/android/ViewPosts.java
@@ -648,10 +648,10 @@
 			} else {
 				if (position == selectedPosition && sdk_version >= 11
 						&& detailViewVisible) {
-					pv.setBackground(getResources().getDrawable(
+					pv.setBackgroundDrawable(getResources().getDrawable(
 							R.drawable.list_highlight_bg));
 				} else {
-					pv.setBackground(getResources().getDrawable(
+					pv.setBackgroundDrawable(getResources().getDrawable(
 							R.drawable.list_bg_selector));
 				}
 				wrapper.getTitle().setPadding(12, 12, 12, 0);
