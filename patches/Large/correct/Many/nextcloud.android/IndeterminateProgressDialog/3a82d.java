diff --git a/src/com/owncloud/android/ui/dialog/IndeterminateProgressDialog.java b/src/com/owncloud/android/ui/dialog/IndeterminateProgressDialog.java
index 6f4b680..442e706 100644
--- a/src/com/owncloud/android/ui/dialog/IndeterminateProgressDialog.java
+++ b/src/com/owncloud/android/ui/dialog/IndeterminateProgressDialog.java
@@ -59,7 +59,7 @@
     @Override
     public Dialog onCreateDialog(Bundle savedInstanceState) {
         /// create indeterminate progress dialog
-        final ProgressDialog dialog = new ProgressDialog(getActivity());
+        final ProgressDialog dialog = new ProgressDialog(getActivity(), R.style.ProgressDialogTheme);
         dialog.setIndeterminate(true);
         
         /// set message
