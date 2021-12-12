diff --git a/core/java/android/bluetooth/BluetoothGattCharacteristic.java b/core/java/android/bluetooth/BluetoothGattCharacteristic.java
index a86677c..7cdcc2c 100644
--- a/core/java/android/bluetooth/BluetoothGattCharacteristic.java
+++ b/core/java/android/bluetooth/BluetoothGattCharacteristic.java
@@ -502,7 +502,7 @@
      * @return Cached value of the characteristic
      */
     public String getStringValue(int offset) {
-        if (offset > mValue.length) return null;
+        if (mValue == null || offset > mValue.length) return null;
         byte[] strBytes = new byte[mValue.length - offset];
         for (int i=0; i != (mValue.length-offset); ++i) strBytes[i] = mValue[offset+i];
         return new String(strBytes);
