diff --git a/src/org/wordpress/android/ui/posts/EditPostSettingsFragment.java b/src/org/wordpress/android/ui/posts/EditPostSettingsFragment.java
index a34d2f8..3016ba4 100644
--- a/src/org/wordpress/android/ui/posts/EditPostSettingsFragment.java
+++ b/src/org/wordpress/android/ui/posts/EditPostSettingsFragment.java
@@ -432,7 +432,7 @@
         String excerpt = (mExcerptEditText.getText() != null) ? mExcerptEditText.getText().toString() : "";
 
         long pubDateTimestamp = 0;
-        if (mIsCustomPubDate && pubDate.equals(getResources().getText(R.string.immediately))) {
+        if (mIsCustomPubDate && pubDate.equals(getResources().getText(R.string.immediately)) && !post.isLocalDraft()) {
             Calendar c = Calendar.getInstance();
             mYear = c.get(Calendar.YEAR);
             mMonth = c.get(Calendar.MONTH);
