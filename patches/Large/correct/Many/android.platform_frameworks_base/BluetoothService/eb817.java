diff --git a/core/java/android/server/BluetoothService.java b/core/java/android/server/BluetoothService.java
old mode 100644
new mode 100755
index 4d4d309..6144766
--- a/core/java/android/server/BluetoothService.java
+++ b/core/java/android/server/BluetoothService.java
@@ -1351,7 +1351,7 @@
     }
 
     /*package*/ synchronized boolean setBondState(String address, int state, int reason) {
-        mBondState.setBondState(address.toUpperCase(), state);
+        mBondState.setBondState(address.toUpperCase(), state, reason);
         return true;
     }
 
