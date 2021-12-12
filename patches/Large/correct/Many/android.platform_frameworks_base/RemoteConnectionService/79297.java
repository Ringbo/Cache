diff --git a/telecomm/java/android/telecom/RemoteConnectionService.java b/telecomm/java/android/telecom/RemoteConnectionService.java
index de1dc17..af4ee22 100644
--- a/telecomm/java/android/telecom/RemoteConnectionService.java
+++ b/telecomm/java/android/telecom/RemoteConnectionService.java
@@ -365,7 +365,7 @@
     }
 
     private boolean hasConnection(String callId) {
-        return mConferenceById.containsKey(callId);
+        return mConnectionById.containsKey(callId);
     }
 
     private RemoteConnection findConnectionForAction(
