diff --git a/core/java/android/app/AlertDialog.java b/core/java/android/app/AlertDialog.java
index abe12dc..7824072 100644
--- a/core/java/android/app/AlertDialog.java
+++ b/core/java/android/app/AlertDialog.java
@@ -1082,7 +1082,8 @@
          * create and display the dialog.
          */
         public AlertDialog create() {
-            final AlertDialog dialog = new AlertDialog(P.mContext);
+            // Context has already been wrapped with the appropriate theme.
+            final AlertDialog dialog = new AlertDialog(P.mContext, 0, false);
             P.apply(dialog.mAlert);
             dialog.setCancelable(P.mCancelable);
             if (P.mCancelable) {
