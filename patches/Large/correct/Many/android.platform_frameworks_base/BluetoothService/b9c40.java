diff --git a/core/java/android/server/BluetoothService.java b/core/java/android/server/BluetoothService.java
index d1dd311..bcc570b 100644
--- a/core/java/android/server/BluetoothService.java
+++ b/core/java/android/server/BluetoothService.java
@@ -504,7 +504,7 @@
         // disabled.
         private final ArrayList<String> mAutoPairingNameBlacklist =
                 new ArrayList<String>(Arrays.asList(
-                        "Motorola IHF1000", "i.TechBlueBAND", "X5 Stereo v1.3"));
+                        "Motorola IHF1000", "i.TechBlueBAND", "X5 Stereo v1.3", "BMW", "Audi"));
 
         // If this is an outgoing connection, store the address.
         // There can be only 1 pending outgoing connection at a time,
@@ -586,7 +586,8 @@
             String name = getRemoteName(address);
             if (name != null) {
                 for (String blacklistName : mAutoPairingNameBlacklist) {
-                    if (name.equals(blacklistName)) return true;
+                    if (name.equals(blacklistName) ||
+                            name.startsWith(blacklistName)) return true;
                 }
             }
             return false;
