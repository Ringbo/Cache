diff --git a/core/java/android/bluetooth/le/BluetoothLeScanner.java b/core/java/android/bluetooth/le/BluetoothLeScanner.java
index 5246513..f3f0ae5 100644
--- a/core/java/android/bluetooth/le/BluetoothLeScanner.java
+++ b/core/java/android/bluetooth/le/BluetoothLeScanner.java
@@ -360,7 +360,7 @@
                 // Scan stopped.
                 if (mScannerId == -1) return;
                 try {
-                    mBluetoothGatt.registerScanner(this);
+                    mBluetoothGatt.registerScanner(this, mWorkSource);
                     wait(REGISTRATION_CALLBACK_TIMEOUT_MILLIS);
                 } catch (InterruptedException | RemoteException e) {
                     Log.e(TAG, "application registeration exception", e);
@@ -424,7 +424,7 @@
                         } else {
                             mScannerId = scannerId;
                             mBluetoothGatt.startScan(mScannerId, mSettings, mFilters,
-                                    mWorkSource, mResultStorages,
+                                    mResultStorages,
                                     ActivityThread.currentOpPackageName());
                         }
                     } catch (RemoteException e) {
