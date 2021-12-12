diff --git a/src/org/wordpress/android/ViewPosts.java b/src/org/wordpress/android/ViewPosts.java
index 5e69d87..adabaa9 100644
--- a/src/org/wordpress/android/ViewPosts.java
+++ b/src/org/wordpress/android/ViewPosts.java
@@ -310,7 +310,7 @@
 
 					public void onItemClick(AdapterView<?> arg0, View v,
 							int position, long id) {
-						if (v != null) {
+						if (v != null && !postIDs[position].equals("draftsHeader") && !postIDs[position].equals("postsHeader")) {
 							selectedPosition = position;
 							selectedID = v.getId();
 							Post post = new Post(WordPress.currentBlog.getId(),
