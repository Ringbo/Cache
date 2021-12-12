diff --git a/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java b/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java
index 0cf32e8..410894e 100644
--- a/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java
+++ b/src/main/java/com/radiusnetworks/ibeacon/IBeaconManager.java
@@ -191,11 +191,11 @@
 	}
 	/**
 	 * Check if Bluetooth LE is supported by this Android device, and if so, make sure it is enabled.
-	 * Throws a BleNotAvailableException if Bluetooth LE is not supported.  (Note: The Android emulator will do this)
+	 * @throws  BleNotAvailableException if Bluetooth LE is not supported.  (Note: The Android emulator will do this)
 	 * @return false if it is supported and not enabled
 	 */
     @TargetApi(18)
-	public boolean checkAvailability() {
+	public boolean checkAvailability() throws BleNotAvailableException {
         if (android.os.Build.VERSION.SDK_INT < 18) {
             throw new BleNotAvailableException("Bluetooth LE not supported by this device");
         }
