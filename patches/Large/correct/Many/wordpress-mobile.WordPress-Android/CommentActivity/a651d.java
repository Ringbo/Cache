diff --git a/src/org/wordpress/android/ui/comments/CommentActivity.java b/src/org/wordpress/android/ui/comments/CommentActivity.java
index 7945df4..e0f2386 100644
--- a/src/org/wordpress/android/ui/comments/CommentActivity.java
+++ b/src/org/wordpress/android/ui/comments/CommentActivity.java
@@ -13,7 +13,7 @@
             // During initial setup, plug in the details fragment.
             CommentFragment commentFragment = new CommentFragment();
             getSupportFragmentManager().beginTransaction().add(
-                    android.R.id.content, commentFragment).commit();
+                    android.R.id.content, commentFragment).commitAllowingStateLoss();
             //commentFragment.loadComment(WordPress.currentComment);
         }
     }
