diff --git a/core/java/android/bluetooth/le/ScanFilter.java b/core/java/android/bluetooth/le/ScanFilter.java
index 92a3817..17a802d 100644
--- a/core/java/android/bluetooth/le/ScanFilter.java
+++ b/core/java/android/bluetooth/le/ScanFilter.java
@@ -385,8 +385,12 @@
 
     @Override
     public int hashCode() {
-        return Objects.hash(mDeviceName, mDeviceAddress, mManufacturerId, mManufacturerData,
-                mManufacturerDataMask, mServiceDataUuid, mServiceData, mServiceDataMask,
+        return Objects.hash(mDeviceName, mDeviceAddress, mManufacturerId,
+                            Arrays.hashCode(mManufacturerData),
+                            Arrays.hashCode(mManufacturerDataMask),
+                            mServiceDataUuid,
+                            Arrays.hashCode(mServiceData),
+                            Arrays.hashCode(mServiceDataMask),
                 mServiceUuid, mServiceUuidMask);
     }
 
@@ -404,7 +408,7 @@
                         mManufacturerId == other.mManufacturerId &&
                 Objects.deepEquals(mManufacturerData, other.mManufacturerData) &&
                 Objects.deepEquals(mManufacturerDataMask, other.mManufacturerDataMask) &&
-                Objects.deepEquals(mServiceDataUuid, other.mServiceDataUuid) &&
+                Objects.equals(mServiceDataUuid, other.mServiceDataUuid) &&
                 Objects.deepEquals(mServiceData, other.mServiceData) &&
                 Objects.deepEquals(mServiceDataMask, other.mServiceDataMask) &&
                 Objects.equals(mServiceUuid, other.mServiceUuid) &&
