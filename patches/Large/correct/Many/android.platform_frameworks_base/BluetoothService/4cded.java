diff --git a/core/java/android/server/BluetoothService.java b/core/java/android/server/BluetoothService.java
old mode 100644
new mode 100755
index 2c79385..60bee9a
--- a/core/java/android/server/BluetoothService.java
+++ b/core/java/android/server/BluetoothService.java
@@ -1104,7 +1104,7 @@
     }
 
     /*package*/ synchronized boolean setBondState(String address, int state, int reason) {
-        mBondState.setBondState(address.toUpperCase(), state);
+        mBondState.setBondState(address.toUpperCase(), state, reason);
         return true;
     }
 
