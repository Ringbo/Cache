diff --git a/packages/SettingsLib/src/com/android/settingslib/bluetooth/PbapClientProfile.java b/packages/SettingsLib/src/com/android/settingslib/bluetooth/PbapClientProfile.java
index d7c9eab..72a3b3a 100755
--- a/packages/SettingsLib/src/com/android/settingslib/bluetooth/PbapClientProfile.java
+++ b/packages/SettingsLib/src/com/android/settingslib/bluetooth/PbapClientProfile.java
@@ -145,7 +145,7 @@
                 }
             }
             for (BluetoothDevice src : srcs) {
-                mService.disconnect(device);
+                mService.disconnect(src);
             }
         }
         Log.d(TAG,"PBAPClientProfile attempting to connect to " + device.getAddress());
