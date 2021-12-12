diff --git a/core/java/android/bluetooth/le/ScanRecord.java b/core/java/android/bluetooth/le/ScanRecord.java
index e7f33ff1..2f3d06f 100644
--- a/core/java/android/bluetooth/le/ScanRecord.java
+++ b/core/java/android/bluetooth/le/ScanRecord.java
@@ -257,9 +257,11 @@
             }
             return new ScanRecord(serviceUuids, manufacturerData, serviceData,
                     advertiseFlag, txPowerLevel, localName, scanRecord);
-        } catch (IndexOutOfBoundsException e) {
+        } catch (Exception e) {
             Log.e(TAG, "unable to parse scan record: " + Arrays.toString(scanRecord));
-            return null;
+            // As the record is invalid, ignore all the parsed results for this packet
+            // and return an empty record with raw scanRecord bytes in results
+            return new ScanRecord(null, null, null, -1, Integer.MIN_VALUE, null, scanRecord);
         }
     }
 
