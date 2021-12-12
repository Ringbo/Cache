diff --git a/src/org/wordpress/android/ui/posts/EditPostSettingsFragment.java b/src/org/wordpress/android/ui/posts/EditPostSettingsFragment.java
index de26661..bafe6c5 100644
--- a/src/org/wordpress/android/ui/posts/EditPostSettingsFragment.java
+++ b/src/org/wordpress/android/ui/posts/EditPostSettingsFragment.java
@@ -168,7 +168,7 @@
             if (mActivity.getPost().getBlog().getPostFormats().equals("")) {
                 List<Object> args = new Vector<Object>();
                 args.add(mActivity.getPost().getBlog());
-                args.add(this);
+                args.add(mActivity);
                 new ApiHelper.getPostFormatsTask().execute(args);
                 mPostFormatTitles = getResources().getStringArray(R.array.post_formats_array);
                 String defaultPostFormatTitles[] = {"aside", "audio", "chat", "gallery", "image", "link", "quote", "standard", "status", "video"};
