diff --git a/packages/PrintSpooler/src/com/android/printspooler/ui/PrintActivity.java b/packages/PrintSpooler/src/com/android/printspooler/ui/PrintActivity.java
index e758835..d153107 100644
--- a/packages/PrintSpooler/src/com/android/printspooler/ui/PrintActivity.java
+++ b/packages/PrintSpooler/src/com/android/printspooler/ui/PrintActivity.java
@@ -973,7 +973,7 @@
         if (newFragment != null) {
             transaction.add(R.id.embedded_content_container, newFragment, FRAGMENT_TAG);
         }
-        transaction.commit();
+        transaction.commitAllowingStateLoss();
         getFragmentManager().executePendingTransactions();
     }
 
