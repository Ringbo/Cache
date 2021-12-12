diff --git a/packages/SettingsLib/tests/robotests/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceTest.java b/packages/SettingsLib/tests/robotests/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceTest.java
index e2ebbeb..9ac08f9 100644
--- a/packages/SettingsLib/tests/robotests/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceTest.java
+++ b/packages/SettingsLib/tests/robotests/src/com/android/settingslib/bluetooth/CachedBluetoothDeviceTest.java
@@ -51,7 +51,7 @@
     @Mock
     private A2dpProfile mA2dpProfile;
     @Mock
-    private HidProfile mHidProfile;
+    private PanProfile mPanProfile;
     @Mock
     private BluetoothDevice mDevice;
     private CachedBluetoothDevice mCachedDevice;
@@ -65,7 +65,7 @@
         when(mAdapter.getBluetoothState()).thenReturn(BluetoothAdapter.STATE_ON);
         when(mHfpProfile.isProfileReady()).thenReturn(true);
         when(mA2dpProfile.isProfileReady()).thenReturn(true);
-        when(mHidProfile.isProfileReady()).thenReturn(true);
+        when(mPanProfile.isProfileReady()).thenReturn(true);
         mCachedDevice = spy(
                 new CachedBluetoothDevice(mContext, mAdapter, mProfileManager, mDevice));
         doAnswer((invocation) -> mBatteryLevel).when(mCachedDevice).getBatteryLevel();
@@ -83,37 +83,37 @@
     @Test
     public void testGetConnectionSummary_testSingleProfileConnectDisconnect() {
         // Test without battery level
-        // Set HID profile to be connected and test connection state summary
-        mCachedDevice.onProfileStateChanged(mHidProfile, BluetoothProfile.STATE_CONNECTED);
+        // Set PAN profile to be connected and test connection state summary
+        mCachedDevice.onProfileStateChanged(mPanProfile, BluetoothProfile.STATE_CONNECTED);
         assertThat(mCachedDevice.getConnectionSummary()).isEqualTo(mContext.getString(
                 R.string.bluetooth_connected));
 
-        // Set HID profile to be disconnected and test connection state summary
-        mCachedDevice.onProfileStateChanged(mHidProfile, BluetoothProfile.STATE_DISCONNECTED);
+        // Set PAN profile to be disconnected and test connection state summary
+        mCachedDevice.onProfileStateChanged(mPanProfile, BluetoothProfile.STATE_DISCONNECTED);
         assertThat(mCachedDevice.getConnectionSummary()).isNull();
 
         // Test with battery level
         mBatteryLevel = 10;
-        // Set HID profile to be connected and test connection state summary
-        mCachedDevice.onProfileStateChanged(mHidProfile, BluetoothProfile.STATE_CONNECTED);
+        // Set PAN profile to be connected and test connection state summary
+        mCachedDevice.onProfileStateChanged(mPanProfile, BluetoothProfile.STATE_CONNECTED);
         assertThat(mCachedDevice.getConnectionSummary()).isEqualTo(mContext.getString(
                 R.string.bluetooth_connected_battery_level,
                 com.android.settingslib.Utils.formatPercentage(mBatteryLevel)));
 
-        // Set HID profile to be disconnected and test connection state summary
-        mCachedDevice.onProfileStateChanged(mHidProfile, BluetoothProfile.STATE_DISCONNECTED);
+        // Set PAN profile to be disconnected and test connection state summary
+        mCachedDevice.onProfileStateChanged(mPanProfile, BluetoothProfile.STATE_DISCONNECTED);
         assertThat(mCachedDevice.getConnectionSummary()).isNull();
 
         // Test with BluetoothDevice.BATTERY_LEVEL_UNKNOWN battery level
         mBatteryLevel = BluetoothDevice.BATTERY_LEVEL_UNKNOWN;
 
-        // Set HID profile to be connected and test connection state summary
-        mCachedDevice.onProfileStateChanged(mHidProfile, BluetoothProfile.STATE_CONNECTED);
+        // Set PAN profile to be connected and test connection state summary
+        mCachedDevice.onProfileStateChanged(mPanProfile, BluetoothProfile.STATE_CONNECTED);
         assertThat(mCachedDevice.getConnectionSummary()).isEqualTo(mContext.getString(
                 R.string.bluetooth_connected));
 
-        // Set HID profile to be disconnected and test connection state summary
-        mCachedDevice.onProfileStateChanged(mHidProfile, BluetoothProfile.STATE_DISCONNECTED);
+        // Set PAN profile to be disconnected and test connection state summary
+        mCachedDevice.onProfileStateChanged(mPanProfile, BluetoothProfile.STATE_DISCONNECTED);
         assertThat(mCachedDevice.getConnectionSummary()).isNull();
     }
 
@@ -121,10 +121,10 @@
     public void testGetConnectionSummary_testMultipleProfileConnectDisconnect() {
         mBatteryLevel = 10;
 
-        // Set HFP, A2DP and HID profile to be connected and test connection state summary
+        // Set HFP, A2DP and PAN profile to be connected and test connection state summary
         mCachedDevice.onProfileStateChanged(mHfpProfile, BluetoothProfile.STATE_CONNECTED);
         mCachedDevice.onProfileStateChanged(mA2dpProfile, BluetoothProfile.STATE_CONNECTED);
-        mCachedDevice.onProfileStateChanged(mHidProfile, BluetoothProfile.STATE_CONNECTED);
+        mCachedDevice.onProfileStateChanged(mPanProfile, BluetoothProfile.STATE_CONNECTED);
         assertThat(mCachedDevice.getConnectionSummary()).isEqualTo(mContext.getString(
                 R.string.bluetooth_connected_battery_level,
                 com.android.settingslib.Utils.formatPercentage(mBatteryLevel)));
@@ -149,7 +149,7 @@
                 com.android.settingslib.Utils.formatPercentage(mBatteryLevel)));
 
         // Disconnect all profiles and test connection state summary
-        mCachedDevice.onProfileStateChanged(mHidProfile, BluetoothProfile.STATE_DISCONNECTED);
+        mCachedDevice.onProfileStateChanged(mPanProfile, BluetoothProfile.STATE_DISCONNECTED);
         assertThat(mCachedDevice.getConnectionSummary()).isNull();
     }
 }
