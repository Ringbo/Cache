diff --git a/src/main/java/com/owncloud/android/ui/activity/UserInfoActivity.java b/src/main/java/com/owncloud/android/ui/activity/UserInfoActivity.java
index 71104bd..66d0579 100644
--- a/src/main/java/com/owncloud/android/ui/activity/UserInfoActivity.java
+++ b/src/main/java/com/owncloud/android/ui/activity/UserInfoActivity.java
@@ -342,7 +342,7 @@
         public void onStart() {
             super.onStart();
 
-            int color = ThemeUtils.primaryAccentColor(getContext());
+            int color = ThemeUtils.primaryAccentColor(getActivity());
 
             AlertDialog alertDialog = (AlertDialog) getDialog();
 
