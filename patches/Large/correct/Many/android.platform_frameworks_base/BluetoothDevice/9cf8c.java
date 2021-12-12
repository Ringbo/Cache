diff --git a/core/java/android/bluetooth/BluetoothDevice.java b/core/java/android/bluetooth/BluetoothDevice.java
index f158f5f..6bc88b0 100644
--- a/core/java/android/bluetooth/BluetoothDevice.java
+++ b/core/java/android/bluetooth/BluetoothDevice.java
@@ -1669,7 +1669,7 @@
      */
     public BluetoothGatt connectGatt(Context context, boolean autoConnect,
                                      BluetoothGattCallback callback, int transport) {
-        return (connectGatt(context, autoConnect,callback, TRANSPORT_AUTO, PHY_LE_1M_MASK));
+        return (connectGatt(context, autoConnect,callback, transport, PHY_LE_1M_MASK));
     }
 
     /**
@@ -1693,7 +1693,7 @@
      */
     public BluetoothGatt connectGatt(Context context, boolean autoConnect,
                                      BluetoothGattCallback callback, int transport, int phy) {
-        return connectGatt(context, autoConnect,callback, TRANSPORT_AUTO, PHY_LE_1M_MASK, null);
+        return connectGatt(context, autoConnect,callback, transport, phy, null);
     }
 
     /**
