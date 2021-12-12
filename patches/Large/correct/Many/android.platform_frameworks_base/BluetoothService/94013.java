diff --git a/core/java/android/server/BluetoothService.java b/core/java/android/server/BluetoothService.java
old mode 100644
new mode 100755
index f98d275..b3cbf50
--- a/core/java/android/server/BluetoothService.java
+++ b/core/java/android/server/BluetoothService.java
@@ -1104,7 +1104,7 @@
     }
 
     /*package*/ synchronized boolean setBondState(String address, int state, int reason) {
-        mBondState.setBondState(address.toUpperCase(), state);
+        mBondState.setBondState(address.toUpperCase(), state, reason);
         return true;
     }
 
