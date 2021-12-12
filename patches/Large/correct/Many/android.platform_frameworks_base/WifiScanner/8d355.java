diff --git a/wifi/java/android/net/wifi/WifiScanner.java b/wifi/java/android/net/wifi/WifiScanner.java
index 73ddbbc..f8c1ea3 100644
--- a/wifi/java/android/net/wifi/WifiScanner.java
+++ b/wifi/java/android/net/wifi/WifiScanner.java
@@ -810,19 +810,17 @@
     }
     /**
      * Stop an ongoing wifi PNO scan
-     * @param pnoSettings specifies various parameters for PNO; for more information look at
-     * {@link PnoSettings}
      * @param listener specifies which scan to cancel; must be same object as passed in {@link
      *  #startPnoScan}
      * TODO(rpius): Check if we can remove pnoSettings param in stop.
      * {@hide}
      */
-    public void stopPnoScan(PnoSettings pnoSettings, ScanListener listener) {
+    public void stopPnoScan(ScanListener listener) {
         Preconditions.checkNotNull(listener, "listener cannot be null");
         int key = removeListener(listener);
         if (key == INVALID_KEY) return;
         validateChannel();
-        sAsyncChannel.sendMessage(CMD_STOP_PNO_SCAN, 0, key, pnoSettings);
+        sAsyncChannel.sendMessage(CMD_STOP_PNO_SCAN, 0, key);
     }
 
     /** specifies information about an access point of interest */
