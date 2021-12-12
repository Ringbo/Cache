diff --git a/core/java/android/bluetooth/BluetoothSap.java b/core/java/android/bluetooth/BluetoothSap.java
index 014cb22..e70c936 100644
--- a/core/java/android/bluetooth/BluetoothSap.java
+++ b/core/java/android/bluetooth/BluetoothSap.java
@@ -138,7 +138,7 @@
     }
 
     boolean doBind() {
-        Intent intent = new Intent(IBluetoothMap.class.getName());
+        Intent intent = new Intent(IBluetoothSap.class.getName());
         ComponentName comp = intent.resolveSystemService(mContext.getPackageManager(), 0);
         intent.setComponent(comp);
         if (comp == null || !mContext.bindServiceAsUser(intent, mConnection, 0,
