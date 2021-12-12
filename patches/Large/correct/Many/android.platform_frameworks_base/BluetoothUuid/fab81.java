diff --git a/core/java/android/bluetooth/BluetoothUuid.java b/core/java/android/bluetooth/BluetoothUuid.java
index 5bfc54d..76cb3f5 100644
--- a/core/java/android/bluetooth/BluetoothUuid.java
+++ b/core/java/android/bluetooth/BluetoothUuid.java
@@ -232,7 +232,7 @@
      */
     public static int getServiceIdentifierFromParcelUuid(ParcelUuid parcelUuid) {
         UUID uuid = parcelUuid.getUuid();
-        long value = (uuid.getMostSignificantBits() & 0x0000FFFF00000000L) >>> 32;
+        long value = (uuid.getMostSignificantBits() & 0xFFFFFFFF00000000L) >>> 32;
         return (int) value;
     }
 
