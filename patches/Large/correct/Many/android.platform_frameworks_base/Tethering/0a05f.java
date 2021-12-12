diff --git a/services/java/com/android/server/connectivity/Tethering.java b/services/java/com/android/server/connectivity/Tethering.java
index 8d4f244..1d20074 100644
--- a/services/java/com/android/server/connectivity/Tethering.java
+++ b/services/java/com/android/server/connectivity/Tethering.java
@@ -431,7 +431,7 @@
                 try {
                     NetworkInfo info = service.getNetworkInfo(ConnectivityManager.TYPE_MOBILE_DUN);
                     int msg;
-                    if (info.isConnected() == true) {
+                    if (info != null && info.isConnected() == true) {
                         msg = TetherMasterSM.CMD_CELL_DUN_ENABLED;
                     } else {
                         msg = TetherMasterSM.CMD_CELL_DUN_DISABLED;
