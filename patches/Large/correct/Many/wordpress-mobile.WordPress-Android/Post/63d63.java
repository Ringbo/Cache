diff --git a/src/org/wordpress/android/models/Post.java b/src/org/wordpress/android/models/Post.java
index 283fd13..06df1a4 100644
--- a/src/org/wordpress/android/models/Post.java
+++ b/src/org/wordpress/android/models/Post.java
@@ -985,8 +985,8 @@
 						curImagePath = mf.getFileName();
 
 						if (i == 0
-								|| (post.blog.isFullSizeImage() || post.blog
-										.isScaledImage())) {
+								|| ((post.blog.isFullSizeImage() || post.blog
+										.isScaledImage()) && !post.blog.getMaxImageWidth().equals("Original Size"))) {
 
 							Uri imageUri = Uri.parse(curImagePath);
 							File jpeg = null;
@@ -1182,7 +1182,7 @@
 								} else {
 									if (i == 0
 											&& (post.blog.isFullSizeImage() == false && !post.blog
-													.isScaledImage())) {
+													.isScaledImage()) || post.blog.getMaxImageWidth().equals("Original Size")) {
 										content = content + "<a href=\"" + finalThumbnailUrl + "\"><img title=\""
 												+ mf.getTitle() + "\" "
 												+ alignmentCSS
@@ -1191,8 +1191,8 @@
 									}
 								}
 
-								if ((i == 0 && !post.blog.isFullSizeImage() && !post.blog
-										.isScaledImage()) || i == 1) {
+								if ((i == 0 && (!post.blog.isFullSizeImage() && !post.blog
+										.isScaledImage()) || post.blog.getMaxImageWidth().equals("Original Size")) || i == 1) {
 									if (!mf.getCaption().equals("")) {
 										content = String
 												.format("[caption id=\"\" align=\"%s\" width=\"%d\" caption=\"%s\"]%s[/caption]",
