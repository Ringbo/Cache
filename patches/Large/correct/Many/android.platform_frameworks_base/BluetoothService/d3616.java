diff --git a/core/java/android/server/BluetoothService.java b/core/java/android/server/BluetoothService.java
index 31e5a7b..f00389b 100644
--- a/core/java/android/server/BluetoothService.java
+++ b/core/java/android/server/BluetoothService.java
@@ -919,7 +919,7 @@
                 Log.e(TAG, "Error:Adapter Property at index" + i + "is null");
                 continue;
             }
-            if (name.equals("Devices")) {
+            if (name.equals("Devices") || name.equals("UUIDs")) {
                 StringBuilder str = new StringBuilder();
                 len = Integer.valueOf(properties[++i]);
                 for (int j = 0; j < len; j++) {
