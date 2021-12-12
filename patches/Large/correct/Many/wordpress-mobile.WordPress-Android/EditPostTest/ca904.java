diff --git a/tests/java/org/wordpress/android/functional/posts/EditPostTest.java b/tests/java/org/wordpress/android/functional/posts/EditPostTest.java
index c5d7fff..b38f57b 100644
--- a/tests/java/org/wordpress/android/functional/posts/EditPostTest.java
+++ b/tests/java/org/wordpress/android/functional/posts/EditPostTest.java
@@ -20,7 +20,7 @@
         WordPressDB wpdb = WordPress.wpDB;
         Post post = new Post(59073674, false);
         post.setRemotePostId(null);
-        wpdb.savePost(post, 59073674);
+        wpdb.savePost(post);
         mSolo.clickOnText("null postid");
     }
 }
