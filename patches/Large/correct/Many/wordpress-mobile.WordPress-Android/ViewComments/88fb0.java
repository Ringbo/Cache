diff --git a/src/org/wordpress/android/ViewComments.java b/src/org/wordpress/android/ViewComments.java
index 5994de3..a8902bd 100644
--- a/src/org/wordpress/android/ViewComments.java
+++ b/src/org/wordpress/android/ViewComments.java
@@ -594,13 +594,13 @@
 
 			if (position == selectedPosition && sdk_version >= 11
 					&& detailViewVisible) {
-				row.setBackground(getResources().getDrawable(
+				row.setBackgroundDrawable(getResources().getDrawable(
 						R.drawable.list_highlight_bg));
 			} else if ("hold".equals(commentEntry.status)) {
-				row.setBackground(getResources().getDrawable(
+				row.setBackgroundDrawable(getResources().getDrawable(
 						R.drawable.comment_pending_bg_selector));
 			} else {
-				row.setBackground(getResources().getDrawable(
+				row.setBackgroundDrawable(getResources().getDrawable(
 						R.drawable.list_bg_selector));
 			}
 
