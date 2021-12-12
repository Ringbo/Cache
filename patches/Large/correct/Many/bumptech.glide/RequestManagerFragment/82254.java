diff --git a/library/src/main/java/com/bumptech/glide/manager/RequestManagerFragment.java b/library/src/main/java/com/bumptech/glide/manager/RequestManagerFragment.java
index 1650bf2..86cb7bd 100644
--- a/library/src/main/java/com/bumptech/glide/manager/RequestManagerFragment.java
+++ b/library/src/main/java/com/bumptech/glide/manager/RequestManagerFragment.java
@@ -165,7 +165,7 @@
     super.onAttach(activity);
     try {
       registerFragmentWithRoot(activity);
-    } catch (IllegalArgumentException e) {
+    } catch (IllegalStateException e) {
       // OnAttach can be called after the activity is destroyed, see #497.
       if (Log.isLoggable(TAG, Log.WARN)) {
         Log.w(TAG, "Unable to register fragment with root", e);
