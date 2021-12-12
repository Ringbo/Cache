diff --git a/library/src/main/java/com/bumptech/glide/manager/SupportRequestManagerFragment.java b/library/src/main/java/com/bumptech/glide/manager/SupportRequestManagerFragment.java
index 6fa4b4c..df141b5 100644
--- a/library/src/main/java/com/bumptech/glide/manager/SupportRequestManagerFragment.java
+++ b/library/src/main/java/com/bumptech/glide/manager/SupportRequestManagerFragment.java
@@ -154,7 +154,7 @@
     super.onAttach(activity);
     try {
       registerFragmentWithRoot(getActivity());
-    } catch (IllegalArgumentException e) {
+    } catch (IllegalStateException e) {
       // OnAttach can be called after the activity is destroyed, see #497.
       if (Log.isLoggable(TAG, Log.WARN)) {
         Log.w(TAG, "Unable to register fragment with root", e);
