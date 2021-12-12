diff --git a/wallet/src/de/schildbach/wallet/ui/ReportIssueDialogFragment.java b/wallet/src/de/schildbach/wallet/ui/ReportIssueDialogFragment.java
index 21291de..a0b9e50 100644
--- a/wallet/src/de/schildbach/wallet/ui/ReportIssueDialogFragment.java
+++ b/wallet/src/de/schildbach/wallet/ui/ReportIssueDialogFragment.java
@@ -173,7 +173,7 @@
         super.onDismiss(dialog);
     }
 
-    private static void appendApplicationInfo(final Appendable report, final WalletApplication application)
+    private void appendApplicationInfo(final Appendable report, final WalletApplication application)
             throws IOException {
         final PackageInfo pi = application.packageInfo();
         final Configuration configuration = application.getConfiguration();
@@ -201,7 +201,7 @@
                 + (lastBackupTime > 0 ? String.format(Locale.US, "%tF %tT %tZ", calendar, calendar, calendar) : "none")
                 + "\n");
         report.append("Network: " + Constants.NETWORK_PARAMETERS.getId() + "\n");
-        final Wallet wallet = application.getWallet();
+        final Wallet wallet = viewModel.wallet.getValue();
         report.append("Encrypted: " + wallet.isEncrypted() + "\n");
         report.append("Keychain size: " + wallet.getKeyChainGroupSize() + "\n");
 
