diff --git a/services/core/java/com/android/server/connectivity/NetworkMonitor.java b/services/core/java/com/android/server/connectivity/NetworkMonitor.java
index 39718ea..9fa362c 100644
--- a/services/core/java/com/android/server/connectivity/NetworkMonitor.java
+++ b/services/core/java/com/android/server/connectivity/NetworkMonitor.java
@@ -678,7 +678,8 @@
                 httpResponseCode = 204;
             }
 
-            sendNetworkConditionsBroadcast(true /* response received */, httpResponseCode == 204,
+            sendNetworkConditionsBroadcast(true /* response received */,
+                    httpResponseCode != 204 /* isCaptivePortal */,
                     requestTimestamp, responseTimestamp);
         } catch (IOException e) {
             if (DBG) log("Probably not a portal: exception " + e);
