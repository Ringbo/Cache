diff --git a/services/java/com/android/server/wifi/WifiController.java b/services/java/com/android/server/wifi/WifiController.java
index 4d7c434..6e6b8cc 100644
--- a/services/java/com/android/server/wifi/WifiController.java
+++ b/services/java/com/android/server/wifi/WifiController.java
@@ -166,7 +166,7 @@
         registerForStayAwakeModeChange(handler);
         readWifiIdleTime();
         registerForWifiIdleTimeChange(handler);
-        readStayAwakeConditions();
+        readWifiSleepPolicy();
         registerForWifiSleepPolicyChange(handler);
     }
 
