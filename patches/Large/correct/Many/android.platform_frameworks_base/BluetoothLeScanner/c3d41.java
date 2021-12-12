diff --git a/core/java/android/bluetooth/le/BluetoothLeScanner.java b/core/java/android/bluetooth/le/BluetoothLeScanner.java
index b63c614..35c526f 100644
--- a/core/java/android/bluetooth/le/BluetoothLeScanner.java
+++ b/core/java/android/bluetooth/le/BluetoothLeScanner.java
@@ -300,7 +300,7 @@
                 // Scan stopped.
                 if (mScannerId == -1) return;
                 try {
-                    mBluetoothGatt.registerScanner(this);
+                    mBluetoothGatt.registerScanner(this, mWorkSource);
                     wait(REGISTRATION_CALLBACK_TIMEOUT_MILLIS);
                 } catch (InterruptedException | RemoteException e) {
                     Log.e(TAG, "application registeration exception", e);
@@ -364,7 +364,7 @@
                         } else {
                             mScannerId = scannerId;
                             mBluetoothGatt.startScan(mScannerId, mSettings, mFilters,
-                                    mWorkSource, mResultStorages,
+                                    mResultStorages,
                                     ActivityThread.currentOpPackageName());
                         }
                     } catch (RemoteException e) {
