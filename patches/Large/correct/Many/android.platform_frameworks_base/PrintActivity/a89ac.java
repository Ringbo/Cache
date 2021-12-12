diff --git a/packages/PrintSpooler/src/com/android/printspooler/ui/PrintActivity.java b/packages/PrintSpooler/src/com/android/printspooler/ui/PrintActivity.java
index 84ada6f..20254f0 100644
--- a/packages/PrintSpooler/src/com/android/printspooler/ui/PrintActivity.java
+++ b/packages/PrintSpooler/src/com/android/printspooler/ui/PrintActivity.java
@@ -286,7 +286,9 @@
                 mFileProvider, new RemotePrintDocument.RemoteAdapterDeathObserver() {
             @Override
             public void onDied() {
-                if (isFinishing()) {
+                // If we are finishing or we are in a state that we do not need any
+                // data from the printing app, then no need to finish.
+                if (isFinishing() || (isFinalState(mState) && !mPrintedDocument.isUpdating())) {
                     return;
                 }
                 setState(STATE_PRINT_CANCELED);
