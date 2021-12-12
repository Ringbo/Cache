diff --git a/services/core/java/com/android/server/InputMethodManagerService.java b/services/core/java/com/android/server/InputMethodManagerService.java
index 122786f..c8718e3 100644
--- a/services/core/java/com/android/server/InputMethodManagerService.java
+++ b/services/core/java/com/android/server/InputMethodManagerService.java
@@ -2606,15 +2606,15 @@
                 return true;
             case MSG_SET_USER_ACTION_NOTIFICATION_SEQUENCE_NUMBER: {
                 final int sequenceNumber = msg.arg1;
-                final IInputMethodClient client = (IInputMethodClient)msg.obj;
+                final ClientState clientState = (ClientState)msg.obj;
                 try {
-                    client.setUserActionNotificationSequenceNumber(sequenceNumber);
+                    clientState.client.setUserActionNotificationSequenceNumber(sequenceNumber);
                 } catch (RemoteException e) {
                     Slog.w(TAG, "Got RemoteException sending "
                             + "setUserActionNotificationSequenceNumber("
                             + sequenceNumber + ") notification to pid "
-                            + ((ClientState)msg.obj).pid + " uid "
-                            + ((ClientState)msg.obj).uid);
+                            + clientState.pid + " uid "
+                            + clientState.uid);
                 }
                 return true;
             }
@@ -3036,7 +3036,7 @@
         if (mCurClient != null && mCurClient.client != null) {
             executeOrSendMessage(mCurClient.client, mCaller.obtainMessageIO(
                     MSG_SET_USER_ACTION_NOTIFICATION_SEQUENCE_NUMBER,
-                    mCurUserActionNotificationSequenceNumber, mCurClient.client));
+                    mCurUserActionNotificationSequenceNumber, mCurClient));
         }
 
         // Set Subtype here
