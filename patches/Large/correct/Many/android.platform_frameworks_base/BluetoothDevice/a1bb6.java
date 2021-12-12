diff --git a/core/java/android/bluetooth/BluetoothDevice.java b/core/java/android/bluetooth/BluetoothDevice.java
index e8ad69d..7ff37d2 100644
--- a/core/java/android/bluetooth/BluetoothDevice.java
+++ b/core/java/android/bluetooth/BluetoothDevice.java
@@ -1658,7 +1658,7 @@
      */
     public BluetoothGatt connectGatt(Context context, boolean autoConnect,
                                      BluetoothGattCallback callback, int transport) {
-        return (connectGatt(context, autoConnect,callback, TRANSPORT_AUTO, PHY_LE_1M_MASK));
+        return (connectGatt(context, autoConnect,callback, transport, PHY_LE_1M_MASK));
     }
 
     /**
@@ -1682,7 +1682,7 @@
      */
     public BluetoothGatt connectGatt(Context context, boolean autoConnect,
                                      BluetoothGattCallback callback, int transport, int phy) {
-        return connectGatt(context, autoConnect,callback, TRANSPORT_AUTO, PHY_LE_1M_MASK, null);
+        return connectGatt(context, autoConnect,callback, transport, phy, null);
     }
 
     /**
