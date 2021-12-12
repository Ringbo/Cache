diff --git a/wifi/java/android/net/wifi/WifiStateMachine.java b/wifi/java/android/net/wifi/WifiStateMachine.java
index bb628c8..8cdfe03 100644
--- a/wifi/java/android/net/wifi/WifiStateMachine.java
+++ b/wifi/java/android/net/wifi/WifiStateMachine.java
@@ -3544,7 +3544,8 @@
                     if (message.arg1 == mTetherToken) {
                         loge("Failed to get tether update, shutdown soft access point");
                         transitionTo(mSoftApStartedState);
-                        sendMessage(CMD_STOP_AP);
+                        // Needs to be first thing handled
+                        sendMessageAtFrontOfQueue(CMD_STOP_AP);
                     }
                     break;
                 case CMD_START_SUPPLICANT:
@@ -3609,13 +3610,15 @@
                     if (isWifiTethered(stateChange.active)) break;
 
                     transitionTo(mSoftApStartedState);
-                    sendMessage(CMD_STOP_AP);
+                    // Needs to be first thing handled
+                    sendMessageAtFrontOfQueue(CMD_STOP_AP);
                     break;
                 case CMD_TETHER_NOTIFICATION_TIMED_OUT:
                     if (message.arg1 == mTetherToken) {
                         loge("Failed to get tether update, force stop access point");
                         transitionTo(mSoftApStartedState);
-                        sendMessage(CMD_STOP_AP);
+                        // Needs to be first thing handled
+                        sendMessageAtFrontOfQueue(CMD_STOP_AP);
                     }
                     break;
                 case CMD_START_SUPPLICANT:
