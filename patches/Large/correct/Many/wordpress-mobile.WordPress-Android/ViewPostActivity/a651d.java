diff --git a/src/org/wordpress/android/ui/posts/ViewPostActivity.java b/src/org/wordpress/android/ui/posts/ViewPostActivity.java
index 5579cfb..b42e3ec 100644
--- a/src/org/wordpress/android/ui/posts/ViewPostActivity.java
+++ b/src/org/wordpress/android/ui/posts/ViewPostActivity.java
@@ -13,7 +13,7 @@
             // During initial setup, plug in the details fragment.
             ViewPostFragment postFragment = new ViewPostFragment();
             getSupportFragmentManager().beginTransaction().add(
-                    android.R.id.content, postFragment).commit();
+                    android.R.id.content, postFragment).commitAllowingStateLoss();
         }
     }
 
