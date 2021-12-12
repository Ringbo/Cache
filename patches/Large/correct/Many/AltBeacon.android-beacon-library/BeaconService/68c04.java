diff --git a/src/main/java/org/altbeacon/beacon/service/BeaconService.java b/src/main/java/org/altbeacon/beacon/service/BeaconService.java
index 73545de..e296ee6 100644
--- a/src/main/java/org/altbeacon/beacon/service/BeaconService.java
+++ b/src/main/java/org/altbeacon/beacon/service/BeaconService.java
@@ -336,7 +336,7 @@
         LogManager.i(TAG, "onDestroy called.  stopping scanning");
         handler.removeCallbacksAndMessages(null);
 
-        if (mScanHelper.getCycledScanner() == null) {
+        if (mScanHelper.getCycledScanner() != null) {
             mScanHelper.getCycledScanner().stop();
             mScanHelper.getCycledScanner().destroy();
         }
