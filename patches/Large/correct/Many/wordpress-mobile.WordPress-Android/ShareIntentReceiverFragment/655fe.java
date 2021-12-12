diff --git a/WordPress/src/main/java/org/wordpress/android/ui/ShareIntentReceiverFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/ShareIntentReceiverFragment.java
index 2ecbd69..2819171 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/ShareIntentReceiverFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/ShareIntentReceiverFragment.java
@@ -99,7 +99,7 @@
     public void onSaveInstanceState(Bundle outState) {
         super.onSaveInstanceState(outState);
         int selectedItemLocalId = mAdapter.getSelectedItemLocalId();
-        if (selectedItemLocalId != 1) {
+        if (selectedItemLocalId != -1) {
             outState.putInt(ARG_LAST_USED_BLOG_LOCAL_ID, mAdapter.getSelectedItemLocalId());
         }
     }
