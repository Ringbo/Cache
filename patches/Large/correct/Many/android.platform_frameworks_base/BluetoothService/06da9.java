diff --git a/core/java/android/server/BluetoothService.java b/core/java/android/server/BluetoothService.java
index 9e5abdc..d197341 100644
--- a/core/java/android/server/BluetoothService.java
+++ b/core/java/android/server/BluetoothService.java
@@ -1662,7 +1662,8 @@
             ifcg = service.getInterfaceConfig(iface);
             if (ifcg != null) {
                 ifcg.mask = InetAddress.getByName(BLUETOOTH_NETMASK);
-                if (ifcg.addr == null) {
+
+                if (ifcg.addr == null || ifcg.addr.equals(InetAddress.getByName("0.0.0.0"))) {
                     ifcg.addr = InetAddress.getByName(address);
                     ifcg.interfaceFlags = ifcg.interfaceFlags.replace("down", "up");
                 }
