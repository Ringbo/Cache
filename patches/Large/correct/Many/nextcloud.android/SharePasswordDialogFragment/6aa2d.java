diff --git a/src/com/owncloud/android/ui/dialog/SharePasswordDialogFragment.java b/src/com/owncloud/android/ui/dialog/SharePasswordDialogFragment.java
index 1b7def2..b6e2df6 100644
--- a/src/com/owncloud/android/ui/dialog/SharePasswordDialogFragment.java
+++ b/src/com/owncloud/android/ui/dialog/SharePasswordDialogFragment.java
@@ -83,7 +83,8 @@
         inputText.requestFocus();
 
         // Build the dialog
-        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
+        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),
+                R.style.Theme_ownCloud_Dialog_NoButtonBarStyle);
         builder.setView(v)
                .setPositiveButton(R.string.common_ok, this)
                .setNegativeButton(R.string.common_cancel, this)
