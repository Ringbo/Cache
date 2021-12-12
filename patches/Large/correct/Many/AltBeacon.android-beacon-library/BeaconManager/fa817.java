diff --git a/src/main/java/org/altbeacon/beacon/BeaconManager.java b/src/main/java/org/altbeacon/beacon/BeaconManager.java
index a880c42..b962a23 100644
--- a/src/main/java/org/altbeacon/beacon/BeaconManager.java
+++ b/src/main/java/org/altbeacon/beacon/BeaconManager.java
@@ -276,10 +276,12 @@
     /**
      * Determines if this BeaconManager instance is part of the process hosting the beacon scanning
      * service.  This is normally true, except when scanning is hosted in a different service.
-     * This will return null until the scanning service starts up, at which time it will be known.
+     * This will always return false until the scanning service starts up, at which time it will be
+     * known.
+     *
      * @return
      */
-    public Boolean isScannerInSameProcess() {
+    public boolean isScannerInSameProcess() {
         return mScannerInSameProcess;
     }
 
@@ -720,12 +722,12 @@
      * @see #isScannerInSameProcess()
      */
     public void applySettings() {
-        if (isScannerInSameProcess() != null && isScannerInSameProcess() == false) {
+        if (isAnyConsumerBound() && isScannerInSameProcess() == false) {
             LogManager.d(TAG, "Synchronizing settings to service");
             syncSettingsToService();
         }
         else {
-            if (isScannerInSameProcess() == null) {
+            if (isAnyConsumerBound() == false) {
                 LogManager.d(TAG, "Not synchronizing settings to service, as it has not started up yet");
 
             }
