diff --git a/wallet/src/de/schildbach/wallet/ui/backup/BackupWalletDialogFragment.java b/wallet/src/de/schildbach/wallet/ui/backup/BackupWalletDialogFragment.java
index 985ef42..8152ed5 100644
--- a/wallet/src/de/schildbach/wallet/ui/backup/BackupWalletDialogFragment.java
+++ b/wallet/src/de/schildbach/wallet/ui/backup/BackupWalletDialogFragment.java
@@ -343,7 +343,7 @@
         private static final String KEY_EXCEPTION_MESSAGE = "exception_message";
 
         public static void showDialog(final FragmentManager fm, final String exceptionMessage) {
-            final DialogFragment newFragment = new SuccessDialogFragment();
+            final DialogFragment newFragment = new ErrorDialogFragment();
             final Bundle args = new Bundle();
             args.putString(KEY_EXCEPTION_MESSAGE, exceptionMessage);
             newFragment.setArguments(args);
