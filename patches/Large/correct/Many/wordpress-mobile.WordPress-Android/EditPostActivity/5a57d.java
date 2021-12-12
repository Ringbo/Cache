diff --git a/src/org/wordpress/android/ui/posts/EditPostActivity.java b/src/org/wordpress/android/ui/posts/EditPostActivity.java
index 0f50a33..b8ae30f 100644
--- a/src/org/wordpress/android/ui/posts/EditPostActivity.java
+++ b/src/org/wordpress/android/ui/posts/EditPostActivity.java
@@ -205,7 +205,7 @@
                     if (savedInstanceState.getString("mediaCapturePath") != null)
                         mMediaCapturePath = savedInstanceState.getString("mediaCapturePath");
                 } else {
-                    mQuickMediaType = extras.getInt("quick-media");
+                    mQuickMediaType = extras.getInt("quick-media", -1);
                 }
 
                 if (extras.getBoolean("isQuickPress")) {
@@ -1401,7 +1401,7 @@
             AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(EditPostActivity.this);
             dialogBuilder.setTitle(getResources().getText(R.string.empty_fields));
             dialogBuilder.setMessage(getResources().getText(R.string.title_post_required));
-            dialogBuilder.setPositiveButton(getString(R.id.ok), new DialogInterface.OnClickListener() {
+            dialogBuilder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                 public void onClick(DialogInterface dialog, int whichButton) {
                     dialog.dismiss();
                 }
