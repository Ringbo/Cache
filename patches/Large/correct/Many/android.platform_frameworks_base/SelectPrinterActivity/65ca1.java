diff --git a/packages/PrintSpooler/src/com/android/printspooler/ui/SelectPrinterActivity.java b/packages/PrintSpooler/src/com/android/printspooler/ui/SelectPrinterActivity.java
index fcc9f6a..7704fa6 100644
--- a/packages/PrintSpooler/src/com/android/printspooler/ui/SelectPrinterActivity.java
+++ b/packages/PrintSpooler/src/com/android/printspooler/ui/SelectPrinterActivity.java
@@ -319,7 +319,7 @@
         }
         TextView titleView = (TextView) findViewById(R.id.title);
         View progressBar = findViewById(R.id.progress_bar);
-        if (mEnabledPrintServices.size() > 0) {
+        if (mEnabledPrintServices.size() == 0) {
             titleView.setText(R.string.print_no_print_services);
             progressBar.setVisibility(View.GONE);
         } else if (adapter.getUnfilteredCount() <= 0) {
