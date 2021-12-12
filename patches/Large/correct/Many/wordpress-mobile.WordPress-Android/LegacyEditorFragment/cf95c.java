diff --git a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/LegacyEditorFragment.java b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/LegacyEditorFragment.java
index 467a6ea..df2b454 100644
--- a/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/LegacyEditorFragment.java
+++ b/libs/editor/WordPressEditor/src/main/java/org/wordpress/android/editor/LegacyEditorFragment.java
@@ -324,7 +324,7 @@
     public void onActivityResult(int requestCode, int resultCode, Intent data) {
         super.onActivityResult(requestCode, resultCode, data);
 
-        if (requestCode == LegacyEditorFragment.ACTIVITY_REQUEST_CODE_CREATE_LINK) {
+        if (requestCode == LegacyEditorFragment.ACTIVITY_REQUEST_CODE_CREATE_LINK && data != null) {
             Bundle extras = data.getExtras();
             if (extras == null) {
                 return;
