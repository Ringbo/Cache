diff --git a/WordPress/src/main/java/org/wordpress/android/WordPress.java b/WordPress/src/main/java/org/wordpress/android/WordPress.java
index f3d2754..ac25bc2 100644
--- a/WordPress/src/main/java/org/wordpress/android/WordPress.java
+++ b/WordPress/src/main/java/org/wordpress/android/WordPress.java
@@ -539,7 +539,7 @@
             super.onPreExecute();
             Context context = mWeakContext.get();
             if (context != null) {
-                mProgressDialog = ProgressDialog.show(context, null, context.getText(R.string.signing_out));
+                mProgressDialog = ProgressDialog.show(context, null, context.getText(R.string.signing_out), false);
             }
         }
 
