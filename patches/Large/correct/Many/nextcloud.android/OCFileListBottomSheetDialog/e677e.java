diff --git a/src/main/java/com/owncloud/android/ui/fragment/OCFileListBottomSheetDialog.java b/src/main/java/com/owncloud/android/ui/fragment/OCFileListBottomSheetDialog.java
index e3fdcfe..394cd86 100644
--- a/src/main/java/com/owncloud/android/ui/fragment/OCFileListBottomSheetDialog.java
+++ b/src/main/java/com/owncloud/android/ui/fragment/OCFileListBottomSheetDialog.java
@@ -73,13 +73,13 @@
 
         unbinder = ButterKnife.bind(this, view);
 
-        int primaryColor = ThemeUtils.primaryColor();
+        int primaryColor = ThemeUtils.primaryColor(getContext());
         ThemeUtils.tintDrawable(iconUploadFiles.getDrawable(), primaryColor);
         ThemeUtils.tintDrawable(iconUploadFromApp.getDrawable(), primaryColor);
         ThemeUtils.tintDrawable(iconMakeDir.getDrawable(), primaryColor);
 
         headline.setText(getContext().getResources().getString(R.string.add_to_cloud,
-                ThemeUtils.getDefaultDisplayNameForRootFolder()));
+                ThemeUtils.getDefaultDisplayNameForRootFolder(getContext())));
 
         setOnShowListener(d ->
                 BottomSheetBehavior.from((View) view.getParent()).setPeekHeight(view.getMeasuredHeight())
