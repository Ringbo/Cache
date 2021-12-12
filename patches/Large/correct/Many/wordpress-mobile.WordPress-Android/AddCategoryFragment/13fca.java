diff --git a/WordPress/src/main/java/org/wordpress/android/ui/posts/AddCategoryFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/posts/AddCategoryFragment.java
index 35be8a8..a02ff87 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/posts/AddCategoryFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/posts/AddCategoryFragment.java
@@ -85,7 +85,7 @@
 
         if (mSite == null) {
             ToastUtils.showToast(getActivity(), R.string.blog_not_found, ToastUtils.Duration.SHORT);
-            getDialog().cancel();
+            getFragmentManager().popBackStack();
         }
     }
 
