diff --git a/telecomm/java/android/telecom/TelecomManager.java b/telecomm/java/android/telecom/TelecomManager.java
index 8d6bda8..1431eb8 100644
--- a/telecomm/java/android/telecom/TelecomManager.java
+++ b/telecomm/java/android/telecom/TelecomManager.java
@@ -921,7 +921,7 @@
     public void silenceRinger() {
         try {
             if (isServiceConnected()) {
-                getTelecomService().silenceRinger();
+                getTelecomService().silenceRinger(mContext.getOpPackageName());
             }
         } catch (RemoteException e) {
             Log.e(TAG, "Error calling ITelecomService#silenceRinger", e);
@@ -1029,7 +1029,7 @@
         ITelecomService service = getTelecomService();
         if (service != null) {
             try {
-                return service.handlePinMmi(dialString);
+                return service.handlePinMmi(dialString, mContext.getOpPackageName());
             } catch (RemoteException e) {
                 Log.e(TAG, "Error calling ITelecomService#handlePinMmi", e);
             }
@@ -1053,7 +1053,8 @@
         ITelecomService service = getTelecomService();
         if (service != null) {
             try {
-                return service.handlePinMmiForPhoneAccount(accountHandle, dialString);
+                return service.handlePinMmiForPhoneAccount(accountHandle, dialString,
+                        mContext.getOpPackageName());
             } catch (RemoteException e) {
                 Log.e(TAG, "Error calling ITelecomService#handlePinMmi", e);
             }
@@ -1071,7 +1072,7 @@
         ITelecomService service = getTelecomService();
         if (service != null && accountHandle != null) {
             try {
-                return service.getAdnUriForPhoneAccount(accountHandle);
+                return service.getAdnUriForPhoneAccount(accountHandle, mContext.getOpPackageName());
             } catch (RemoteException e) {
                 Log.e(TAG, "Error calling ITelecomService#getAdnUriForPhoneAccount", e);
             }
@@ -1089,7 +1090,7 @@
         ITelecomService service = getTelecomService();
         if (service != null) {
             try {
-                service.cancelMissedCallsNotification();
+                service.cancelMissedCallsNotification(mContext.getOpPackageName());
             } catch (RemoteException e) {
                 Log.e(TAG, "Error calling ITelecomService#cancelMissedCallsNotification", e);
             }
