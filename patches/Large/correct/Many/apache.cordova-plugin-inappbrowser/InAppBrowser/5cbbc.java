diff --git a/src/android/InAppBrowser.java b/src/android/InAppBrowser.java
index b54c224..07ac31e 100644
--- a/src/android/InAppBrowser.java
+++ b/src/android/InAppBrowser.java
@@ -688,7 +688,7 @@
                 RelativeLayout.LayoutParams closeLayoutParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT);
                 closeLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
                 close.setLayoutParams(closeLayoutParams);
-                forward.setContentDescription("Close Button");
+                close.setContentDescription("Close Button");
                 close.setId(Integer.valueOf(5));
                 int closeResId = activityRes.getIdentifier("ic_action_remove", "drawable", cordova.getActivity().getPackageName());
                 Drawable closeIcon = activityRes.getDrawable(closeResId);
