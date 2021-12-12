diff --git a/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java b/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java
index 5cbf661..a03b95f 100644
--- a/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java
+++ b/collect_app/src/main/java/org/odk/collect/android/activities/FormEntryActivity.java
@@ -2231,7 +2231,7 @@
     protected Dialog onCreateDialog(int id) {
         switch (id) {
             case PROGRESS_DIALOG:
-                Timber.e("Creating PROGRESS_DIALOG");
+                Timber.i("Creating PROGRESS_DIALOG");
                 Collect.getInstance()
                         .getActivityLogger()
                         .logInstanceAction(this, "onCreateDialog.PROGRESS_DIALOG",
@@ -2263,7 +2263,7 @@
                         loadingButtonListener);
                 return progressDialog;
             case SAVING_DIALOG:
-                Timber.e("Creating SAVING_DIALOG");
+                Timber.i("Creating SAVING_DIALOG");
                 Collect.getInstance()
                         .getActivityLogger()
                         .logInstanceAction(this, "onCreateDialog.SAVING_DIALOG",
@@ -2323,7 +2323,7 @@
      * Dismiss any showing dialogs that we manually manage.
      */
     private void dismissDialogs() {
-        Timber.e("Dismiss dialogs");
+        Timber.i("Dismiss dialogs");
         if (alertDialog != null && alertDialog.isShowing()) {
             alertDialog.dismiss();
         }
